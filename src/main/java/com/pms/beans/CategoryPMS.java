package com.pms.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "CATEGORY_PMS")
public class CategoryPMS implements Serializable {
	
	@Id
	@Column(name = "CATEGORY_ID" ,unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long categoryId;
	
	@Column(name = "CATEGORY_NAME")
	private String categoryName;
	
	@Column(name = "CATEGORY_LEVEL")
	private int categorylevel;
	
	@Column(name = "CREATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
	
	@Column(name = "MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date moifiedDate;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "PARENT_CATEGORY_ID")
	private CategoryPMS parentCategory;
	
	@OneToMany(mappedBy="parentCategory", cascade={CascadeType.ALL})
    private List<CategoryPMS> categories;

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getCategorylevel() {
		return categorylevel;
	}

	public void setCategorylevel(int categorylevel) {
		this.categorylevel = categorylevel;
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

	public CategoryPMS getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(CategoryPMS parentCategory) {
		this.parentCategory = parentCategory;
	}

	public List<CategoryPMS> getCategories() {
		return categories;
	}

	public void setCategories(List<CategoryPMS> categories) {
		this.categories = categories;
	}

	
		
	/*@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.SIMPLE_STYLE);
	}*/
	
}
