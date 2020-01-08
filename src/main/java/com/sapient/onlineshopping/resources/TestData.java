/**
 * 			
 */
package com.sapient.onlineshopping.resources;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import com.sapient.onlineshopping.entity.ProductCatalog;
import com.sapient.onlineshopping.service.IProductCatalogService;

/**
 * @author b.singh
 *
 */
@RestController
public class TestData {

	@Autowired
	IProductCatalogService productCatalogService;

	@GetMapping(value = "/product-catalogs/{proudctsku}")
	public SseEmitter getProductCatalog(@PathVariable("proudctsku") Integer prouctSku) {
		System.out.println(prouctSku);
		SseEmitter sseEmitter = new SseEmitter();
		ExecutorService executor = Executors.newSingleThreadExecutor();

		executor.execute(() -> {
//			List<ProductCatalog> productCatalogs = this.productCatalogService.getByProductSku(prouctSku);
			List<ProductCatalog> productCatalogs = this.productCatalogService.getAllProductCatalogs();

			try {
				for (ProductCatalog ProductCatalog : productCatalogs) {
	 				System.out.println("Test " +ProductCatalog.toString()); 

					randomDelay();
					sseEmitter.send(ProductCatalog);
				}

				sseEmitter.complete();

			} catch (IOException e) {
				sseEmitter.completeWithError(e);
			}

		});
		executor.shutdown();
		return sseEmitter;
	}

	private void randomDelay() {
		try {
            Thread.sleep(1000);
            System.out.println("Delyaaa e");
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

}
