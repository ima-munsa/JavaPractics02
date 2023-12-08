package ejercicio07;

public class MainMatrriz {

	public static void main(String[] args) {
		
		Matriz mat1 = new Matriz();
		Matriz mat2 = new Matriz();
		
		// Inicializamos dos vecotres que asignaran los datos iniciales cada Matriz
		int[] datosMat1 =  { 3, 2, 1, 1, 2, 3, 2, 3, 1 };
		int [] datosMat2 = { 1, 1, 2, 2, 1, 1, 1, 2, 1 };
		
		
		// ASIGNAMOS los datos a cada Matriz correspondiente
		mat1.asignarDatos(datosMat1);
		mat2.asignarDatos(datosMat2);
		
		// MOSTRAR los datos de cada Matriz
		System.out.println("Mat01");
		mat1.mostrar();
		System.out.println("\nMat02");
		mat2.mostrar();
		
		// Multiplicar y mostrar el resultado
		System.out.println("\nProducto");
		mat1.producto(mat2);
		mat1.mostrar();
		
		// Sumar y mostrar el resultado
		System.out.println("\nSumar");
		mat1.suma(mat2);
		mat1.mostrar();
		
	}

}
