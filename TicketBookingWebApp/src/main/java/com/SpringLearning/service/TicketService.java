package com.SpringLearning.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.SpringLearning.model.Passenger;
import com.SpringLearning.model.Ticket;

@Service
public class TicketService implements ITicketService {
	
	private String postUrl = "http://localhost:8484/TicketBookingAPI/api/book-ticket/get-TicketNumber";
	private String getUrl = "http://localhost:8484/TicketBookingAPI/api/book-ticket/get-ticket/{ticketNumber}";
	
	@Override
	public Integer registerPassenger(Passenger passenger) {
		
		// Rest Template -> only Synchronous communication
		
//		RestTemplate restTemplate = new RestTemplate();
//		ResponseEntity<Integer> response = restTemplate.postForEntity(postUrl, passenger, Integer.class);		
//		Integer ticketNumber = response.getBody();
		
		// Web client	-> both Synchronous and ASynchronous communication
		WebClient web = WebClient.create();
		Integer ticketNumber = web.post()
				.uri(postUrl)
				.bodyValue(passenger).retrieve()
				.bodyToMono(Integer.class)
				.block();	// synchronous communication
		
		return ticketNumber;
	}

	@Override
	public Ticket getTicketInfo(Integer ticketNumber) {
		
		// Rest Template
		
//		RestTemplate restTemplate = new RestTemplate();
//		ResponseEntity<Ticket> response = restTemplate.getForEntity(getUrl, Ticket.class, ticketNumber);
//		Ticket ticket = response.getBody();
		
		// Web client
		WebClient web = WebClient.create();
		Ticket ticket = web.get()
				.uri(getUrl, ticketNumber)
				.retrieve()
				.bodyToMono(Ticket.class)
				.block();
		
		return ticket;
	}

}
