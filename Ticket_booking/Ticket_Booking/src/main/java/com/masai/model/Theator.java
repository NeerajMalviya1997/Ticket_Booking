package com.masai.model;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Theator {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer theatorId;
	private String theatorName;
	private String address;
	private String city;
	private String pin;
	
	@JsonIgnore
	@OneToMany
	List<Tickets> tickets;
	
}
