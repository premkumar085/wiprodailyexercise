package com.wipro.entity.relationdemo1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wipro.entity.relationdemo1.entity.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> { }
