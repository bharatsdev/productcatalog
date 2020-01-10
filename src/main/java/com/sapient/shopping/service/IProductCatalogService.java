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

	/**
	 * This method will update the product quantity after sale
	 */
	void updateProductCatalog(Integer productSku, Integer quantity);
}
