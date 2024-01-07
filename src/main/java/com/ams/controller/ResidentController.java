package com.ams.controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;

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
public class ResidentController {
	
	@Autowired
	ResidentService residentService;
	
	@Autowired
	BillsService billsService;
	
	private Long a;
	private Bills bills;
	
																//Home to resident page
	@GetMapping("resident")                  
	public String login() {
		return "Residentlogin";
	}
																//resident login to resident sign-in
	@GetMapping("register")                 
	public String Residentsingin1() {
		return "Residentsingin";
	}
																//resident sign-in
	@PostMapping("singin")                  
	public String Residentsingin2(Residents residents, @RequestParam String Residentname,Model m) {
		Residents s = residentService.findname(Residentname);
		if(s==null) {
			System.out.println(residents.getPassword()+" password");
			System.out.println(residents.getConfirmPassword()+" Cpassword");
			if(residents.getPassword().equals(residents.getConfirmPassword())) {
				residentService.saveall(residents);
				return "Residentlogin";
			}else {
				m.addAttribute("models", "Password and confirm password not same");
				return "Residentsingin";
			}
		}
			m.addAttribute("model", "User name already used please provide new one");
		return "Residentsingin";
	}
																//Resident login 
	@GetMapping("residentlogin")              
	public String Residentlogin(@RequestParam String Residentname, @RequestParam String Password, Model model, HttpSession s) {
		
		Residents r = residentService.findrisedent(Residentname,Password);
		System.out.println(r+" r");
		
		if(r!=null) {
			Optional<Bills> getbill = billsService.getbill(r.getReid());
			System.out.println("here1");
			if(getbill.isEmpty()) {
				model.addAttribute("biilnull", "Bill did not genarated yet");
				return "Residentlogin";
			}
			Bills bills= getbill.get();
			s.setAttribute("id", r);
			model.addAttribute("model", bills);
			a = billsService.gettotalbiil(bills.getBillid());
			model.addAttribute("models", a);
			return "Residentmain";
		}
		model.addAttribute("notcorrect", "Provide correct user name and password");
		return "Residentlogin";
	}
	
	@GetMapping("pay")
	public String payment(@RequestParam Integer no, Model model) {
		Integer b = billsService.getbillid(no);
		model.addAttribute("model", a);
		model.addAttribute("billid",b);
		return "Payment";
	}
	
	@PostMapping("processPayment")
	public String paytmentprocess(Model model, @RequestParam Long paidAmount,@RequestParam Long totalAmount, @RequestParam Integer Billid ) {
		a = totalAmount-paidAmount;
		Bills b = billsService.getbybillid(Billid);
		
		if(a==0) {
			Bills bills = billsService.updateallbilltozero(Billid);
			model.addAttribute("model", bills);
			model.addAttribute("models", a);
			return "Residentmain";
		}
			model.addAttribute("model", b);
			model.addAttribute("models", a);
			return "Residentmain";
	}
	
	@GetMapping("home")
	public String back() {
		return "Home";
	}
	
	@GetMapping("residentlogout")
	public String residentlogout(HttpSession s) {
		s.invalidate();
		return "Residentlogin";
	}
}
