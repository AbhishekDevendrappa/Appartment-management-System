package com.ams.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.ams.model.Residents;
import com.ams.repo.ResidentServiceRepo;

@Service
public class ResidentService {

	@Autowired
	ResidentServiceRepo repo;
	public void saveall(Residents residents) {
		repo.save(residents);
		
	}
	public Residents findrisedent(String Residentname, String Password) {
		
		repo.findByResidentnameAndPassword(Residentname,Password);
		return repo.findByResidentnameAndPassword(Residentname,Password);
	}
	
	public List<Residents> getallresident() {
		return (List<Residents>) repo.findAll();
		
	}
	public Residents getbyid(Integer residents_reid) {
		 Optional<Residents> byId = repo.findById(residents_reid);
		 return byId.get();
	}
	public Residents findname(String residentname) {
		return repo.findByResidentname(residentname);
	}
	

}
