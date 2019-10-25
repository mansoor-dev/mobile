package com.axiomtelecom.assignment.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Releases")
public class Releases implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "priceEuro")
	private long priceEuro;

	@Column(name = "announceDate")
	private String announceDate;

	public Releases() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getPriceEuro() {
		return priceEuro;
	}

	public void setPriceEuro(long priceEuro) {
		this.priceEuro = priceEuro;
	}

	public String getAnnounceDate() {
		return announceDate;
	}

	public void setAnnounceDate(String announceDate) {
		this.announceDate = announceDate;
	}

}
