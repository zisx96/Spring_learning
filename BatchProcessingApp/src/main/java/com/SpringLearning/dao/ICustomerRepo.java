package com.SpringLearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringLearning.model.Customer;

@Repository
public interface ICustomerRepo extends JpaRepository<Customer, Integer> {

}
