package ejercicio10;

import java.util.Scanner;

public class Sudoku_Validez_Main {

	public static void main(String[] args) {
		
		//Declaración Matriz y Variable tipo Scanner
		
		int sudoku [][] = new int [3][3];
		Scanner lector = new Scanner(System.in);
		
		// Solicitud de ingresar los valores del sudoku en las casillas
		
		for (int i = 0; i < sudoku.length; i++) {
			for (int j = 0; j < sudoku.length; j++) {
				System.out.println("Introduzca la coordenada (" + (i + 1) + "," + (j + 1) + "): ");
				sudoku [i][j]= lector.nextInt();
			}
		}
		
		// Corrección de Sudoku usando la clase Check_Sudoku para llamar a los métodos
			
		if (Check_Sudoku.sudoku_validez(sudoku)) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
		
		lector.close();
		
	}

}
