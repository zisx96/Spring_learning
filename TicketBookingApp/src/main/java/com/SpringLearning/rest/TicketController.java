package com.SpringLearning.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringLearning.model.Passenger;
import com.SpringLearning.model.Ticket;
import com.SpringLearning.service.ITicketService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("api/book-ticket")
@Tag(name="TicketBookingApi", description="There are two api one will accept Passenger info and other will generate the ticket ")
public class TicketController {

	@Autowired
	private ITicketService service;
	
	@PostMapping("get-TicketNumber")
	@Operation(summary="Post operation", description="This API will accept Passenger info and generate ticket number")
	public ResponseEntity<Integer> registerThePassenger(@RequestBody Passenger passenger){
		
		Passenger res = service.registerThePasseneger(passenger);
		Integer ticketNumber = res.getId();
		
		return new ResponseEntity<Integer>(ticketNumber, HttpStatus.CREATED);
	}
	
	@GetMapping("get-ticket/{ticketNumber}")
	@Operation(summary="Get operation", description="This API will accept ticketNumber and generate full ticket info")
	public ResponseEntity<Ticket> getticket( @PathVariable("ticketNumber") Integer ticketNumber){
		
		Passenger pas = service.fetchPassengerInfo(ticketNumber);
		Ticket ticket = new Ticket();
		ticket.setTicketNumber(pas.getId());
		ticket.setName(pas.getName());
		ticket.setDeparture(pas.getDeparture());
		ticket.setArrival(pas.getArrival());
		ticket.setDateOfJourney(pas.getDateOfJourney());
		ticket.setStatus("Confirmed");
		ticket.setTicketPrice(564.45);
		
		return new ResponseEntity<Ticket>(ticket, HttpStatus.OK);
	}
}
