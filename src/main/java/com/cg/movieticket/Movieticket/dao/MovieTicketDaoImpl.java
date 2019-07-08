package com.cg.movieticket.Movieticket.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.movieticket.Movieticket.bean.MovieticketBean;
import com.cg.movieticket.Movieticket.repository.TicketRepository;
@Repository
public class MovieTicketDaoImpl implements MovieTicketDao{
	@Autowired
private TicketRepository repository;
	@Override
	public MovieticketBean addDetails(MovieticketBean ticket) {
		// TODO Auto-generated method stub
		return (MovieticketBean) repository.save(ticket);
	}

}
