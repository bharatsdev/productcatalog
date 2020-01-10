/**
 * 
 */
package com.sapient.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.shopping.entity.Product;


/**
 * This class will be use for Product Master data management
 * @author b.singh
 *
 */
public interface IProductRepo extends JpaRepository<Product, Integer> {

}
