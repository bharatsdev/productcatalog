/**
 * 
 */
package com.sapient.onlineshopping.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;

/**
 * @author b.singh
 *
 */
@Table
@Entity
@Getter
@Setter
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;

	@Column(nullable=false)
	private String productName;


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
