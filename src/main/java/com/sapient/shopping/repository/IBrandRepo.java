/**
 * 
 */
package com.sapient.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.shopping.entity.Brand;

 
/**
 * This class will be use for Brand Master data management 
 * @author b.singh
 *
 */
public interface IBrandRepo extends JpaRepository<Brand, Integer> {

}
