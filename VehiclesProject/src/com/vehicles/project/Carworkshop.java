package com.vehicles.project;

import java.util.*;

/*Volem fer un software per un taller de vehicles, que en aquest moment té motos i cotxes. Els cotxes sempre tindran quatre rodes i les motos dues. 
FASE 1:
Ens donen un codi parcialment desenvolupat. El codi pot no estar complet i que
 s’hagi de modificar. 
Ens demanen crear una classe Main que realitzi els següents passos:
1) Demanar a l’usuari la matrícula del cotxe, la marca i el seu color.
2) Crear el cotxe amb les dades anteriors. 
3) Afegir-li dues rodes traseres demanant a l’usuari la marca i el diametre.
4) Afegir-li dues rodes davanteres demanant a l’usuari la marca i el diametre.
*/

/*FASE 2: 

Millorar el codi anterior comprovant la informació necesaria alhora de crear els objectes. S’ha de tenir en compte:

Una matrícula ha de tenir 4 números i dues o tres lletres.
Un diametre de la roda ha de ser superior a 0.4 i inferior a 4

 */
public class Carworkshop {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Indica la matrícula: ");
		String plate= "544FJLL";//String plate=sc.nextLine();
		
		/*boolean plateOk=  PlateCheck(plate);
		while(plateOk==false) {
			System.out.println("Indica la matrícula: ");
			plate= "544FJLL";//String plate=sc.nextLine();
			plateOk=  PlateCheck(plate);
		}*/
		
		System.out.println("Indica la marca: ");
		String brand= "FORD";//String brand=sc.nextLine();
		System.out.println("Indica el color: ");
		String color="groc";//String color=sc.nextLine();
		Car car1= new Car(plate,brand,color);
		System.out.println("Aquest és el teu cotxe: "+car1.toString());
		
		System.out.println("Indica la marca de la roda davantera esquerra: ");
		String frontLeftBrand="MICHELIN";//String frontLeftBrand=sc.next();
		System.out.println("Indica el diàmetre de la roda davantera esquerra");
		double frontLeftDiameter=26;//double frontLeftDiameter=sc.nextDouble();
		System.out.println("Indica la marca de la roda trassera esquerra : ");
		String rearLeftBrand="FIRESTONE";//String rearLeftBrand=sc.next();
		System.out.println("Indica el diàmetre de la roda trassera esquerra: ");
		double rearLeftDiameter=28;//double rearLeftDiameter=sc.nextDouble();
		System.out.println("Indica la marca de la roda davantera dreta: ");
		String frontRightBrand="MICHELIN";//String frontRightBrand=sc.next();
		System.out.println("Indica el diàmetre de la roda davantera dreta: ");
		double frontRightDiameter=26;//double frontRightDiameter=sc.nextDouble();
		System.out.println("Indica la marca de la roda trassera esquerra: ");
		String rearRightBrand="FIRESTONE";//String rearRightBrand=sc.next();
		System.out.println("Indica el diàmetre de la roda trassera esquerra: ");
		double rearRightDiameter=28;//double rearRightDiameter=sc.nextDouble();
		
		
		Wheel frontLeftWheel= new Wheel(frontLeftBrand, frontLeftDiameter);
		Wheel rearLeftWheel= new Wheel(rearLeftBrand, rearLeftDiameter);
		Wheel frontRightWheel= new Wheel(frontRightBrand, frontRightDiameter);
		Wheel rearRightWheel= new Wheel(rearRightBrand, rearRightDiameter);
		
		List<Wheel> frontWheels = new ArrayList<Wheel>();
		List<Wheel> backWheels = new ArrayList<Wheel>(); 
		frontWheels.add(frontLeftWheel);
		frontWheels.add(frontRightWheel);
		backWheels.add(rearLeftWheel);
		backWheels.add(rearRightWheel);
		
		try {
			car1.addWheels(frontWheels, backWheels);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//addWheels(frontWheels,backWheels);
		
		
		/*for (Wheel element : frontWheels) {
			System.out.println(element.toString());
		}
		for (Wheel element : backWheels) {
			System.out.println(element.toString());
			
		}*/
	}


	
	/*public static boolean PlateCheck(String plate){
		boolean output =true;
		int plateLength=plate.length();
		if((plateLength!=6)&&(plateLength!=7)){
			System.out.println("El número de caràcters de la matrícula no és correcte");
			output=false;
		}
		else if(plateLength==6) {
			for(int i=0;i<5;i++) {
				if(isNan((plate.charAt(i))) {
					System.out.println("Els  primers 4 caràcters han de ser números");
					output=false;		
				}
			}	
			for(int i=4;i<6;i++) {
				if (!Character.isLetter(plate.charAt(i))) {
					System.out.println("Els últims 2 carácters han de ser lletres");
					output=false;
				}
			}
		}
		else if(plateLength==7) {
			for(int i=0;i<5;i++) {
				if(isNan(plate.charAt(i))) {
					System.out.println("Els  primers 4 caràcters han de ser números");
					output=false;
				}
			}	
			for(int i=4;i<7;i++) {
				if (!Character.isLetter(plate.charAt(i))) {
					System.out.println("Els últims 3 carácters han de ser lletres");
					output=false;
				}
			}
		}
	return output;
	}*/
	



}
