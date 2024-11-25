package com.SpringLearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringLearning.model.Passenger;

@Repository
public interface ITicketRepo extends JpaRepository<Passenger, Integer> {

}
