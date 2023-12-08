package ejercicio07;

public class Matriz {


	private int [][] numeros;
	
	

	public Matriz () {
		numeros = new int [3][3];
	};
		
	public int [][] getNumeros () {	//Metodo Getter para comprobar los valores 
		return numeros;
	}
	
	public void setNumeros (int[][]numeros) {   // Método setter para modificar los valores 
		this.numeros = numeros;			
	}
	
	// Método para asignar datos a la matriz desde un vector unidimensional
	public void asignarDatos (int[] vector) {
		
		int k = 0; 		// Variable para recorrer el vector
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				
				numeros[i][j] = vector [k++];	// Asignar valores del vector a la matriz (indicador de posiciones
				
			}
		}		
	}
	
	public void suma (Matriz m){
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				this.numeros [i][j] += m.numeros [i][j]; // Suma las dos matrices
			}
		}
	}
	
	public void producto(Matriz m) {
		
		int [][]resultado= new int [3][3];
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				resultado[i][j]+=this.numeros[i][j] * m.numeros[i][j];				
				
			}
		}
		
		this.numeros = resultado;   // Actualiza la matriz actual con el resultado
	}
	
	public void mostrar () {
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				System.out.print(" "+numeros[i][j]);
				
			}
			System.out.println(); // Salto de línea para separar los datos 
		}
	}
	
}
