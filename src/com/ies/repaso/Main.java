package com.ies.repaso;
import java.util.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float resta=0;
		float iva=0;
		int base=0;
		double total;
		String respuesta="";
		String bandera="";
		String bandera2="";
		
		System.out.print("Introduzca la base imponible: ");
		try {
			base= sc.nextInt();
		}catch(Exception e) {
			System.out.println("Error al introducir datos");
		}
		System.out.println();
		System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
		respuesta=sc.next();
		System.out.println();
		switch (respuesta) {
		case "general":
			iva=(float) 0.21;
			bandera="21%";
			break;
		case "reducido": 
			iva=(float) 0.10;
			bandera="10%";
			break;
		case "superreducido":
			iva=(float) 0.04;
			bandera="4%";
			break;
		default:
			System.out.println("Introduce la respuesta en minusculas");
		}
		iva=iva*base;
		System.out.print("Introduzca el codigo promocional (nopro, mitad, meno5 o 5porc): ");
		respuesta=sc.next();
		switch(respuesta){
			case "nopro":
				resta=0;
				bandera2="nopro";
				break;
			case "mitad":
				resta=(base+iva)/2;
				bandera2="mitad";
				break;
			case "meno5": 
				resta=5;
				bandera2="meno5";
				break;
			case "5porc":
				resta=(float) ((base+iva)*0.05);
				bandera2="5porc";
				break;
			default:
				System.out.println("Introduce la respuesta en minusculas");
		}
		total=(base+iva)-resta;
		System.out.println("Base imponible:        "+base);
		System.out.println("IVA ("+bandera+")              "+iva);
		System.out.println("Precio con iva:        "+(base+iva));
		System.out.println("Cod. promo. ("+bandera2+"): -"+resta);
		System.out.println("TOTAL                 "+total);
	}

}
