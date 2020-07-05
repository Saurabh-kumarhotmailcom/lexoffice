package com.lexoffice.mediationcomponent.lexoffcie.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EventsData {
	@Id
	@GeneratedValue
	private int id;
	

	private String organizationId;
	private String eventType;
	private String resourceId;
	private String eventDate;
	
	
	
	public EventsData() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public EventsData(int id, String organizationId, String eventType, String resourceId, String eventDate) {
		super();
		this.id = id;
		this.organizationId = organizationId;
		this.eventType = eventType;
		this.resourceId = resourceId;
		this.eventDate = eventDate;
	}

	
}
