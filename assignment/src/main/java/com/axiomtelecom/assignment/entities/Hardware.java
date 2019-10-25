package com.axiomtelecom.assignment.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Hardware")
public class Hardware implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "audioJacks")
	private String audioJacks;

	@Column(name = "gps")
	private String gps;

	@Column(name = "battery")
	private String battery;

	public Hardware() {

	}

	public Hardware(long hid, String audioJacks, String gps, String battery, Mobile mobile) {
		super();
		this.id = hid;
		this.audioJacks = audioJacks;
		this.gps = gps;
		this.battery = battery;
	}

	public String getAudioJacks() {
		return audioJacks;
	}

	public void setAudioJacks(String audioJacks) {
		this.audioJacks = audioJacks;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGps() {
		return gps;
	}

	public void setGps(String gps) {
		this.gps = gps;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

}
