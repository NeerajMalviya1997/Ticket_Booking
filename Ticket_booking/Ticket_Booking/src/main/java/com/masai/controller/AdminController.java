package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Service.MoviesServiceImpl;
import com.masai.Service.TheatorserviceImpl;
import com.masai.Service.TicketsServiceImpl;
import com.masai.model.Movies;
import com.masai.model.Theator;
import com.masai.model.Tickets;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/admin")
public class AdminController {

	
	@Autowired
	private MoviesServiceImpl moviesServiceImpl;
	@Autowired
	private TheatorserviceImpl theatorserviceImpl;
	@Autowired
	private TicketsServiceImpl ticketsServiceImpl;
	
	
	
	@PostMapping("/movies")
	public Movies saveMovies(@RequestBody Movies movies) {
		return moviesServiceImpl.saveMovies(movies);
	}
	
	@PostMapping("/theator")
	public Theator save(@RequestBody Theator theator) {
		return theatorserviceImpl.saveMovies(theator);
	}
	
	@PostMapping("/tickets")
	public Tickets saveTickets(@RequestBody Tickets tickets) {
		return ticketsServiceImpl.saveTickets(tickets);
	}
	
}
