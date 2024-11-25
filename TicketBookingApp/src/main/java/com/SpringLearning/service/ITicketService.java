package com.SpringLearning.service;

import com.SpringLearning.model.Passenger;

public interface ITicketService {
	
	Passenger registerThePasseneger(Passenger passenger);
	Passenger fetchPassengerInfo(Integer id);
	
}
