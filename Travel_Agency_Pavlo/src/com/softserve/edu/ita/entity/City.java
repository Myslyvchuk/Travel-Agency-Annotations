package com.softserve.edu.ita.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;

@Entity
@Table(name = "city")
public class City {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "city", length = 32)
	private String city;
	@ManyToOne
//	@Column(name = "countryID", length = 32)
	private Country countryID;
	@OneToMany(mappedBy = "cityID", cascade = CascadeType.PERSIST)
	private Set<Hotel> hotel;

	public City() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Country getCountryID() {
		return countryID;
	}

	public void setCountryID(Country countryID) {
		this.countryID = countryID;
	}

	public Set<Hotel> getHotel() {
		return hotel;
	}

	public void setHotel(Set<Hotel> hotel) {
		this.hotel = hotel;
	}

}
