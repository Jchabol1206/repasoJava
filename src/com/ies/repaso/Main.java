package com.ies.repaso;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digito=0, comodin;
		String numero= "";
		String contador= "";
		boolean numCorrecto = false;
		Scanner sc = new Scanner(System.in);
		
		
		do {
			try {	
				System.out.println("Introduce una cadena numerica: ");
				numero=sc.next();
				System.out.println("Introduce el numero buscado");
				digito=sc.nextInt();
				numCorrecto=true;
			}catch(Exception e) {
				System.out.println("Introduce un numero.");
			}
		}while(!numCorrecto);
			for(int i=0; i<numero.length();i++) {
				comodin= Integer.parseInt(numero.valueOf(numero.charAt(i)));
				if(comodin==digito) {
					contador+=i+1+" ";
				}
			}
		System.out.println("Este digito se encuentra en las posiciones "+contador);
		sc.close();
	}

}
