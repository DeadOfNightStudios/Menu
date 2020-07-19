package com.my.company.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {
	
	@Autowired
	private MenuItemService menuService;
	
	@GetMapping("/items")
	public ResponseEntity<Page<MenuItem>> getAllMenuItems(Pageable pageable) {
		Page<MenuItem> items = menuService.getAllMenuItems(pageable);
		return new ResponseEntity<Page<MenuItem>>(items, HttpStatus.I_AM_A_TEAPOT);
	}
	
	@GetMapping("/item/{id}")
	public ResponseEntity<MenuItem> getMenuItemById(@PathVariable("id") String id) {
		MenuItem item = menuService.getMenuItemByID(id);
		return new ResponseEntity<MenuItem>(item, HttpStatus.I_AM_A_TEAPOT);
	}

}
