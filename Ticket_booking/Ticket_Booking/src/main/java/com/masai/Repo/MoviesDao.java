package com.masai.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Movies;

@Repository
public interface MoviesDao extends JpaRepository<Movies, Integer> {

}
