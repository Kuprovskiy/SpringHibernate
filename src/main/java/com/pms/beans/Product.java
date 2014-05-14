package com.pms.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author nitesh
 *
 */
@Entity
@Table(name = "PRODUCT_PMS")
public class Product implements Serializable {

	@Id
	@Column(name = "PRODUCT_ID" ,unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;

	@Column(name = "PRODUCT_NAME")
	private String productName;

	@Column(name = "PRODUCT_DESCRIPTION")
	private int productDescription;
	
	@Column(name = "PRODUCT_INGREDIENTS")
	private int productIngredients;
	
	@Column(name = "PRODUCT_SIZE")
	private String productSize;
	
	@Column(name = "PRODUCT_NO")
	private String productNo;
	
	@Column(name = "CREATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
	
	@Column(name = "MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date moifiedDate;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CATEGORY_ID", nullable = false)
	private CategoryPMS categoryPMS;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "BRAND_ID", nullable = false)
	private Brand brand;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "COLOR_ID")
    private Set<Color> colors;

	@OneToMany(cascade={CascadeType.ALL})
	@JoinColumn(name="PRODUCT_REVIEW_ID", insertable=false, updatable=false)
	List<ProductReview> productReviews;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
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

	public int getProductIngredients() {
		return productIngredients;
	}

	public void setProductIngredients(int productIngredients) {
		this.productIngredients = productIngredients;
	}

	public String getProductSize() {
		return productSize;
	}

	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getMoifiedDate() {
		return moifiedDate;
	}

	public void setMoifiedDate(Date moifiedDate) {
		this.moifiedDate = moifiedDate;
	}

	public CategoryPMS getCategoryPMS() {
		return categoryPMS;
	}

	public void setCategoryPMS(CategoryPMS categoryPMS) {
		this.categoryPMS = categoryPMS;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Set<Color> getColors() {
		return colors;
	}

	public void setColors(Set<Color> colors) {
		this.colors = colors;
	}

	public List<ProductReview> getProductReviews() {
		return productReviews;
	}

	public void setProductReviews(List<ProductReview> productReviews) {
		this.productReviews = productReviews;
	}
	
	

	/*@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.SIMPLE_STYLE);
	}*/

}
