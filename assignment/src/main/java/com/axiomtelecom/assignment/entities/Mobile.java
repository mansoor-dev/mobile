package com.axiomtelecom.assignment.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MOBILE")
public class Mobile implements Serializable {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "brand")
	private String brand;

	@Column(name = "phone")
	private String phone;

	@Column(name = "picture")
	private String picture;

	@Column(name = "sim")
	private String sim;

	@Column(name = "resolution")
	private String resolution;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "hardware_id", referencedColumnName = "id")
	private Hardware hardware;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "releases_id", referencedColumnName = "id")
	private Releases releases;

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brand=" + brand + ", phone=" + phone + ", picture=" + picture + ", sim=" + sim
				+ ", resolution=" + resolution + ", hardware=" + hardware + ", releases=" + releases + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Hardware getHardware() {
		return hardware;
	}

	public void setHardware(Hardware hardware) {
		this.hardware = hardware;
	}

	public Releases getReleases() {
		return releases;
	}

	public void setReleases(Releases releases) {
		this.releases = releases;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getSim() {
		return sim;
	}

	public void setSim(String sim) {
		this.sim = sim;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

}
