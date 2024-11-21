package com.SpringLearning.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringLearning.model.Customer;
import com.SpringLearning.service.ICustomerService;

@Controller
public class CustomerController {
	
	private ICustomerService service;
	
	@Autowired
	public void setICustomerService(ICustomerService service) {
		
		this.service = service;
	}
	
	@GetMapping("/cxinfo")
	public String getAllCustomerData(Model model) {
		
		List<Customer> list = (List<Customer>) service.getCustomerInformation();
		
		model.addAttribute("customers", list);
		
		list.forEach((c) -> System.out.println(c));
		
		return "customerinfo";
	}
	
	@GetMapping("/showForm")
	public String getTheForm(Model model) {
		
		model.addAttribute("customer", new Customer());
		return "showform";
	}
	
	@PostMapping("/registerCustomer")
	public String registerNewCustomer(@ModelAttribute("customer") Customer customer,Model model) {
		
		service.registerCustomer(customer);
		return "redirect:/cxinfo";
	}
	
	@GetMapping("/updateForm")
	public String updateCustomer(@RequestParam("cxid") Integer id, Model model) {
		
		Customer cx = service.fetchCustomerById(id);
		
		model.addAttribute("customer", cx);
		
		return "updateform";
	}
	
	@GetMapping("/deleteForm")
	public String deleteCustomer(@RequestParam("cxid") Integer id) {
		
		service.deletCustomerById(id);
		return "redirect:/cxinfo";
	}
	
}
