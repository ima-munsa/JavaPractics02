package ejercicio09;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio09_CombinarArraysOrdenar {

	public static void main(String[] args) {
		
		// Abrir Scanner
		Scanner lector = new Scanner (System.in);
		
		// Declaración 2 Arrays de 10 registros
		int lista1 [] = new int [10];
		
		int lista2 [] = new int [10];
		
		//Declaración Array combinado de 20 registros
		
		int listaCombo [] = new int [20];
		
		// Solicitud de registros al usuario en las 2 arrays y añadiendo los valores a su vez a la lista combinada
		System.out.println("Valores para el primer array");
		
		for(int i=0;i<lista1.length;i++) {
			System.out.print("Introduce el elemento nº"+i+": ");		
			lista1 [i] = lector.nextInt();
			listaCombo[i]=lista1[i];
		}
		
		System.out.println("Valores para el segundo array");
		
		for(int i=0;i<lista2.length;i++) {
			System.out.print("Introduce el elemento nº"+i+": ");		
			lista2 [i] = lector.nextInt();
			listaCombo[i+10]=lista2[i];	// recogemos los valores en la lista combinada desde el indice 10 hasta el 19
		}

		
		// Ordenamos la lista combinada y le damos salida por pantalla una vez ordenada
		Arrays.sort(listaCombo);
			
		System.out.println("Arrays resultado ordenado");
		for (int i=0;i<listaCombo.length;i++) {
			System.out.println(listaCombo[i]);
		}
		
		lector.close();
	}

}
