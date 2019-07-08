package com.cg.movieticket.Movieticket.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.movieticket.Movieticket.bean.MovieticketBean;

@Repository
public interface TicketRepository extends CrudRepository<MovieticketBean, String>{
	

}
