package ejercicio06;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio06_OrdenarArray {

	public static void main(String[] args) {
		
		// Abrir Scanner
		Scanner lector = new Scanner (System.in);
		
		// Declarar matriz
		int numeros [] = new int [10];
		
		// Solicitar los 10 números al usuario
		for(int i=0;i<numeros.length;i++) {
			System.out.print("Introduce el elemento nº"+i+": ");
			numeros[i]=lector.nextInt();
		}
		
		Arrays.sort(numeros); // Función para ordenar los números del Array
		
		// Imprimos cada uno de los números ya ordenados
		for (int i=0;i<numeros.length;i++) {
			System.out.println("Valor "+(i+1)+": "+numeros[i]);
		}

	}

}
