package com.my.company.menu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MenuItemService {
	
	@Autowired
	private MenuItemRepository menuItemRepo;
	
	public Page<MenuItem> getAllMenuItems(Pageable pageable) {

		Page<MenuItem> items = menuItemRepo.findAll(pageable);
		return items;
	}
	
	public MenuItem getMenuItemByID(String id) {
		MenuItem item = menuItemRepo.findOneById(id);
		return item;
	}

	public void initMongoDB() {
		if (menuItemRepo.findAll().size() == 0) {
			List<MenuItem> items = new ArrayList<MenuItem>();
			items.add(new MenuItem("Item 1", "just the first item", "$4.00"));
			items.add(new MenuItem("Item 2", "just the second item", "$8.00"));
			menuItemRepo.saveAll(items);
		}
	}
	
}
