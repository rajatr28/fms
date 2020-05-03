package com.capgemini.fms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="schedule")
public class Schedule {

@Id
private String sourceAirport;
private String destinationAirport;
private String arrivalTime;
private String departureTime;

public String getSourceAirport() {
return sourceAirport;
}
public void setSourceAirport(String sourceAirport) {
this.sourceAirport = sourceAirport;
}
public String getDestinationAirport() {
return destinationAirport;
}
public void setDestinationAirport(String destinationAirport) {
this.destinationAirport = destinationAirport;
}
public String getArrivalTime() {
return arrivalTime;
}
public void setArrivalTime(String arrivalTime) {
this.arrivalTime = arrivalTime;
}
public String getDepartureTime() {
return departureTime;
}
public void setDepartureTime(String departureTime) {
this.departureTime = departureTime;
}

public Schedule (String sourceAirport, String destinationAirport, String arrivalTime, String departureTime)
{
super();
this.sourceAirport = sourceAirport;
this.destinationAirport = destinationAirport;
this.arrivalTime = arrivalTime;
this.departureTime = departureTime;
}
public Schedule() {
super();
}
@Override
public String toString() {
return "Schedule[ sourceAirport= " +sourceAirport+ ", destinationAirport= " +destinationAirport+ ", arrivalTime= " +arrivalTime+ ", departureTime= " +departureTime+ "]";

}
}
