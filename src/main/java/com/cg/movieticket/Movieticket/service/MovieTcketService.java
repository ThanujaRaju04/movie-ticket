package com.cg.movieticket.Movieticket.service;

import org.springframework.stereotype.Service;

import com.cg.movieticket.Movieticket.bean.MovieticketBean;
@Service
public interface MovieTcketService {

	MovieticketBean addDetails(MovieticketBean ticket);
	

}
