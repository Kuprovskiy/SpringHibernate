package com.pms.dao.impl;

import org.springframework.stereotype.Repository;

import com.pms.beans.Product;
import com.pms.dao.ProductDAO;

@Repository("productDAO")
public class ProductDAOImpl extends AbstractDaoImpl<Product, Long> implements ProductDAO {

	protected ProductDAOImpl() {
		super(Product.class);
	}

	/*@Override
	public Product getProduct(long id) {
		return findById(id);
	}

	@Override
	public void createProduct(Product product) {
		createProduct(product);
	}

	@Override
	public void deleteProduct(long id) {
		deleteById(id);
	}

	@Override
	public List<Product> getAllProducts() {
		return findAll();
	}*/
	
}
