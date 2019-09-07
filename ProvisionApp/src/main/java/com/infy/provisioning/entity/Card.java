package com.infy.provisioning.entity;

public class Card {
	private int uuid;
	private String fpan;
	private String expirydate;

	public Card(int uuid, String fpan, String expirydate) {
		super();
		this.uuid = uuid;
		this.fpan = fpan;
		this.expirydate = expirydate;
	}

	public Card() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [empId=" + uuid + ", empName=" + fpan + ", department=" + expirydate + "]";
	}

	public int getUuid() {
		return uuid;
	}

	public void setUuid(int uuid) {
		this.uuid = uuid;
	}

	public String getFpan() {
		return fpan;
	}

	public void setFpan(String fpan) {
		this.fpan = fpan;
	}

	public String getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
}
