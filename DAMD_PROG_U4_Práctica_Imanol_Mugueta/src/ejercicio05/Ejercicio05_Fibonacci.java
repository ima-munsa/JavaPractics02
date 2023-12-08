package ejercicio05;

import java.util.Scanner;

public class Ejercicio05_Fibonacci {

	public static void main(String[] args) {
		
		// Abrir Scanner
		Scanner lector = new Scanner(System.in);
		
		// Solicitamos número de registros de la matriz al usuario
		System.out.print("¿Termino de Fibonacci a calcular? ");
		int numero= lector.nextInt();		
		
		// Declarar Matriz 
		int fibonacci[] = new int[numero];
		
        // Inicializar los dos primeros valores a 1
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        
        // Registrar resto de valores con secuencia Fibonacci hasta el número de registros seleccionado
        for (int i = 2; i < numero; i++) {
        	fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
       
        
        // Dar salida a secuencia de Fibonacci
        System.out.println("FIBONACCI");
        for (int i = 0; i < numero; i++) {
            System.out.print(fibonacci[i]+", ");
        }
    }

}

