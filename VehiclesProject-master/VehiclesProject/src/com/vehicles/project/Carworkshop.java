package com.vehicles.project;

import java.util.*;

/*Volem fer un software per un taller de vehicles, que en aquest moment t� motos i cotxes. Els cotxes sempre tindran quatre rodes i les motos dues. 
FASE 1:
Ens donen un codi parcialment desenvolupat. El codi pot no estar complet i que
 s�hagi de modificar. 
Ens demanen crear una classe Main que realitzi els seg�ents passos:
1) Demanar a l�usuari la matr�cula del cotxe, la marca i el seu color.
2) Crear el cotxe amb les dades anteriors. 
3) Afegir-li dues rodes traseres demanant a l�usuari la marca i el diametre.
4) Afegir-li dues rodes davanteres demanant a l�usuari la marca i el diametre.
*/

/*FASE 2: 

Millorar el codi anterior comprovant la informaci� necesaria alhora de crear els objectes. S�ha de tenir en compte:

Una matr�cula ha de tenir 4 n�meros i dues o tres lletres.
Un diametre de la roda ha de ser superior a 0.4 i inferior a 4

 */
public class Carworkshop {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Indica la matr�cula: ");
		String plate= "544FJLL";//String plate=sc.nextLine();
		
		String numericalPlate=plate.substring(0,3);
		for(int i=0;i<=numericalPlate.length();i++) {
			
		}
		
		System.out.println("Indica la marca: ");
		String brand= "FORD";//String brand=sc.nextLine();
		System.out.println("Indica el color: ");
		String color="groc";//String color=sc.nextLine();
		Car car1= new Car(plate,brand,color);
		System.out.println("Aquest �s el teu cotxe: "+car1.toString());
		
		System.out.println("Indica la marca de la roda davantera esquerra: ");
		String frontLeftBrand="MICHELIN";//String frontLeftBrand=sc.next();
		System.out.println("Indica el di�metre de la roda davantera esquerra");
		double frontLeftDiameter=26;//double frontLeftDiameter=sc.nextDouble();
		System.out.println("Indica la marca de la roda trassera esquerra : ");
		String rearLeftBrand="FIRESTONE";//String rearLeftBrand=sc.next();
		System.out.println("Indica el di�metre de la roda trassera esquerra: ");
		double rearLeftDiameter=28;//double rearLeftDiameter=sc.nextDouble();
		System.out.println("Indica la marca de la roda davantera dreta: ");
		String frontRightBrand="MICHELIN";//String frontRightBrand=sc.next();
		System.out.println("Indica el di�metre de la roda davantera dreta: ");
		double frontRightDiameter=26;//double frontRightDiameter=sc.nextDouble();
		System.out.println("Indica la marca de la roda trassera esquerra: ");
		String rearRightBrand="FIRESTONE";//String rearRightBrand=sc.next();
		System.out.println("Indica el di�metre de la roda trassera esquerra: ");
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
		
		for (Wheel element : frontWheels) {
			System.out.println(element.toString());
		}
		for (Wheel element : backWheels) {
			System.out.println(element.toString());
			
		}
}

	private static boolean isNan(char charAt) {
		// TODO Auto-generated method stub
		return false;
	}		
		
		

}
