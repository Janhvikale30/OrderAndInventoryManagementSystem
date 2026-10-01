package com.app.service;

import java.util.List;

import com.app.model.Product;

public interface ProductServiceI {
	public List<Product> createProduct(List<Product> p);
	public List<Product> retriveProduct();
	public Product retriveProductById(int id);
	public Product updateProduct(Product p);

}
