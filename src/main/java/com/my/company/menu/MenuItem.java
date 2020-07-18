package com.my.company.menu;

import java.util.UUID;

public class MenuItem {
	
	private String id;
	
	private String name;
	
	private String description;
	
	private String price;
	
	public MenuItem() {
		// Default
	}
	
	public MenuItem(String name, String desc, String price) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.description = desc;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
