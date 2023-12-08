package ejercicio04;

import java.util.Scanner;

public class Ejercicio04_HorasSalario {

	public static void main(String[] args) {
		
		// Abrir Scanner
		Scanner lector = new Scanner (System.in);
		
		//Declarar variables
		double sumaSalarios=0;
		
		//Declarar Array
		int horasTrabajadas[] = new int [5];
		double salarioTotal[] = new double [5];
		
		// Registro de horas trabajadas
		for (int i=0;i<horasTrabajadas.length;i++) {
			System.out.print("Horas trabajadas por el empleado nº"+(i+1)+" : ");
			int horas = lector.nextInt();
			if(horas>=160) {
				horasTrabajadas[i]=horas;
			}
			else {
				i--; // Si las horas son menores a 160 se descuenta 1 al contador para repetir
			}	
		}
		// Registro de salario total a percibir dependiendo de las horas
		int j=0; // Añadir contador para recorrer posiciones de horasTrabajadas
		for (int i=0;i<salarioTotal.length;i++) {
			
			if (horasTrabajadas[j]==160) {
				salarioTotal[i]=1100;
			}
			if (horasTrabajadas[j]>160&&horasTrabajadas[j]<=180) {
				salarioTotal[i]=1100+((horasTrabajadas[j]-160)*10);
				
			}
			if (horasTrabajadas[j]>180) {
				salarioTotal[i]=1100+((horasTrabajadas[j]-160)*11);
			}
			// Damos salida a los datos de horas y salario Total para cada trabajador
			System.out.println("Empleado nº"+(i+1)+(" - Horas trabajadas:"+horasTrabajadas[j]+ (" - Salario:"+salarioTotal[i]+"€")));
			sumaSalarios += salarioTotal[i];
			j++;
			
		}	
		
		// Salida de datos de la suma de todos los salarios y la media de estos.
		System.out.println("El salario medio pagado a los trabajadores es "+(sumaSalarios/salarioTotal.length)+"€");	
		System.out.println("Total pagado:"+sumaSalarios+"€");
		
		lector.close();
	}

}
