package com.cg.movieticket.Movieticket.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "MovieTicket")
public class MovieticketBean {
	@Id
	private int movieId;
	private int ticketId;
	private int theatreId;
	private int seatId;
	private String state;
	private String city;
	private String theatreName;
	private String movieName;
	private String movieDetails;
	private String seatCategories;
	private String amount;
	private Date date;
	private String time;
	@Override
	public String toString() {
		return "MovieticketBean [movieId=" + movieId + ", ticketId=" + ticketId
				+ ", theatreId=" + theatreId + ", seatId=" + seatId
				+ ", state=" + state + ", city=" + city + ", theatreName="
				+ theatreName + ", movieName=" + movieName + ", movieDetails="
				+ movieDetails + ", seatCategories=" + seatCategories
				+ ", amount=" + amount + ", date=" + date + ", time=" + time
				+ "]";
	}
	public MovieticketBean(int movieId, int ticketId, int theatreId,
			int seatId, String state, String city, String theatreName,
			String movieName, String movieDetails, String seatCategories,
			String amount, Date date, String time) {
		super();
		this.movieId = movieId;
		this.ticketId = ticketId;
		this.theatreId = theatreId;
		this.seatId = seatId;
		this.state = state;
		this.city = city;
		this.theatreName = theatreName;
		this.movieName = movieName;
		this.movieDetails = movieDetails;
		this.seatCategories = seatCategories;
		this.amount = amount;
		this.date = date;
		this.time = time;
	}
	public MovieticketBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieDetails() {
		return movieDetails;
	}
	public void setMovieDetails(String movieDetails) {
		this.movieDetails = movieDetails;
	}
	public String getSeatCategories() {
		return seatCategories;
	}
	public void setSeatCategories(String seatCategories) {
		this.seatCategories = seatCategories;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}
