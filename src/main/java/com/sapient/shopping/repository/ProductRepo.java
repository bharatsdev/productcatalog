/**
 * 
 */
package com.sapient.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.shopping.entity.Product;


/**
 * @author b.singh
 *
 */
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
