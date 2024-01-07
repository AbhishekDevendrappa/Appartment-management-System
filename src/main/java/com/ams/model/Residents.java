package com.ams.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Residents {

	public Residents() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Reid;
	private String Residentname;
	private String Residentemail;
	private Long Residentnumber;
	private String Password;
	private String confirmPassword;
	
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public Integer getReid() {
		return Reid;
	}
	public void setReid(Integer reid) {
		Reid = reid;
	}
	public String getResidentname() {
		return Residentname;
	}
	public void setResidentname(String residentname) {
		Residentname = residentname;
	}
	public String getResidentemail() {
		return Residentemail;
	}
	public void setResidentemail(String residentemail) {
		Residentemail = residentemail;
	}
	public Long getResidentnumber() {
		return Residentnumber;
	}
	public void setResidentnumber(Long residentnumber) {
		Residentnumber = residentnumber;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String Password) {
		this.Password = Password;
	}
	
	public Residents(Integer reid, String residentname, String residentemail, Long residentnumber, String password,
			String confirmPassword) {
		super();
		Reid = reid;
		Residentname = residentname;
		Residentemail = residentemail;
		Residentnumber = residentnumber;
		Password = password;
		this.confirmPassword = confirmPassword;
	}
	@Override
	public String toString() {
		return "Residents [Reid=" + Reid + ", Residentname=" + Residentname + ", Residentemail=" + Residentemail
				+ ", Residentnumber=" + Residentnumber + ", Password=" + Password + ", confirmPassword="
				+ confirmPassword + "]";
	}
	
	
	
	
}
