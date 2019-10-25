package com.axiomtelecom.assignment.response;

public class MobileResponse {

	private long id;
	private String brand;
	private String phone;
	private String picture;
	private ReleasesResponse releasesResp;
	private String sim;
	private String resolution;
	private HardwareResponse hardwareResp;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public ReleasesResponse getReleasesResp() {
		return releasesResp;
	}

	public void setReleasesResp(ReleasesResponse releasesResp) {
		this.releasesResp = releasesResp;
	}

	public HardwareResponse getHardwareResp() {
		return hardwareResp;
	}

	public void setHardwareResp(HardwareResponse hardwareResp) {
		this.hardwareResp = hardwareResp;
	}

}
