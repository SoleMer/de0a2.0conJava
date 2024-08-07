package clase3;

public class Matriz {

    public static final int FILAS =3;
    public static final int COLUMNAS = 4;

    public static void main(String[] args) {
        int[][] matriz = new int[FILAS][COLUMNAS];
        cargarMatriz(matriz); // recorriendo las columnas en cada fila
        System.out.println("Matriz cargada:");
        imprimirMatriz(matriz); // recorriendo las columnas en cada fila
        System.out.println("Matriz invertida:");
        recorrerMatrizPorColumnas(matriz); // recorriendo las filas en cada columna
        System.out.println("Primera fila de la matriz:");
        recorrerFilaEspecifica(matriz[0]); // envío como parámetro una fila de la matriz, que es un array
        System.out.println("Tercera columna de la matriz");
        recorrerColumnaEspecifica(matriz, 2); //envió como parámetro la matriz y el índice de la columna que deseo recorrer

        // OTRA MANERA DE INICIALIZAR Y CARGAR LA MATRIZ:
        int[][] mat = {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12}};

        for (int c = 0; c < 10; c++) {
            System.out.println(Math.random()*10+1);
        }

    }

    private static void cargarMatriz(int[][] matriz) {
        for (int f = 0; f < FILAS; f++) { // recorro las filas
            for (int c = 0; c < COLUMNAS; c++) { // recorro las columnas
                matriz[f][c] = (int)(Math.random()*10+1); //cargo un valor aleatorio entre 1 y 10 en cada posición de la matriz
            }
        }
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int f = 0; f < FILAS; f++) { // recorro las filas
            for (int c = 0; c < COLUMNAS; c++) { // recorro las columnas
                System.out.print(matriz[f][c] + " | "); //muestro en la consola cada posición de la matriz
            }
            System.out.println("");
        }
    }
    private static void recorrerMatrizPorColumnas(int[][] matriz) {
        for (int c = 0; c < COLUMNAS; c++) { // recorro las columnas
            for (int f = 0; f < FILAS; f++) { // recorro las filas
                System.out.print(matriz[f][c] + " | "); //muestro en la consola cada posición de la matriz
            }
            System.out.println("");
        }
    }

    private static void recorrerFilaEspecifica(int[] fila) { // recibo un array, equivalente a una fila de la matriz
        // ahora puedo trabajar sobre la fila igual que sobre un array
        for (int c = 0; c < COLUMNAS; c++) { // recorro las columnas dentro de la fila recibida
            System.out.print(fila[c] + " | "); //muestro en la consola cada posición de la fila
        }
        System.out.println("");
    }

    private static void recorrerColumnaEspecifica(int[][] matriz, int columna) {
        for (int f = 0; f < FILAS; f++) { // recorro las filas dentro de la columna recibida
            System.out.print(matriz[f][columna] + " | "); //muestro en la consola cada posición de la columna
        }
        System.out.println("");
    }

}
