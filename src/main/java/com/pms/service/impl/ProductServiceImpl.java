package com.pms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pms.beans.Product;
import com.pms.dao.ProductDAO;
import com.pms.service.ProductService;

/**
 * @author nitesh
 *
 */
@Service("productService")
@Transactional(readOnly = true)
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDAO;
	
	@Override
	public Product findById(Long id) {
		return productDAO.findById(id);
	}

	@Override
	@Transactional(readOnly = false)
	public void saveProduct(Product product) {
		productDAO.save(product);
	}

	@Override
	@Transactional(readOnly = false)
	public void deleteProduct(Long id) {
		productDAO.deleteById(id);;
	}

	@Override
	public List<Product> findProducts() {
		return productDAO.findAll();
	}

		
}
