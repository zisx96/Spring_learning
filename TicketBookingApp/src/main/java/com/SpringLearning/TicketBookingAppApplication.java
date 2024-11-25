package com.SpringLearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(
		
		info=@Info(
				
				title="Ticket Booking API",
				version=" v1.0",
				description="This API will generate Ticket"
				),
		
		servers=@Server(
				
				url="http://localhost:8484/TicketBookingAPI",
				description= "This API is deployed in the following url"
				)
		
		)
public class TicketBookingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingAppApplication.class, args);
	}

}
