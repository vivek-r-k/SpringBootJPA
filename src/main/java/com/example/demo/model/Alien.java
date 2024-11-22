package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
	@Id
	private int aid;
	private String aname;
	private String atech;
	public int getId() {
		return aid;
	}
	public void setId(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
//	@Override
//	public String toString() {
//		return "Alien [aid=" + aid + ", aname=" + aname + "]";
//	}
	public String getAtech() {
		return atech;
	}
	public void setAtech(String atech) {
		this.atech = atech;
	}
	
	
}
