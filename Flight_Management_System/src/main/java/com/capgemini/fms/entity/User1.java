package com.capgemini.fms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User1")
public class User1 {
	
@Id
private int userId;

private String userType;
private String userName;
private int userPassword;
private String userEmail;
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserType() {
	return userType;
}
public void setUserType(String userType) {
	this.userType = userType;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public int getUserPassword() {
	return userPassword;
}
public void setUserPassword(int userPassword) {
	this.userPassword = userPassword;
}
public String getUserEmail() {
	return userEmail;
}
public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}
public User1(int userId, String userType, String userName, int userPassword, String userEmail) {
	super();
	this.userId = userId;
	this.userType = userType;
	this.userName = userName;
	this.userPassword = userPassword;
	this.userEmail = userEmail;
}
public User1() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "User1 [userId=" + userId + ", userType=" + userType + ", userName=" + userName + ", userPassword="
			+ userPassword + ", userEmail=" + userEmail + "]";
}

}