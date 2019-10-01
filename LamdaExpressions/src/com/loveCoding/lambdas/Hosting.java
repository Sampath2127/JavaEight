package com.loveCoding.lambdas;

public class Hosting {

	private int id;
	private String hostUrl;
	private int value;
	
	public Hosting(int id, String hostUrl, int value) {
		this.id=id;
		this.hostUrl=hostUrl;
		this.value=value;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHostUrl() {
		return hostUrl;
	}

	public void setHostUrl(String hostUrl) {
		this.hostUrl = hostUrl;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	
}
