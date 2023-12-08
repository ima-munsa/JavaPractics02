package ejercicio03;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03_LaPiezaPerdida {

	public static void main(String[] args) {
		
		// Abrir Scanner
		Scanner lector = new Scanner(System.in);
		
		// Declarar Array
		int piezas[]= new int[10];
	
		// Declarar sumas de números totales y disponibles
		int sumaT=0;
		int sumaD=0;
		// Inicializar Array con números de 1 a 10
		for (int i=0;i<piezas.length;i++) {
			piezas[i]=i+1;
			sumaT += piezas[i];
		}
		
		// Solicitar piezas
		for (int i=0;i<piezas.length-1;i++) {
			System.out.print("Pieza (1-10): ");
			sumaD += lector.nextInt();
		}
		
		lector.close();
		if ((sumaT-sumaD)<=10 && (sumaT-sumaD)>=1) {
			System.out.println("Falta la pieza nº"+(sumaT-sumaD));
		} else {
			System.out.println("los valores recogidos no cuadran con los asignados a las piezas");
		}
	}

}
