package com.pms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pms.beans.CategoryPMS;
import com.pms.dao.CategoryPMSDAO;
import com.pms.service.CategoryPMSService;

/**
 * @author nitesh
 *
 */
@Service("categoryPMSService")
@Transactional(readOnly = true)
public class CategoryPMSServiceImpl implements CategoryPMSService {

	@Autowired
	private CategoryPMSDAO categoryPMSDAO;
	
	@Override
	public CategoryPMS findById(Long id) {
		return categoryPMSDAO.findById(id);
	}

	@Override
	@Transactional(readOnly = false)
	public void saveCategory(CategoryPMS categoryPMS) {
		categoryPMSDAO.save(categoryPMS);
	}

	@Override
	@Transactional(readOnly = false)
	public void deleteCategory(Long id) {
		categoryPMSDAO.deleteById(id);
	}

	@Override
	public List<CategoryPMS> findCategories() {
		return categoryPMSDAO.findAll();
	}
	
}
