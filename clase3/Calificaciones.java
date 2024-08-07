package clase3;

/*
1. ¿Cuál es el promedio general de cada alumno?
2. ¿Cuál es el porcentaje de alumnos aprobados en matemáticas? (y la misma pregunta por cada materia)
3. ¿Cuál es la materia que más cantidad de alumnos aprobados tiene?
4. ¿Cuántas notas superiores a 8 han obtenido los alumnos este año?
 */

public class Calificaciones {

    public static final int FILAS =25;
    public static final int COLUMNAS = 7;
    public static final int NOTA_BUSCADA = 8;

    public static final int NOTA_APROBACION = 7;

    public static void main(String[] args) {
        int[][] calificaciones = new int[FILAS][COLUMNAS];

        cargarCalificaciones(calificaciones);
        imprimirCalificaciones(calificaciones);
        System.out.println("Promedios:");
        calcularPromedios(calificaciones);
        System.out.println("Porcentaje de aprobados:");
        calcularPorcentajeAprobadosMateria(calificaciones);
        System.out.println("Materia con más aprobados:");
        obtenerMateriaConMasAprobados(calificaciones);
        System.out.println("Cantidad de notas superiores a " + NOTA_BUSCADA + ":");
        contarNotasSuperiores(calificaciones);
    }

    private static void contarNotasSuperiores(int[][] calificaciones) {
    }

    private static void obtenerMateriaConMasAprobados(int[][] calificaciones) {

    }

    private static void calcularPorcentajeAprobadosMateria(int[][] calificaciones) {
        for (int c = 0; c < COLUMNAS; c++) { // recorro las columnas
            int cantAprobados = sumarAprobadosMateria(calificaciones, c);
            double porcentaje = cantAprobados * 100 / FILAS;
            System.out.println("Materia " + c + ": " + porcentaje);
        }
    }

    private static int sumarAprobadosMateria(int[][] calificaciones, int columna) {
        int cantAprobados = 0;
        for (int f = 0; f < FILAS; f++) { // recorro las filas dentro de la columna recibida
            if (calificaciones[f][columna] >= NOTA_APROBACION) {
                cantAprobados++;
            }
        }
        return cantAprobados;
    }

    private static void calcularPromedios(int[][] calificaciones) {
        for (int f = 0; f < FILAS; f++) {
            int promedio = calcularPromedio(calificaciones[f]);
            System.out.println("Alumno " + f + ": " + promedio);
        }
    }

    private static int calcularPromedio(int[] calificaciones) {
        double promedio = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            promedio += calificaciones[i];
        }
        return (int)(promedio / calificaciones.length); // return promedio / CANTIDAD_NOTAS;
    }

    private static void imprimirCalificaciones(int[][] calificaciones) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(calificaciones[i][j] + " | ");
            }
            System.out.println("");
        }
    }

    private static void cargarCalificaciones(int[][] calificaciones) {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                calificaciones[i][j] = (int)(Math.random()*10+1);
            }
        }
    }
}
