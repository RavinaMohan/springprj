package com.DatabaseApplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.DatabaseApplication.one.EVENT_PROC_DET_SEQ_NBR;

@Repository
public interface EVENT_PROC_Repositoryextends extends CrudRepository <EVENT_PROC_DET_SEQ_NBR,Integer> {


	
	
	
}

