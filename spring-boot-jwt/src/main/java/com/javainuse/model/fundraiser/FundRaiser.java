package com.javainuse.model.fundraiser;

public class FundRaiser {
	private String userName;
	private String company;
	private String [] myDonationArray;
	private double amount;
	private String description;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String[] getMyDonationArray() {
		return myDonationArray;
	}
//	passing an array;
	public void setMyDonationArray(String... myDonationArray) {
		this.myDonationArray = myDonationArray;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


}

