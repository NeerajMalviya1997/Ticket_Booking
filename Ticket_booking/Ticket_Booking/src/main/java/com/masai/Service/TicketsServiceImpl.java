package com.masai.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Repo.TicketsDao;
import com.masai.model.Tickets;

@Service
public class TicketsServiceImpl implements TicketsService {

	@Autowired
	private TicketsDao ticketsDao;

	@Override
	public Tickets saveTickets(Tickets tickets) {
		// TODO Auto-generated method stub
		return ticketsDao.save(tickets);
	}
}
