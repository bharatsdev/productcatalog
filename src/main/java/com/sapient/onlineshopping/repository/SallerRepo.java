/**
 * 
 */
package com.sapient.onlineshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.onlineshopping.entity.Seller;

/**
 * @author b.singh
 *
 */
public interface SallerRepo extends JpaRepository<Seller, Integer> {

}
