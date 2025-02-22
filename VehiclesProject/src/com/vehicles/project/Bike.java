package com.vehicles.project;

import java.util.List;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}

		public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception();

		Wheel frontWheel = wheels.get(0);
		Wheel backWheel = wheels.get(1);

		if (!frontWheel.equals2(backWheel))
			throw new Exception();

		this.wheels.add(frontWheel);
		this.wheels.add(backWheel);
	}

		@Override
		public String toString() {
			return "Bike [plate=" + plate + ", brand=" + brand + ", color=" + color + ", wheels=" + wheels + "]";
		}
		
}

