package clase3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Promedio {

    public static final int CANTIDAD_NOTAS = 3;
    public static final double NOTA_MINIMA = 1;
    public static final double NOTA_MAXIMA = 10;
    public static void main(String[] args) {

        String nombreAlumno = pedirNombreAlumno();
        double[] calificaciones = new double[CANTIDAD_NOTAS];
        /*
        calificaciones[0] = pedirNota();
        calificaciones[1] = pedirNota();
        calificaciones[2] = pedirNota();
        */
        cargarNotas(calificaciones);

        double promedio = calcularPromedio(calificaciones);

        System.out.println("Promedio del alumno " + nombreAlumno + ": " + promedio);
    }

    private static void cargarNotas(double[] calificaciones) {
        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i] = pedirNota();
        }
    }

    private static double calcularPromedio(double[] calificaciones) {
        double promedio = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            promedio += calificaciones[i];
        }
        return promedio / calificaciones.length; // return promedio / CANTIDAD_NOTAS;
    }

    private static double pedirNota() {
        boolean notaValida = false;
        double nota = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (!notaValida) {
            System.out.println("Ingrese una nota");
            try {
                nota = Double.valueOf(entrada.readLine());
                if (nota >= NOTA_MINIMA && nota <= NOTA_MAXIMA) {
                    notaValida = true;
                } else {
                    System.out.println("No es una nota válida");
                }
            } catch (Exception e) {
                System.out.println("No es una nota válida");
            }
        }
        return nota;
    }

    private static String pedirNombreAlumno() {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String nombre = "";
        boolean nombreValido = false;
        while (!nombreValido) {
            System.out.println("Ingrese el nombre del alumno");
            try {
                nombre = entrada.readLine();
                nombreValido = true;
            } catch (Exception e) {
                System.out.println("No es un nombre válido");;
            }
        }
        return nombre;
    }


}
