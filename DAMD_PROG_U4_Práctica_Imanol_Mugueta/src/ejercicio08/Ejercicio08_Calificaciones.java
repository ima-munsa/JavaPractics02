package ejercicio08;

import java.util.Scanner;

public class Ejercicio08_Calificaciones {

	public static void main(String[] args) {
		
		// Abrir Scanner
		Scanner lector = new Scanner(System.in);
		
		// Declarar Matriz bidimensional con número de registros
		int registro [][] = new int [4][5];
		
		for (int i=0;i<registro.length;i++) {
			for (int j=0; j<registro[i].length;j++) {
				System.out.print("Introduce la nota del alumno "+j+" para la asignatura "+i+": ");
				registro[i][j]=lector.nextInt();
				
			}
		}	
		// Declarar variables contar notas
		
		double sumaNotasTot=0;
		for (int i=0; i<registro.length;i++) {
			double sumaNotasDet=0;
			double notaAlta= Double.MIN_VALUE;
			for(int j=0; j<registro[i].length;j++) {
				sumaNotasDet += registro[i][j];
				sumaNotasTot += registro[i][j];
				if (registro[i][j]>notaAlta) {
					notaAlta=registro[i][j];
					
				}
			}
			
			System.out.println("Nota más alta de la asignatura "+i+": "+notaAlta);
			System.out.println("Nota media de la asignatura "+i+": "+(sumaNotasDet/registro[i].length));
		}
			// Calcular la media de todos los alumnos en todas las asignaturas
	        double mediaTotalAlumnos = sumaNotasTot / (registro.length * registro[0].length);
	        System.out.printf("Nota media de los alumnos en todas las asignaturas: " + mediaTotalAlumnos);

		lector.close();

	}

}
