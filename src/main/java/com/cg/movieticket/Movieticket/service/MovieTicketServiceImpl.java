package com.cg.movieticket.Movieticket.service;

import org.springframework.stereotype.Service;

import com.cg.movieticket.Movieticket.bean.MovieticketBean;
import com.cg.movieticket.Movieticket.dao.MovieTicketDao;
@Service
public class MovieTicketServiceImpl implements MovieTcketService{
MovieTicketDao dao;
	@Override
	public MovieticketBean addDetails(MovieticketBean ticket) {
		// TODO Auto-generated method stub
		return dao.addDetails(ticket);
	}

}
