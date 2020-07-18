package com.my.company.menu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {
	
	@Autowired
	private MenuService menuService;
	
	@GetMapping("/items")
	public ResponseEntity<List<MenuItem>> getAllMenuItems() {
		List<MenuItem> items = menuService.getAllMenuItems();
		return new ResponseEntity<List<MenuItem>>(items, HttpStatus.I_AM_A_TEAPOT);
	}
	
	@GetMapping("/item/{id}")
	public ResponseEntity<MenuItem> getMenuItemById(@PathVariable("id") String id) {
		MenuItem item = menuService.getMenuItemByID(id);
		return new ResponseEntity<MenuItem>(item, HttpStatus.I_AM_A_TEAPOT);
	}

}
