/**
 * 
 */
package com.sapient.shopping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sapient.shopping.entity.ProductCatalog;

/**
 * @author b.singh
 *
 */
@Repository(value = "iProductCatalogRepo")
public interface IProductCatalogRepo extends JpaRepository<ProductCatalog, Integer> {
	List<ProductCatalog> getByProductSku(Integer productSku);

	@Modifying
	@Query("update ProductCatalog u set u.productCount = (u.productCount-:quantity) where u.productSku=:productSku")
	List<ProductCatalog> updateSoldProduct(@Param("productSku") Integer productSku,
			@Param("quantity") Integer quantity);

}
