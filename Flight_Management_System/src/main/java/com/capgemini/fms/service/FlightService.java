package com.capgemini.fms.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.fms.dao.FlightDao;
import com.capgemini.fms.entity.Flight;



@Service
@Transactional
public class FlightService {
	
	@Autowired
	private FlightDao flightDao;
	public Flight addflight(Flight flight) {

		return flightDao.save(flight);

	}
	
	public List<Flight> retrieve(){
		List<Flight> flights = new ArrayList<Flight>();
		for(Flight flight : flightDao.findAll()) {
			flights.add(flight);
		}
		
		return flights;
	}

	public void deleteflight(int flightNumber) {

		flightDao.deleteById(flightNumber);
	}
	
	public Flight editflight (int flightNumber) {
		return flightDao.getOne(flightNumber);
	}
	

}



