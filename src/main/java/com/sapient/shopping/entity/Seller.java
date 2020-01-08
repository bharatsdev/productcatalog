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

/**
 * @author b.singh
 *
 */
@Table
@Entity
@Getter
@Setter
public class Seller {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sellerId;

	@Column(nullable = false)
	private String sellerName;

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
