package com.pms.beans;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ORDER_LINE_ITEM")
public class OrderLineItem implements Serializable {

	@Id
	@Column(name = "ORDER_LINE_ITEM_ID" ,unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderLineItemId;
    
    @Column(name = "PRICE")
	private String price;
    
    @Column(name = "DISCOUNT")
	private BigDecimal discount;
    
    @Column(name = "TAX")
	private BigDecimal tax;
    
    @Column(name = "TOTAL")
	private BigDecimal total;
    
    @Column(name = "QUANTITY")
	private int quantity;
    
    @Column(name = "CREATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
	
	@Column(name = "MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date moifiedDate;
	
	@OneToMany(cascade={CascadeType.ALL})
	@JoinColumn(name="ORDER_ID", insertable = false, updatable = false)
	List<Order> orders;

	@OneToOne
	@PrimaryKeyJoinColumn
	private Product product;

	public Long getOrderLineItemId() {
		return orderLineItemId;
	}

	public void setOrderLineItemId(Long orderLineItemId) {
		this.orderLineItemId = orderLineItemId;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public BigDecimal getTax() {
		return tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
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

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
