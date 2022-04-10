package com.DatabaseApplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.DatabaseApplication.model.EventTest;

@Repository
public interface EventRepository extends CrudRepository <EventTest,Integer>{

	
	
}
