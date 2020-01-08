/**
 * 
 */
package com.sapient.shopping.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author b.singh
 *
 */
@Table
@Entity
@Getter
@Setter
@ToString
public class ProductCatalog{
	public ProductCatalog() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productCatalogId;

	@Column
	private Integer brandId;

	@Column(nullable = false)
	private Integer productId;

	@Column(nullable = false)
	private float productPrice;

	@Column(nullable = false)
	private Integer productCount;
	
	@Column(nullable = false)
	private String productColor;

	@Column(nullable = false)
	private Integer productSize;
	
	@Column(nullable = false)
	private Integer productSku;

	@Column(nullable = false)
	private Integer sellerId;

	@Column(nullable = true, insertable = true, updatable = false)
	@CreationTimestamp
	private LocalDateTime createDateTime;

	@Column(nullable = true)
	private String createdBy;

	@Column(nullable = true, insertable = true, updatable = true)
	@UpdateTimestamp
	private Date updatedDateTime;

	@Column(nullable = true)
	private String updatedBy;
}
