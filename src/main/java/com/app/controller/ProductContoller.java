package com.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Product;
import com.app.service.ProductService;

@RestController
public class ProductContoller {
	
	@Autowired
	ProductService ps;
	
	@PostMapping("/save")
	public List<Product> saveProduct(@RequestBody List<Product> p) {
	List<Product> pr =	ps.createProduct(p);
	return pr;
	}
	
	@GetMapping("/getProduct")
	public List<Product> getProduct(){
	List<Product> p =	ps.retriveProduct();
	return p;
	}
	
	@GetMapping("/getById/{id}")
	public Product getProductById(@PathVariable int id) {
		Product p =ps.retriveProductById(id);
		return p;
	}
	
	@PutMapping("/updatedetails/{id}")
	public Product updateDetails(@PathVariable int id,    @RequestBody Product p) {
	Product pr =	ps.updateProduct(p);
	return pr;
	}
	

}
