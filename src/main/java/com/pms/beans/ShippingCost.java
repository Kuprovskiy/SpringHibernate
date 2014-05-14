package com.pms.beans;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "SHIPPING_COST")
public class ShippingCost implements Serializable {

	@Id
	@Column(name = "SHIPPING_COST_ID" ,unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shippingCostId;
    
	@Column(name = "SHIPPING_COST_NEWZEALAND")
	private BigDecimal shippingCostNewzealand;
	
	@Column(name = "SHIPPING_COST_REGULAR")
	private BigDecimal shippingCostRegular;
	
	@Column(name = "SHIPPING_COST_EXPRESS")
	private BigDecimal shippingCostExpress;
	
	@Column(name = "SHIPPING_COST_TYPE")
	private int shippingCostType;
	
    @Column(name = "MESSAGE")
	private String message;
    
    @Column(name = "CREATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
	
	@Column(name = "MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date moifiedDate;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "USER_ID", nullable = false)
	private User user;

	public Long getShippingCostId() {
		return shippingCostId;
	}

	public void setShippingCostId(Long shippingCostId) {
		this.shippingCostId = shippingCostId;
	}

	public BigDecimal getShippingCostNewzealand() {
		return shippingCostNewzealand;
	}

	public void setShippingCostNewzealand(BigDecimal shippingCostNewzealand) {
		this.shippingCostNewzealand = shippingCostNewzealand;
	}

	public BigDecimal getShippingCostRegular() {
		return shippingCostRegular;
	}

	public void setShippingCostRegular(BigDecimal shippingCostRegular) {
		this.shippingCostRegular = shippingCostRegular;
	}

	public BigDecimal getShippingCostExpress() {
		return shippingCostExpress;
	}

	public void setShippingCostExpress(BigDecimal shippingCostExpress) {
		this.shippingCostExpress = shippingCostExpress;
	}

	public int getShippingCostType() {
		return shippingCostType;
	}

	public void setShippingCostType(int shippingCostType) {
		this.shippingCostType = shippingCostType;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
