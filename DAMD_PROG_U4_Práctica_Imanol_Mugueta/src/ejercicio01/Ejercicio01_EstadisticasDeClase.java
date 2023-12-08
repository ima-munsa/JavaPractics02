package ejercicio01;

import java.util.Scanner;

public class Ejercicio01_EstadisticasDeClase {

	public static void main(String[] args) {
		
		// Variable de recogida de datos por Scanner
		Scanner lector = new Scanner(System.in);
		
		// Declaración de variables para comparar y clasificar notas
        double notaMasAltaAprobados = Double.MIN_VALUE;
        double notaMasBajaAprobados = Double.MAX_VALUE;
        double notaMasAltaSuspensos = Double.MIN_VALUE;
        double notaMasBajaSuspensos = Double.MAX_VALUE;
        double sumaNotasAprobados = 0;
        double sumaNotasTotal = 0;
        int contadorAprobados = 0;
		
		//Declaración Array para las notas
		double notas []= new double [10];
		
		//Registro de notas introducidas por usuario
		for (int i=0;i<notas.length;i++) {
			System.out.print("Introduce la nota del alumno "+i+": ");
			notas[i]=lector.nextDouble();
			sumaNotasTotal += notas[i];
			
			// CONDICIONALES PARA COMPROBACIÓN DE NOTAS MAS ALTAS, MAS BAJAS Y MEDIAS
			
			if (notas[i]>notaMasAltaAprobados) {
				notaMasAltaAprobados=notas[i];
			}
			if (notas[i]<5) {
				if (notas[i]>notaMasAltaSuspensos) {
					notaMasAltaSuspensos= notas[i];
				}
			}
			
			if (notas[i]>=5) {
				if (notas[i]<notaMasBajaAprobados) {
					notaMasBajaAprobados=notas[i];
				}
			}
			
			if (notas[i]<notaMasBajaSuspensos) {
				notaMasBajaSuspensos=notas[i];
			}
			
			if (notas[i]>=5) {
				contadorAprobados += 1;
				sumaNotasAprobados += notas[i];
			}
		}
		lector.close();
		
		//SALIDA DE DATOS CALCULADOS
		
		System.out.println("Nota más alta de los aprobados: " + notaMasAltaAprobados);
		System.out.println("Nota más baja de los aprobados: " + notaMasBajaAprobados);
		System.out.println("Nota más alta de los suspensos: " + notaMasAltaSuspensos);
		System.out.println("Nota más baja de los suspensos: " + notaMasBajaSuspensos);
		System.out.println("Nota media de los aprobados: " + (sumaNotasAprobados/contadorAprobados));
		System.out.println("Nota media del curso: " + (sumaNotasTotal/notas.length));
		
	}

}
