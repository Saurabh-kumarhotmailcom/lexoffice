package com.lexoffice.mediationcomponent.lexoffcie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lexoffice.mediationcomponent.lexoffcie.model.EventsData;
import com.lexoffice.mediationcomponent.lexoffcie.repository.EventsDataRepository;

@Service
public class EventsService {

	@Autowired
	EventsDataRepository eventsDataRepository; 
	
	public void saveData(EventsData evenstData) {
		eventsDataRepository.save(evenstData);
	}
}
