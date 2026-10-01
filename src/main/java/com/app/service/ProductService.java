package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Product;
import com.app.repository.ProductRepositry;

@Service
public class ProductService implements ProductServiceI {

	@Autowired
	ProductRepositry pr;

	@Override
	public List<Product> createProduct(List<Product> p) {
		List<Product> pro = pr.saveAll(p);
		return pro;
	}

	@Override
	public List<Product> retriveProduct() {
		List<Product> p = pr.findAll();
		return p;
	}

	@Override
	public Product retriveProductById(int id) {

		Product p = pr.findById(id).orElseThrow(() -> new RuntimeException("Product not found with id :" + id));
		return p;
	}

	@Override
	public Product updateProduct(Product p) {
	Product pro =	pr.save(p);
		return pro;
	}

}
