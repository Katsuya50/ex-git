package com.example;

import java.time.LocalDate;

public class Car {
	
	private String name;
	private Integer speed;
	private String color;
	private LocalDate today;
	
	public Car() {
	}
	
	public Car(String name, Integer speed, String color) {
		super();
		this.name = name;
		this.speed = speed;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", speed=" + speed + ", color=" + color + ", today=" + today + "]";
	}

	public LocalDate getToday() {
		return today;
	}

	public void setToday(LocalDate today) {
		this.today = today;
	}

}
