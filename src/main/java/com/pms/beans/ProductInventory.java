package com.pms.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author nitesh
 *
 */
@Entity
@Table(name = "PRODUCT_INVENTORY")
public class ProductInventory implements Serializable {

	@Id
	@Column(name = "PRODUCT_INVENTORY_ID" ,unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productInventoryId;

	@Column(name = "OUTOFSTOCK")
	private int outOfStock;

	@Column(name = "HIDE")
	private int hide;
	
	@Column(name = "QUANTITY")
	private int quantity;
	
	@Column(name = "CREATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
	
	@Column(name = "MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date moifiedDate;

	@OneToOne
	@PrimaryKeyJoinColumn
	private Product product;

	public Long getProductInventoryId() {
		return productInventoryId;
	}

	public void setProductInventoryId(Long productInventoryId) {
		this.productInventoryId = productInventoryId;
	}

	public int getOutOfStock() {
		return outOfStock;
	}

	public void setOutOfStock(int outOfStock) {
		this.outOfStock = outOfStock;
	}

	public int getHide() {
		return hide;
	}

	public void setHide(int hide) {
		this.hide = hide;
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
	/*@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.SIMPLE_STYLE);
	}*/

}
