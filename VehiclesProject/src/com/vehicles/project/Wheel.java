package com.vehicles.project;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) {
		this.brand = brand;
		this.diameter = diameter;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	public boolean equals(Object leftWheel) {
		
		if(leftWheel instanceof Wheel) {
			
		Wheel testWheel=(Wheel)leftWheel;
		
			if(this.diameter==testWheel.diameter) {
				return true;
			}
			else {
				return false;
			}
		
		}
		else {
			return false;
		}
	}
	

	@Override
	public String toString() {
		return "Wheel [brand=" + this.getBrand() + ", diameter=" + this.getDiameter() + "]";
	}
	
	
}
