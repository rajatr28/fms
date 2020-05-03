package com.capgemini.fms.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="schedule_flights")

public class ScheduledFlight {
	@Id
	
	private int availableSeats;
	
	@ManyToOne
    @JoinColumn(name="flight", nullable=false)
    private Flight flight;
	
	@ManyToOne
	@JoinColumn(name="schedule", nullable=false)
	private Schedule schedule;
	
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	public ScheduledFlight(Flight flight, int availableSeats,Schedule schedule) {
		super();
		this.flight = flight;
		this.availableSeats = availableSeats;
		this.schedule = schedule;
		
	}
	public ScheduledFlight() {
		super();
		}
	@Override
	public String toString() {
		return "ScheduledFlight [flight=" + flight + ", availableSeats=" + availableSeats + ", schedule=" + schedule
				+ "]";
	}
	

}
