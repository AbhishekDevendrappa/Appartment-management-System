package com.ams.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ams.model.Bills;
import com.ams.model.Residents;
import com.ams.service.BillsService;
import com.ams.service.ResidentService;

@Controller
public class AdminController {
	
	@Autowired
	ResidentService residentService;
	
	@Autowired
	BillsService billsService;
	
	@GetMapping
	public String Home() {
		return "Home";
	}
	
	@GetMapping("admin")
	public String Admin() {
		return "Adminlogin";
	}
	
	@GetMapping("Adminlogin")
	public String Adminlogin(@RequestParam String adminid, @RequestParam String password, Model model) {
		if(adminid.equals("abhishek") && password.equals("12345678")) {
		List<Residents> re = residentService.getallresident();
		model.addAttribute("model", re);
			return "Adminmain";
		}
		else {
			model.addAttribute("wrongpass", "Provide correct username and password");
			return "Adminlogin";
		}
	}
	
	@GetMapping("update")
	public String updatebill(@RequestParam Integer no, Model m) {
		m.addAttribute("model", no);
		return "Addbill";
	}
	
	@PostMapping("bill")
	public String Billdetails(Bills bills,Model model,@RequestParam Integer residents_reid) {
		Optional<Bills> bill = billsService.getbill(residents_reid);
		System.out.println(bill);
		if(!bill.isEmpty()) {
			bill.get().setElectricitybill(bills.getElectricitybill());
			bill.get().setOthermainbill(bills.getOthermainbill());
			bill.get().setWastemangebill(bills.getWastemangebill());
			bill.get().setWaterebill(bills.getWaterebill());
			billsService.addall(bill.get());
			List<Residents> re = residentService.getallresident();
			model.addAttribute("model", re);
			return "Adminmain";
		}
			bills.setResidents(residentService.getbyid(residents_reid));
			billsService.addall(bills);
			System.out.println(bills);
			List<Residents> re = residentService.getallresident();
			model.addAttribute("model", re);
			return "Adminmain";
	}
	
	
	@GetMapping("adminlogout")
	public String adminlogout() {
		return "Adminlogin";
	}
	
	@GetMapping("updatetomain")
	public String updatetomain(Model model) {
		List<Residents> re = residentService.getallresident();
		model.addAttribute("model", re);
		return "Adminmain";
	}

}
