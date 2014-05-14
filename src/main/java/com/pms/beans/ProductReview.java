package com.pms.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author nitesh
 *
 */
@Entity
@Table(name = "PRODUCT_REVIEW")
public class ProductReview implements Serializable {

	@Id
	@Column(name = "PRODUCT_REVIEW_ID" ,unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productReviewId;

	@Column(name = "APPROVE_DENY")
	private int approveDeny;

	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "RATING")
	private int rating;
	
	@Column(name = "CREATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
	
	@Column(name = "MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date moifiedDate;

	public Long getProductReviewId() {
		return productReviewId;
	}

	public void setProductReviewId(Long productReviewId) {
		this.productReviewId = productReviewId;
	}

	public int getApproveDeny() {
		return approveDeny;
	}

	public void setApproveDeny(int approveDeny) {
		this.approveDeny = approveDeny;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
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

	

	/*@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.SIMPLE_STYLE);
	}*/

}
