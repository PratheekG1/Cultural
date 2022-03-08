package com.cg.festival.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Festival_Table")
public class Festival {
	
	@Id
	private Long fest_id;
	private String fest_name;
	private String fest_description;
	private String fest_venue;
	private Float fest_cost;
	private Date fest_date;
	public Long getFest_id() {
		return fest_id;
	}
	public void setFest_id(Long fest_id) {
		this.fest_id = fest_id;
	}
	public String getFest_name() {
		return fest_name;
	}
	public void setFest_name(String fest_name) {
		this.fest_name = fest_name;
	}
	public String getFest_description() {
		return fest_description;
	}
	public void setFest_description(String fest_description) {
		this.fest_description = fest_description;
	}
	public String getFest_venue() {
		return fest_venue;
	}
	public void setFest_venue(String fest_venue) {
		this.fest_venue = fest_venue;
	}
	public float getFest_cost() {
		return fest_cost;
	}
	public void setFest_cost(Float fest_cost) {
		this.fest_cost = fest_cost;
	}
	public Date getFest_date() {
		return fest_date;
	}
	public void setFest_date(Date fest_date) {
		this.fest_date = fest_date;
	}
	public Festival() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Festival(Long fest_id, String fest_name, String fest_description, String fest_venue, Float fest_cost,
			Date fest_date) {
		super();
		this.fest_id = fest_id;
		this.fest_name = fest_name;
		this.fest_description = fest_description;
		this.fest_venue = fest_venue;
		this.fest_cost = fest_cost;
		this.fest_date = fest_date;
	}
	
	
	
	
	
}
