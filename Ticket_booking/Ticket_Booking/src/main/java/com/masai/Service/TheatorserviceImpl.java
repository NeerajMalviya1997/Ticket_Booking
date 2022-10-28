package com.masai.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Repo.TheatorDao;
import com.masai.model.Theator;

@Service
public class TheatorserviceImpl implements TheatorService {

	@Autowired
	private TheatorDao theatorDao;

	@Override
	public Theator saveMovies(Theator theator) {
		// TODO Auto-generated method stub
		return theatorDao.save(theator);
	}
}
