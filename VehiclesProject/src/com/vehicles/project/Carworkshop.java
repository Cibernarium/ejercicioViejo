package com.vehicles.project;

import java.util.*;


public class Carworkshop {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Indica la matrícula: ");
		String plate=sc.nextLine();
		
		boolean plateOk=  PlateCheck(plate);
		while(plateOk==false) {
			System.out.println("Indica la matrícula: ");
			plate=sc.nextLine();
			plateOk=  PlateCheck(plate);
		}
		
		System.out.println("Indica la marca: ");
		String brand=sc.next();
		System.out.println("Indica el color: ");
		String color=sc.next();
		String targetVehicle;
		
		System.out.println("Indica si es tracta d'un 'CAR' o una 'BIKE' ");
		targetVehicle=sc.next().toUpperCase();
		
		switch (targetVehicle) {

		case "CAR":
			Car car1= new Car(plate,brand,color);
			
			List<Wheel> frontWheels = new ArrayList<Wheel>();
			List<Wheel> backWheels = new ArrayList<Wheel>(); 
			frontWheels.add(CreateFrontWheel());
			frontWheels.add(CreateFrontWheel());
			backWheels.add(CreateRearWheel());
			backWheels.add(CreateRearWheel());   
			
			try {
				car1.addWheels(frontWheels, backWheels);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			System.out.println("Aquest és el teu cotxe: "+car1.toString());
			break;
			
        
		case "BIKE":
        	Bike bike1= new Bike(plate,brand,color);
			
			
			List<Wheel> Wheels = new ArrayList<Wheel>();
			Wheels.add(CreateFrontWheel());
			Wheels.add(CreateRearWheel());
			
			try {
				bike1.addTwoWheels(Wheels);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			System.out.println("Aquesta és la teva moto: "+bike1.toString());
			break;	

		default:
			throw new IllegalArgumentException("Tipo de vehículo erroneo: " + targetVehicle);
		}
		
	}

	
	
	public static boolean PlateCheck(String plate){
		boolean output =true;
		  if (plate.toUpperCase().matches("^[0-9]{4}[A-Z]{3}$")) {
		        return output;
		  }      
		  else if (plate.toUpperCase().matches("^[0-9]{4}[A-Z]{2}$")) {
			    return output;      
		  }
		  else{
			  System.out.println("Matrícula equivocada");
		      return output=false;
		  }      
	}
	
	
	
	
	public static double DiameterCheck(double diameter){
		while(diameter<0.4||diameter>4){
			Scanner sc=new Scanner(System.in);
			System.out.println("Diàmetre incorrecte,indica el diàmetre de la roda(0,4-4): ");
			diameter=sc.nextDouble();
		}
		return diameter;
	}
	
	
	
	public static Wheel CreateFrontWheel() {
		String brand;
		double diameter;
		Scanner sc=new Scanner(System.in);
			System.out.println("Indica la marca de la roda davantera: ");
			brand=sc.next();
			System.out.println("Indica el diàmetre de la roda davantera(0,4-4): ");
			diameter=sc.nextDouble();
			diameter=DiameterCheck(diameter);
			Wheel wheel = new Wheel(brand,diameter);
		return wheel ;
	}
	
	
	public static Wheel CreateRearWheel() {
		String brand;
		double diameter;
		Scanner sc=new Scanner(System.in);
			System.out.println("Indica la marca de la roda trassera: ");
			brand=sc.next();
			System.out.println("Indica el diàmetre de la roda trassera(0,4-4): ");
			diameter=sc.nextDouble();
			diameter=DiameterCheck(diameter);
		Wheel wheel = new Wheel(brand,diameter);
		return wheel;
	}
	
		
		
}
	
	
	
	
	
	
