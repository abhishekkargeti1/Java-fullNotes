package com.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="employeeDetails")
public class details {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="name",nullable = false)
	private String name;
	@Column(name="salary")
	private double salary;
	
	@Transient
	private String tempData;

	@Temporal(TemporalType.DATE)
	@Column(name="Date")
	private Date date;
	
	@Lob
	@Column(name="bio")
	private String bio;
	
	@Enumerated(EnumType.STRING)
	@Column(name="status")
	private EmployeeStatus status;
	
	@Embedded
	private Address addrress;
	
	@ElementCollection
	@CollectionTable(name="employee_projects",joinColumns = @JoinColumn(name="employe_Id"))
	@Column(name="projectName")
	private  List<String> projects;
	
	public details() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public details(String name, double salary, Date date, String bio, EmployeeStatus status,
			Address addrress, List<String> projects) {
		super();
		this.name = name;
		this.salary = salary;
		this.date = date;
		this.bio = bio;
		this.status = status;
		this.addrress = addrress;
		this.projects = projects;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getTempData() {
		return tempData;
	}

	public void setTempData(String tempData) {
		this.tempData = tempData;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public EmployeeStatus getStatus() {
		return status;
	}

	public void setStatus(EmployeeStatus status) {
		this.status = status;
	}

	public Address getAddrress() {
		return addrress;
	}

	public void setAddrress(Address addrress) {
		this.addrress = addrress;
	}

	public List<String> getProjects() {
		return projects;
	}

	public void setProjects(List<String> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "details [id=" + id + ", name=" + name + ", salary=" + salary + ", tempData=" + tempData + ", date="
				+ date + ", bio=" + bio + ", status=" + status + ", addrress=" + addrress + ", projects=" + projects
				+ "]";
	}

	
	
	
	
	
}
