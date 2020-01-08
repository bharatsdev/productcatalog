/**
 * 
 */
package com.sapient.shopping.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sapient.shopping.entity.ProductCatalog;
import com.sapient.shopping.repository.IProductCatalogRepo;
import com.sapient.shopping.service.IProductCatalogService;

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
	public void updateSoldProduct(Integer productSku, Integer quantity) {
		iProductCatalogRepo.updateSoldProduct(productSku, quantity);
	}

}
