/**
 * 
 */
package com.sapient.shopping.service;

import java.util.List;

import com.sapient.shopping.entity.ProductCatalog;

/**
 * @author b.singh
 *
 */
public interface IProductCatalogService {

	List<ProductCatalog> getAllProductCatalogs();

	List<ProductCatalog> getByProductSku(Integer productSku);

	void updateSoldProduct(Integer productSku, Integer quantity);
}
