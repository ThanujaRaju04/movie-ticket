package com.cg.movieticket.Movieticket.dao;

import org.springframework.stereotype.Repository;

import com.cg.movieticket.Movieticket.bean.MovieticketBean;
@Repository
public interface MovieTicketDao {

	MovieticketBean addDetails(MovieticketBean ticket);

}
