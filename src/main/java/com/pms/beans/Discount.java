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

@Entity
@Table(name = "DISCOUNT")
public class Discount implements Serializable {

	@Id
	@Column(name = "DISCOUNT_ID" ,unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long discountId;
    
    @Column(name = "DISCOUNT_TYPE")
	private int discounttype;
    
    @Column(name = "DISCOUNT_VALUE")
    private int discountValue;
    
    @Column(name = "IS_ACTIVE")
    private int isActive;

    @Column(name = "IS_PRIVATE")
    private int isPrivate;
    
    @Column(name = "MIN_BUY")
    private int minBuy;
    
    @Column(name = "PROMO_CODE")
    private String promoCode;
    
    @Column(name = "DISCOUNT_START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date discountStartDate;

	@Column(name = "DISCOUNT_END_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date discountEndDate;
    
    @Column(name = "CREATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
	
	@Column(name = "MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date moifiedDate;

	public Long getDiscountId() {
		return discountId;
	}

	public void setDiscountId(Long discountId) {
		this.discountId = discountId;
	}

	public int getDiscounttype() {
		return discounttype;
	}

	public void setDiscounttype(int discounttype) {
		this.discounttype = discounttype;
	}

	public int getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(int discountValue) {
		this.discountValue = discountValue;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int getIsPrivate() {
		return isPrivate;
	}

	public void setIsPrivate(int isPrivate) {
		this.isPrivate = isPrivate;
	}

	public int getMinBuy() {
		return minBuy;
	}

	public void setMinBuy(int minBuy) {
		this.minBuy = minBuy;
	}

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	public Date getDiscountStartDate() {
		return discountStartDate;
	}

	public void setDiscountStartDate(Date discountStartDate) {
		this.discountStartDate = discountStartDate;
	}

	public Date getDiscountEndDate() {
		return discountEndDate;
	}

	public void setDiscountEndDate(Date discountEndDate) {
		this.discountEndDate = discountEndDate;
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
	
	

}
