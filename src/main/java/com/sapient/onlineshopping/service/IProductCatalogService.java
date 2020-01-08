/**
 * 
 */
package com.sapient.onlineshopping.service;

import java.util.List;

import com.sapient.onlineshopping.entity.ProductCatalog;
/**
 * @author b.singh
 *
 */
public interface IProductCatalogService  {
	
	List<ProductCatalog> getAllProductCatalogs();
	List<ProductCatalog> getByProductSku(Integer productSku);
	List<ProductCatalog> updateSoldProduct(Integer productSku, Integer quantity);
}
