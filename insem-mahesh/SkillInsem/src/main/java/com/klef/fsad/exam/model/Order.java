package com.klef.fsad.exam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Order {
	@Id
	private Long id;
	private String name;
	private String date;
	private String status;
	public Order(Long id, String name, String date, String status) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.status = status;
	}
	public Order() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
