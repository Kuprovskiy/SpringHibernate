package com.pms.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author nitesh
 *
 */
@Entity
@Table(name = "PRODUCT_PMS")
public class Product implements Serializable {

	private static final long serialVersionUID = -6558201937716972643L;

	@Id
	@Column(name = "PRODUCT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productId;

	@Column(name = "PRODUCT_NAME")
	private String productName;

	@Column(name = "PRODUCT_DESCRIPTION")
	private int productDescription;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CATEGORY_ID", nullable = false)
	private CategoryPMS categoryPMS;


	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(int productDescription) {
		this.productDescription = productDescription;
	}

	public CategoryPMS getCategoryPMS() {
		return categoryPMS;
	}

	public void setCategoryPMS(CategoryPMS categoryPMS) {
		this.categoryPMS = categoryPMS;
	}

	/*@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.SIMPLE_STYLE);
	}*/

}
