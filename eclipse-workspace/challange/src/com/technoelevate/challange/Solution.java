package com.technoelevate.challange;
public class Solution {
	private String name;
	private double deposit;
	private double costPerDay;
	public Solution(String name, double deposit, double costPerDay) {
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}
	public void display() {
		System.out.println("item type :"+getName());
		System.out.println("Deposit Amount :"+getDeposit());
		System.out.println("Cost Per Day :"+getCostPerDay());
	}
}
