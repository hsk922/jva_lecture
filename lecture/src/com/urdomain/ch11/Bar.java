package com.urdomain.ch11;

public class Bar {
	private String model;
	private String owner;
	
	public Bar() {
		
	}
	
	public Bar(String model) {
		this.model = model;
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOwner() {
		return owner;
	}

	private void setOwner(String owner) {
		this.owner = owner;
	}
}
