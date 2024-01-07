package com.ams.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.model.Bills;
import com.ams.repo.BillsServiceRepo;

@Service
public class BillsService {

	@Autowired
	BillsServiceRepo repo;
	
	public void addall(Bills bills) {
		repo.save(bills);
	}

	public Optional<Bills> getbill(Integer residents_reid) {
		return repo.findByreidId(residents_reid);
	}

	public Long gettotalbiil(Integer no) {
		Optional<Bills> b = repo.findById(no);
		long a = b.get().getElectricitybill()+b.get().getOthermainbill()+b.get().getWastemangebill()+b.get().getWaterebill();
		return a;
	}

	public Integer getbillid(Integer no) {
		return repo.findById(no).get().getBillid();
	}

	public Bills getbybillid(Integer billid) {
		Optional<Bills> b = repo.findById(billid);
		return b.get();
	}

	public Bills updateallbilltozero(Integer billid) {
		Optional<Bills> byId = repo.findById(billid);
		Bills bills = byId.get();
		bills.setElectricitybill((long) 0);
		bills.setOthermainbill((long) 0);
		bills.setWastemangebill((long) 0);
		bills.setWaterebill((long) 0);
		repo.save(bills);
		return bills;
	}

}
