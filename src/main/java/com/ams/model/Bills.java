package com.ams.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Bills {

	public Bills() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer billid;
	private Long electricitybill;
	private Long waterebill;
	private Long wastemangebill;
	private Long othermainbill;
	@OneToOne(targetEntity = Residents.class,cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "Reid")
	private Residents residents;
	
	public Integer getBillid() {
		return billid;
	}
	public void setBillid(Integer billid) {
		this.billid = billid;
	}
	public Long getElectricitybill() {
		return electricitybill;
	}
	public void setElectricitybill(Long electricitybill) {
		this.electricitybill = electricitybill;
	}
	public Long getWaterebill() {
		return waterebill;
	}
	public void setWaterebill(Long waterebill) {
		this.waterebill = waterebill;
	}
	public Long getWastemangebill() {
		return wastemangebill;
	}
	public void setWastemangebill(Long wastemangebill) {
		this.wastemangebill = wastemangebill;
	}
	public Long getOthermainbill() {
		return othermainbill;
	}
	public void setOthermainbill(Long othermainbill) {
		this.othermainbill = othermainbill;
	}
	public Residents getResidents() {
		return residents;
	}
	public void setResidents(Residents residents) {
		this.residents = residents;
	}
	public Bills(Integer billid, Long electricitybill, Long waterebill, Long wastemangebill, Long othermainbill,
			Residents residents) {
		super();
		this.billid = billid;
		this.electricitybill = electricitybill;
		this.waterebill = waterebill;
		this.wastemangebill = wastemangebill;
		this.othermainbill = othermainbill;
		this.residents = residents;
	}
	
	@Override
	public String toString() {
		return "Bills [billid=" + billid + ", electricitybill=" + electricitybill + ", waterebill=" + waterebill
				+ ", wastemangebill=" + wastemangebill + ", othermainbill=" + othermainbill + ", residents=" + residents
				+ "]";
	}
}
