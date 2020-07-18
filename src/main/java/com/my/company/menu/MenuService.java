package com.my.company.menu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MenuService {
	
	public List<MenuItem> getAllMenuItems() {
		List<MenuItem> items = new ArrayList<MenuItem>();
		items.add(new MenuItem("Item 1", "just the first item", "$4.00"));
		items.add(new MenuItem("Item 2", "just the second item", "$8.00"));
		
		return items;
	}
	
	public MenuItem getMenuItemByID(String id) {
		
		return new MenuItem(id, "just the second item", "$8.00");
	}

}
