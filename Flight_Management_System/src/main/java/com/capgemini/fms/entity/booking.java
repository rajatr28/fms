package com.capgemini.fms.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="booking")




public class booking {
	@Id
	private long bookingId;
	private long ticketCost;
	private int noOfPassengers;
	@ManyToOne
	    @JoinColumn(name="user1", nullable=false)
	    private User1 UserId;
	@OneToMany(mappedBy="booking")
	    private List<Passenger> passengerList;
	
	@ManyToOne
	    @JoinColumn(name="flight", nullable=false)
	    private Flight flight;

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public long getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(long ticketCost) {
		this.ticketCost = ticketCost;
	}

	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	public User1 getUserId() {
		return UserId;
	}

	public void setUserId(User1 userId) {
		UserId = userId;
	}

	public List<Passenger> getPassengerList() {
		return passengerList;
	}

	public void setPassengerList(List<Passenger> passengerList) {
		this.passengerList = passengerList;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public booking(long bookingId, long ticketCost, int noOfPassengers, User1 userId, List<Passenger> passengerList,
			Flight flight) {
		super();
		this.bookingId = bookingId;
		this.ticketCost = ticketCost;
		this.noOfPassengers = noOfPassengers;
		UserId = userId;
		this.passengerList = passengerList;
		this.flight = flight;
	}

	public booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "booking [bookingId=" + bookingId + ", ticketCost=" + ticketCost + ", noOfPassengers=" + noOfPassengers
				+ ", UserId=" + UserId + ", passengerList=" + passengerList + ", flight=" + flight + "]";
	}
	

}
