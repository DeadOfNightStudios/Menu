package com.my.company.menu;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuItemRepository extends MongoRepository<MenuItem, String> {

	Page<MenuItem> findAll(Pageable pageable);
	
	MenuItem findOneById(String id);
}
