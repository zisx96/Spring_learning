package com.SpringLearning.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringLearning.dao.ITicketRepo;
import com.SpringLearning.model.Passenger;

@Service
public class TicketService implements ITicketService {
	
	@Autowired
	private ITicketRepo repo;

	@Override
	public Passenger registerThePasseneger(Passenger passenger) {
		
		return repo.save(passenger);
	}

	@Override
	public Passenger fetchPassengerInfo(Integer id) {
		
		Optional<Passenger> optional = repo.findById(id);
		
		return optional.get();
	}

}
