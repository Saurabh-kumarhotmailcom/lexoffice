package com.lexoffice.mediationcomponent.lexoffcie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lexoffice.mediationcomponent.lexoffcie.dto.EventDTO;
import com.lexoffice.mediationcomponent.lexoffcie.model.EventsData;
import com.lexoffice.mediationcomponent.lexoffcie.repository.EventsDataRepository;
import com.lexoffice.mediationcomponent.lexoffcie.service.EventsService;

@RestController
@RequestMapping("/events/v1")
public class EventsDataController {
	
	@Autowired
	EventsDataRepository eventRepository;
	
	@Autowired
	EventsService eventsService;

	
	@GetMapping("/")
	public List<EventsData> getEvents(){
		return eventRepository.findAll();
	}
	
	@PostMapping("/")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void eventlistener(@RequestBody EventDTO eventDTO) {
		
		EventsData eventsData=new EventsData(); 
		eventsData.setEventDate(eventDTO.getEventDate());
		eventsData.setEventType(eventDTO.getEventType());
		eventsData.setOrganizationId(eventDTO.getOrganizationId());
		eventsData.setResourceId(eventDTO.getResourceId());
		
		eventsService.saveData(eventsData);
		
	}
}
