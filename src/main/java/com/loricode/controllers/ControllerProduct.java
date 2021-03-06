package com.loricode.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.loricode.services.IProduct;


import com.loricode.models.Product;

@RestController
@CrossOrigin
@RequestMapping("/api/product")
public class ControllerProduct {

	@Autowired
	private IProduct repository;
	 
	@GetMapping
	public List<Product> getProducts() {
		return repository.findAll();
	}
	
	@PostMapping
	public Object addProduct(@RequestBody Product product) {
		return repository.save(product);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteProduct(@PathVariable int id) {
		repository.deleteById(id);
	}
	
	
		
	
}
