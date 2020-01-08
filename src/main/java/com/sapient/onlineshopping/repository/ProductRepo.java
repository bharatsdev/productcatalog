/**
 * 
 */
package com.sapient.onlineshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.onlineshopping.entity.Product;


/**
 * @author b.singh
 *
 */
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
