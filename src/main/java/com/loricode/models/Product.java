package com.loricode.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "price")
	private double price; 
	
	@Column(name = "quantity")
	private int quantity;
	
	
	
	public Product(int id, String name, double price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product() {
		
	}

	public int getId() {
	    return id;
    }

	
	public String getName() {
	    return name;
	}
	
	public double getPrice() {
		return price;
	}

 
	public int getQuantity() {
		return quantity;
    }
			
}
