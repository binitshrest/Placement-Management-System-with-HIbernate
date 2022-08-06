package com.cg.placement.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "college_info")
public class College implements Serializable
{
	private static final long serialVersionUID=1L;
	@Id
	@Column(name = "college_id")
	private int college_id;
	private String college_name;
	private String college_location;
	
	//getters and setters
	public int getCollege_id()
	{
		return college_id;
	}
	
	public void setCollege_id(int college_id) 
	{
		this.college_id = college_id;
	}
	
	public String getCollege_name()
	{
		return college_name;
	}
	
	public void setCollege_name(String college_name)
	{
		this.college_name = college_name;
	}
	
	public String getCollege_location()
	{
		return college_location;
	}
	
	public void setCollege_location(String college_location)
	{
		this.college_location = college_location;
	}
	
	//private User collegeAdmin;
	
	
}
