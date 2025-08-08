package com.wipro.entity.relationdemo1.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.entity.relationdemo1.entity.Movie;
import com.wipro.entity.relationdemo1.repo.MovieRepo;
import com.wipro.entity.relationdemo1.repo.GenreRepo;
import com.wipro.entity.relationdemo1.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepo movieRepo;

    @Autowired
    GenreRepo genreRepo;

    @Override
    public void save(Movie movie) {
        movieRepo.save(movie);
    }

    @Override
    public List<Movie> findAll() {
        return movieRepo.findAll();
    }
}
