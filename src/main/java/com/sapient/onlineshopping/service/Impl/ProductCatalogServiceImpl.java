/**
 * 
 */
package com.sapient.onlineshopping.service.Impl;

import java.util.List;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sapient.onlineshopping.entity.ProductCatalog;
import com.sapient.onlineshopping.repository.IProductCatalogRepo;
import com.sapient.onlineshopping.service.IProductCatalogService;

@Service(value = "productCatalogService")
public class ProductCatalogServiceImpl implements IProductCatalogService {

	@Autowired
	IProductCatalogRepo iProductCatalogRepo;

	@Override
	public List<ProductCatalog> getAllProductCatalogs() {
		return this.iProductCatalogRepo.findAll();
	}

	@Override
	public List<ProductCatalog> getByProductSku(Integer productSku) {
		return iProductCatalogRepo.getByProductSku(productSku);
	}
	
 	@Override
	@Transactional
	public List<ProductCatalog> updateSoldProduct(Integer productSku, Integer quantity) { 
		return iProductCatalogRepo.updateSoldProduct(productSku, quantity);
	}

}
