package ejercicio10;


public class Check_Sudoku {		// Creamos un archivo a parte para los métodos
	
	// METODO PARA VERIFICAR SI EL SUDOKU CUMPLE TODAS LAS NORMAS
	public static boolean sudoku_validez (int sudoku[][]) {
		for (int i = 0; i < sudoku.length; i++) {
			for (int j = 0; j < sudoku[i].length; j++) {
				if (!numero_valido(sudoku[i][j]) || !verificarFila(sudoku,i,j) || !verificarColumna (sudoku,i,j) ) {
					return false;
					
				}
				
			}
		}
		return true;
	}
		
	// Método para comprobar si el número está comprendido entre 1 y 9
	private static boolean numero_valido (int num) {
		return num >=1 && num<=9;
		
	}
	
	
	// Método para comprobar que el valor de las filas por las que va avanzando es igual o no al del resto
    private static boolean verificarFila(int[][] sudoku, int fila, int columna) {
        for (int j = 0; j < 3; j++) {
            if (j != columna && sudoku[fila][j] == sudoku[fila][columna]) {
                return false;
            }
        }
        return true;
    }
    // Método para comprobar que el valor de las columnas por las que va avanzando es igual o no al del resto
    private static boolean verificarColumna(int[][] sudoku, int fila, int columna) {
        for (int i = 0; i < 3; i++) {
            if (i != fila && sudoku[i][columna] == sudoku[fila][columna]) {
                return false;
            }
        }
        return true;
    }
}
