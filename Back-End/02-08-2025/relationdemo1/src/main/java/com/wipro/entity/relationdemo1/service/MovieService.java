package com.wipro.entity.relationdemo1.service;

import java.util.List;
import com.wipro.entity.relationdemo1.entity.Movie;

public interface MovieService {
    void save(Movie movie);
    List<Movie> findAll();
}
