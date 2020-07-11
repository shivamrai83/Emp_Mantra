package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "singup")
public class MyModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String fname;
	private String lname;
	private String uname;
	private String email;
	private String password;
	private String phone;
	private String acno;
	private String aadhaar;
	
	

	public MyModel() {
		super();
	}

	public MyModel(int id, String fname, String lname, String uname, String email, String password, String phone, String acno,
			String aadhaar) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.uname = uname;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.acno = acno;
		this.aadhaar = aadhaar;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAcno() {
		return acno;
	}

	public void setAcno(String acno) {
		this.acno = acno;
	}

	public String getAadhaar() {
		return aadhaar;
	}

	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}
	
	

}
