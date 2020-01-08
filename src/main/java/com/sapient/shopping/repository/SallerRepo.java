/**
 * 
 */
package com.sapient.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.shopping.entity.Seller;

/**
 * @author b.singh
 *
 */
public interface SallerRepo extends JpaRepository<Seller, Integer> {

}
