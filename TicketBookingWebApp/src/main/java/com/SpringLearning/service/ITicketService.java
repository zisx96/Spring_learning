package com.SpringLearning.service;

import com.SpringLearning.model.Passenger;
import com.SpringLearning.model.Ticket;

public interface ITicketService {
	
	public Integer registerPassenger(Passenger passenger);
	public Ticket getTicketInfo(Integer id);
	
}
