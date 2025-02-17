package com.jpa.test.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="skyler")
public class user {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;

private String name;

private String city;
private String status;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "user [id=" + id + ", name=" + name + ", city=" + city + ", status=" + status + "]";
}
public user() {
	super();
	// TODO Auto-generated constructor stub
}



}
