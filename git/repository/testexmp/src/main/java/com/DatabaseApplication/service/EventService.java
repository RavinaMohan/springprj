package com.DatabaseApplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DatabaseApplication.model.EventTest;
import com.DatabaseApplication.one.EVENT_PROC_DET_SEQ_NBR;
import com.DatabaseApplication.repository.EVENT_PROC_Repositoryextends;
import com.DatabaseApplication.repository.EventRepository;

@Service
public class EventService {
	

	@Autowired
	
	EventRepository eventrepository;
	
	@Autowired
	
	EVENT_PROC_Repositoryextends event_proc_repositoryextends;

	 
	
	public  List<EventTest> getAllEVENT(){
		List<EventTest> allEVENT = new ArrayList<EventTest>();
		eventrepository.findAll().forEach(e -> allEVENT.add(e));
		return allEVENT;
		
	}
	public void addEVENT(EventTest eve) {
		System.out.println(eve.toString());
		eventrepository.save(eve);
	} 
	
	public List<EVENT_PROC_DET_SEQ_NBR>getAllEVENT_PROC_DET_SEQ_NBR(){
		List<EVENT_PROC_DET_SEQ_NBR> allEVENT_PROC_Repository = new ArrayList<EVENT_PROC_DET_SEQ_NBR>();
		event_proc_repositoryextends.findAll().forEach(ep -> allEVENT_PROC_Repository.add(ep));
		return allEVENT_PROC_Repository;
		
	}
	public void addEVENT(EVENT_PROC_DET_SEQ_NBR evep) {
		System.out.println(evep.toString());
		event_proc_repositoryextends.save(evep);
	}
	public void addEVENT_PROC_DET_SEQ_NBR(EVENT_PROC_DET_SEQ_NBR evep) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
		}
	
	
	


