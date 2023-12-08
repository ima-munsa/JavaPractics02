package ejercicio02;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02_EliminarNumeroArray {

	public static void main(String[] args) {
		
		// Definimos Scanner
		Scanner lector = new Scanner(System.in);
		
		//Declaración variable numero a borrar
		int numero;
		
		// Declaración Arrays
		int arrayOriginal[]= {5,7,4,8,5,9,2,4,0,3};
		int arrayModificado[];
	
		// Mostrar Array Original y solicitud número a eliminar
		System.out.println("Array original = " + Arrays.toString(arrayOriginal));
		System.out.print("Introduce el número a eliminar del array:");
		numero=lector.nextInt();
		
		
		// Bucle para colocar las posiciones correctas del nuevo array
		int eliminados =0;
		for (int i:arrayOriginal) {
			if (arrayOriginal[i]==numero) {
				eliminados++;
			}
		}
		
		// Colocamos las posiciones correctas al nuevo array
		arrayModificado= new int[arrayOriginal.length-eliminados];
		
		
		// Bucle para crear un nuevo array sin el valor introducido
		int j=0; //Indice para Array modificado
		for (int i=0;i<arrayOriginal.length;i++) {
			if (arrayOriginal[i]!=numero) {
				arrayModificado[j]=arrayOriginal[i];
				j++;
			}
		
			
		}

		//Salida resultado nuevo Array modificado sin el valor a eliminar
		System.out.println("Resultado= "+Arrays.toString(arrayModificado));
	
		lector.close();
		
	}
}
