package com.pms.service;

import java.util.List;

import com.pms.beans.Product;

/**
 * @author nitesh
 *
 */
public interface ProductService {
	Product findById(Long id);
	void saveProduct(Product product);
	void deleteProduct(Long id);
	List<Product> findProducts();
}
