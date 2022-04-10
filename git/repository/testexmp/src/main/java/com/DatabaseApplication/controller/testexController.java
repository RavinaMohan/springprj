package com.DatabaseApplication.controller;

import java.util.List;

//import org.apache.tomcat.util.descriptor.web.ContextService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.DatabaseApplication.model.EventTest;
import com.DatabaseApplication.one.EVENT_PROC_DET_SEQ_NBR;
//import com.DatabaseApplication.repository.EVENT_PROC_Repositoryextends;
//import com.DatabaseApplication.repository.EventRepository;
import com.DatabaseApplication.service.EventService;
@RestController
@RequestMapping("example/v1/event")
public class testexController { 
	
	@Autowired
	EventService eventservice;
	
	
	@GetMapping("/api")
	public List<EventTest> eve()
	 {  
		try
		{
			return eventservice.getAllEVENT();
		 	
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	}
	}
	@PostMapping("/")
	
	public void addEVENT(@RequestBody EventTest eve){ 
		
	/*	try
		{ 
		 
		 eventservice.addEVENT(eve);
		 
		}catch (Exception e) {
			e.printStackTrace();
			
			
		}
		 */
		EventTest test = new EventTest();
				System.out.println(test.getEventType());
		 
	}
	
	
	
	@GetMapping("/two")
	public List<EVENT_PROC_DET_SEQ_NBR> evep()
	 {  
		
		try
		{
			return eventservice.getAllEVENT_PROC_DET_SEQ_NBR();
		 	
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	}
	}
	@PostMapping("/a")
	
	public void addEVENT_PROC_DET_SEQ_NBR(@RequestBody EVENT_PROC_DET_SEQ_NBR evep){ 
		
		System.out.println(evep.toString());
		try {
			System.out.println(evep.toString());
			eventservice.addEVENT_PROC_DET_SEQ_NBR(evep);
		}
		catch(Exception e){ 
			e.printStackTrace();
			
		}
		 
		 
	}
	
	
	
	
	
	
	
	
	
	
}






