package com.masai.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Tickets;

@Repository
public interface TicketsDao extends JpaRepository<Tickets, Integer> {

}
