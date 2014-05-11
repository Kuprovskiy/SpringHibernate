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

import com.pms.beans.Product;
import com.pms.controller.constants.RestURIConstants;
import com.pms.service.ProductService;

/**
 * @author nitesh
 *
 */
@Controller
public class ProductController {
	
	private static final Logger LOGGER = Logger.getLogger(ProductController.class);
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value = RestURIConstants.GET_PRODUCT, method = RequestMethod.GET)
	@ResponseBody
	public Product getProduct(@PathVariable long id) {
		LOGGER.info("Start getProduct.");
		return productService.findById(id);
	}
	
	@RequestMapping(value = RestURIConstants.CREATE_PRODUCT, method = RequestMethod.POST)
	@ResponseBody
    public boolean createProduct(@RequestBody Product product) {
		LOGGER.info("Start createProduct.");
        productService.saveProduct(product);
        return true;
    }
	
	@RequestMapping(value = RestURIConstants.DELETE_PRODUCT, method = RequestMethod.PUT)
	@ResponseBody
    public boolean deleteProduct(@PathVariable("id") long id) {
		LOGGER.info("Start deleteProduct.");
        productService.deleteProduct(id);
        return true;
    }
	
	@RequestMapping(value = RestURIConstants.GET_ALL_PRODUCT, method = RequestMethod.GET)
	@ResponseBody
    public List<Product> getAllProducts() {
		LOGGER.info("Start getAllProducts.");
        return productService.findProducts();
    }
	
}
