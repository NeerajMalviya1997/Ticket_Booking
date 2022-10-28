package com.masai.model;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer movieId;
	private String Genre;
	private String type;
	private String Duration;
	private Date dateOfRelease;
	@Embedded
	private Cast cast;
	
	
}
