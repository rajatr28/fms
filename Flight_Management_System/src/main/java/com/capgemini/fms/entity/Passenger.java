package com.capgemini.fms.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "passenger")

public class Passenger {

@Id
private long prnNumber;
private String passengerName;
private int passengerAge;
private long passengerUIN;
private double Luggage;

public long getPrnNumber() {
return prnNumber;
}

public void setPrnNumber(long prnNumber) {
this.prnNumber = prnNumber;
}

public String getPassengerName() {
return passengerName;
}

public void setPassengerName(String passengerName) {
this.passengerName = passengerName;
}

public int getPassengerAge() {
return passengerAge;
}

public void setPassengerAge(int passengerAge) {
this.passengerAge = passengerAge;
}

public long getPassengerUIN() {
return passengerUIN;
}

public void setPassengerUIN(long passengerUIN) {
this.passengerUIN = passengerUIN;
}

public double getLuggage() {
return Luggage;
}

public void setLuggage(double luggage) {
Luggage = luggage;
}

public Passenger(long prnNumber, String passengerName, int passengerAge,long passengerUIN,double Luggage){
super();
this.prnNumber=prnNumber;
this.passengerName=passengerName;
this.passengerAge=passengerAge;
this.passengerUIN=passengerUIN;
this.Luggage=Luggage;
}
public Passenger() {
super();
}
public String toString() {
return "Passenger [prnNumber=" + prnNumber + ", passengerName=" + passengerName + ", passengerAge=" + passengerAge
+ ", passengerUIN=" + passengerUIN + ", Luggage=" + Luggage +" ]";
}

}
