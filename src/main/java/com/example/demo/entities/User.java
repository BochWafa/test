package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class User {
	@Id
	@GeneratedValue
private Long id;
private String username;
private String lastname;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public User(String username, String lastname) {
	this.username = username;
	this.lastname = lastname;
}
@Override
public String toString() {
	return "User [id=" + id + ", username=" + username + ", lastname=" + lastname + "]";
}
public User() {
	super();
}

}
