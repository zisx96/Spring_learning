package com.SpringLearning.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringLearning.model.Passenger;
import com.SpringLearning.model.Ticket;
import com.SpringLearning.service.ITicketService;

@Controller
public class TicketController {

	@Autowired
	private ITicketService service;
	
	@PostMapping("bookticket")
	public String bookTicket(@ModelAttribute Passenger passenger, Model model) {
		
		Integer ticketNumber = service.registerPassenger(passenger);
		
		model.addAttribute("ticketNumber", ticketNumber);
		
		return "index";
	}
	
	@GetMapping("passengerform")
	public String bookTicketForm(@ModelAttribute Passenger passenger, Model model) {
		
		model.addAttribute("passenger", new Passenger());
		
		return "index";
	}
	
	@GetMapping("ticketform")
	public String ticketForm(@ModelAttribute Passenger passenger, Model model) {
		
		model.addAttribute("passenger", new Passenger());
		
		return "ticketform";
	}
	
	@GetMapping("get-ticket")
	public String getTicket(@RequestParam("ticketNumber") Integer ticketNumber, Model model) {
		
		Ticket ticket = service.getTicketInfo(ticketNumber);
		model.addAttribute("ticket", ticket);
		
		return "ticketinfo";
	}
	
}
