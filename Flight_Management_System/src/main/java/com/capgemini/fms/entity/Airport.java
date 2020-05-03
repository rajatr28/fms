package com.capgemini.fms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="airport")
public class Airport {
@Id
private String airportCode;
private String airportName;
private String airportLocation;
public String getAirportCode() {
return airportCode;
}
public void setAirportCode(String airportCode) {
this.airportCode = airportCode;
}
public String getAirportName() {
return airportName;
}
public void setAirportName(String airportName) {
this.airportName = airportName;
}
public String getAirportLocation() {
return airportLocation;
}
public void setAirportLocation(String airportLocation) {
this.airportLocation = airportLocation;
}
public Airport(String airportCode, String airportName, String airportLocation) {
super();
this.airportCode = airportCode;
this.airportName = airportName;
this.airportLocation = airportLocation;
}
public Airport() {
super();
}
@Override
public String toString() {
return "Airport [airportCode=" + airportCode + ", airportName=" + airportName + ", airportLocation="
+ airportLocation + "]";
}


}