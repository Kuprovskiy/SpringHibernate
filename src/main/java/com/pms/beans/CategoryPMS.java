package com.pms.beans;

import java.io.Serializable;
import java.util.Set;

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

/**
 * @author nitesh
 *
 */
@Entity
@Table(name = "CATEGORY_PMS")
public class CategoryPMS implements Serializable {
	
	private static final long serialVersionUID = -5635617301579257988L;

	@Id
	@Column(name = "CATEGORY_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long categoryId;
	
	@Column(name = "CATEGORY_NAME")
	private String categoryName;
	
	@Column(name = "CATEGORY_LEVEL")
	private int categorylevel;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "PARENT_CATEGORY_ID")
	private CategoryPMS parentCategory;
	
	@OneToMany(mappedBy="parentCategory", cascade={CascadeType.ALL})
    private Set<CategoryPMS> Categories;

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getLevel() {
		return categorylevel;
	}

	public void setLevel(int categorylevel) {
		this.categorylevel = categorylevel;
	}
	
	public CategoryPMS getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(CategoryPMS parentCategory) {
		this.parentCategory = parentCategory;
	}
	
	public Set<CategoryPMS> getCategories() {
		return Categories;
	}
	
	public void setCategories(Set<CategoryPMS> categories) {
		Categories = categories;
	}
	
	/*@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.SIMPLE_STYLE);
	}*/
	
}
