package com.masai.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.masai.Repo.MoviesDao;
import com.masai.model.Movies;



@Service
public class MoviesServiceImpl implements MoviesService {

	@Autowired
	private MoviesDao moviesDao;
	@Override
	public Movies saveMovies(Movies movies) {
		
		return moviesDao.save(movies);
	}

}
