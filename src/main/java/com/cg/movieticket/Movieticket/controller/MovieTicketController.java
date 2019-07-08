package com.cg.movieticket.Movieticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.movieticket.Movieticket.bean.MovieticketBean;
import com.cg.movieticket.Movieticket.service.MovieTcketService;

@RestController
public class MovieTicketController {
	
	@Autowired
	MovieTcketService service;
	
	
	@RequestMapping("/home")
	public ModelAndView home() {
		return new ModelAndView("home");
	}
	@RequestMapping("/addMovieDetails")
	public ModelAndView addMovie() {
		return new ModelAndView("addMovieDetails", "ticket", new MovieticketBean());
	}
		
	@RequestMapping("/addSuccess")
	public ModelAndView addSuccess(@ModelAttribute MovieticketBean ticket) {
		MovieticketBean ticket2 = new MovieticketBean();
		ModelAndView view = null;
		ticket2 = service.addDetails(ticket);
		view = new ModelAndView("addSuccess", "ticket", ticket2);
		return view;

	}
	
	
	

}
