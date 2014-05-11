package com.pms.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pms.beans.CategoryPMS;
import com.pms.controller.constants.RestURIConstants;
import com.pms.service.CategoryPMSService;

/**
 * @author nitesh
 *
 */
@Controller
public class CategoryPMSController {
	
	private static final Logger LOGGER = Logger.getLogger(CategoryPMSController.class);
	
	@Autowired
	CategoryPMSService categoryPMSService;
	
	@RequestMapping(value = RestURIConstants.GET_CATEGORY, method = RequestMethod.GET)
	@ResponseBody
	public CategoryPMS getCategory(@PathVariable long id) {
		LOGGER.info("Start getCategory.");
		CategoryPMS categoryPMS = new CategoryPMS();
		categoryPMS.setCategoryName("test");
		categoryPMS.setLevel(1);
		//return categoryPMS;
		return categoryPMSService.findById(id);
	}
	
	@RequestMapping(value = RestURIConstants.CREATE_CATEGORY, method = RequestMethod.POST)
	@ResponseBody
    public boolean createCategory(@RequestBody CategoryPMS categoryPMS) {
		LOGGER.info("Start createCategory.");
        categoryPMSService.saveCategory(categoryPMS);
        return true;
    }
	
	@RequestMapping(value = RestURIConstants.DELETE_CATEGORY, method = RequestMethod.PUT)
	@ResponseBody
    public boolean deleteCategory(@PathVariable("id") long id) {
		LOGGER.info("Start deleteCategory.");
		categoryPMSService.deleteCategory(id);
		return true;
    }
	
	@RequestMapping(value = RestURIConstants.GET_ALL_CATEGORY, method = RequestMethod.GET)
	@ResponseBody
    public List<CategoryPMS> getAllCategories() {
		LOGGER.info("Start getAllCategories.");
        return categoryPMSService.findCategories();
    }
	
}
