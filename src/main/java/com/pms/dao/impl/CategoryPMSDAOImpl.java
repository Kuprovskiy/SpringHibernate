package com.pms.dao.impl;

import org.springframework.stereotype.Repository;

import com.pms.beans.CategoryPMS;
import com.pms.dao.CategoryPMSDAO;

@Repository("categoryPMSDAO")
public class CategoryPMSDAOImpl extends AbstractDaoImpl<CategoryPMS, Long> implements CategoryPMSDAO {
	
	protected CategoryPMSDAOImpl() {
		super(CategoryPMS.class);
	}

	/*@Override
	public CategoryPMS getCategory(long id) {
		return findById(id);
	}

	@Override
	public void createCategory(CategoryPMS categoryPMS) {
		createCategory(categoryPMS);
	}

	@Override
	public void deleteCategory(long id) {
		deleteById(id);
	}

	@Override
	public List<CategoryPMS> getAllCategories() {
		return findAll();
	}*/
	
}
