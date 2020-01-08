/**
 * 
 */
package com.sapient.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.shopping.entity.Brand;

 
/**
 * @author b.singh
 *
 */
public interface BrandRepo extends JpaRepository<Brand, Integer> {

}
