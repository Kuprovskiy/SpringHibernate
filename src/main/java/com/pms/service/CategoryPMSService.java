package com.pms.service;

import java.util.List;

import com.pms.beans.CategoryPMS;

/**
 * @author nitesh
 *
 */
public interface CategoryPMSService {
	CategoryPMS findById(Long id);
	void saveCategory(CategoryPMS categoryPMS);
	void deleteCategory(Long id);
	List<CategoryPMS> findCategories();
}
