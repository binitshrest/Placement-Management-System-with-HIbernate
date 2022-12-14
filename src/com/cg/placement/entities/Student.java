package com.cg.placement.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="students_info")
public class Student implements Serializable
{
	private static final long serialVersionUID=1L;
	@Id //primary key column names
	
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int student_id;
	private String name;
	private String college;
	private int roll;
	private String qualification;
	private String course;
	private int year;
	private int hallTicketNo;
	
	
	//getters and setters 
	public int getId() {
		return student_id;
	}

	public void setId(int student_id) {
		this.student_id = student_id;
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getCollege()
	{
		return college;
	}
	
	public void setCollege(String college)
	{
		this.college = college;
	}
	
	public int getRoll()
	{
		return roll;
	}
	
	public void setRoll(int roll)
	{
		this.roll = roll;
	}
	
	public String getQualification()
	{
		return qualification;
	}
	
	public void setQualification(String qualification)
	{
		this.qualification = qualification;
	}
	public String getCourse()
	{
		return course;
	}
	
	public void setCourse(String course)
	{
		this.course = course;
	}
	public int getYear()
	{
		return year;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public int getHallTicketNo()
	{
		return hallTicketNo;
	}
	
	public void setHallTicketNo(int hallTicketNo)
	{
		this.hallTicketNo = hallTicketNo;
	}
	
	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name = "certificate_id")
	private Certificate certificate;
	public Certificate getCertificate()
	{
		return certificate;
	}
	public void setCertificate(Certificate certificate)
	{
		this.certificate = certificate;
	}
	
	
}
