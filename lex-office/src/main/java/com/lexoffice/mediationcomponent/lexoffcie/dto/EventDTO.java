package com.lexoffice.mediationcomponent.lexoffcie.dto;

import org.springframework.stereotype.Component;

@Component
public class EventDTO {
	private String organizationId;
	private String eventType;
	private String resourceId;
	private String eventDate;
	
	
	public String getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getResourceId() {
		return resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	public String getEventDate() {
		return eventDate;
	}
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}
	public EventDTO(String organizationId, String eventType, String resourceId, String eventDate) {
		super();
		this.organizationId = organizationId;
		this.eventType = eventType;
		this.resourceId = resourceId;
		this.eventDate = eventDate;
	}
	public EventDTO() {
		super();
	}
	
	
	
}
