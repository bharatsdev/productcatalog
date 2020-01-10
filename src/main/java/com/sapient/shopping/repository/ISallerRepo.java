/**
 * 
 */
package com.sapient.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.shopping.entity.Seller;

/**
 * This class will be use for Saller Master data management
 * @author b.singh
 *
 */
public interface ISallerRepo extends JpaRepository<Seller, Integer> {

}
