package com.sapient.onlineshopping.resources;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import com.sapient.onlineshopping.service.IProductCatalogService;
import com.sapient.onlineshopping.service.Impl.SseService;

@RestController
public class ProductCatalogResources {

	@Autowired
	SseService service;
	
	@Autowired
	IProductCatalogService iProductCatalogService;

	@GetMapping("/productcatalog/{sku}")
	public ResponseEntity<SseEmitter> doNotify(@PathVariable("sku") Integer sku)
			throws InterruptedException, IOException {
		final SseEmitter emitter = new SseEmitter();
		service.addEmitter(emitter);
		service.changeNofiy(sku);
		emitter.onCompletion(() -> service.removeEmitter(emitter));
		emitter.onTimeout(() -> service.removeEmitter(emitter));
		return new ResponseEntity<>(emitter, HttpStatus.OK);
	}

	@PostMapping("/productcatalog/{sku}/{quantity}")
	public String saleProduct(@PathVariable("sku") Integer sku, @PathVariable("quantity") Integer quantity)
			throws InterruptedException, IOException {		
		System.out.println(sku +" <0000> "+quantity);
		this.iProductCatalogService.updateSoldProduct(sku,quantity);
		service.changeNofiy(sku);
		return "OK";
	}

}