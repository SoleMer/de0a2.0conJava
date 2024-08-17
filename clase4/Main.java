package clase4;

/*
Plantear una solución orientada a objetos para calcular el promedio de cada alumno
y mostrar el promedio al lado del nombre completo de cada alumno.
 */

/*
Dada una materia, obtener el porcentaje de alumnos aprobados.
Obtener el nombre de la materia con más cantidad de aprobados.
 */

import java.util.ArrayList;

public class Main {

    public static final int NOTA_APROBACION = 7;

    public static void main(String[] args) {

        Alumno a1 = new Alumno("Juan", "Perez", "40123456");
        Alumno a2 = new Alumno("Pepe", "Perez", "40123456");
        Alumno a3 = new Alumno("Juana", "Perez", "40123456");
        Alumno a4 = new Alumno("Juan", "Gomez", "40123456");
        Alumno a5 = new Alumno("Juan", "Gonzales", "40123456");

        ArrayList<String> materias = new ArrayList<>();
        materias.add("matematicas");
        materias.add("biologia");

        Calificacion c1 = new Calificacion("matematicas", 8);
        Calificacion c2 = new Calificacion("biologia", 8);
        Calificacion c3 = new Calificacion("matematicas", 7);
        Calificacion c4 = new Calificacion("biologia", 8);
        Calificacion c5 = new Calificacion("matematicas", 7);
        Calificacion c6 = new Calificacion("biologia", 6);
        Calificacion c7 = new Calificacion("matematicas", 6);
        Calificacion c8 = new Calificacion("biologia", 6);
        Calificacion c9 = new Calificacion("matematicas", 9);
        Calificacion c10 = new Calificacion("biologia", 9);

        a1.addCalificacion(c1);
        a1.addCalificacion(c2);
        a2.addCalificacion(c3);
        a2.addCalificacion(c4);
        a3.addCalificacion(c5);
        a3.addCalificacion(c6);
        a4.addCalificacion(c7);
        a4.addCalificacion(c8);
        a5.addCalificacion(c9);
        a5.addCalificacion(c10);

        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
        alumnos.add(a4);
        alumnos.add(a5);

        System.out.println(a1.getNombre() + " " + a1.getApellido() + ": " + a1.getPromedio());
        System.out.println(a2.getNombre() + " " + a2.getApellido() + ": " + a2.getPromedio());
        System.out.println(a3.getNombre() + " " + a3.getApellido() + ": " + a3.getPromedio());
        System.out.println(a4.getNombre() + " " + a4.getApellido() + ": " + a4.getPromedio());
        System.out.println(a5.getNombre() + " " + a5.getApellido() + ": " + a5.getPromedio());

        double porcentajeAprobados = getPorcentajeAprobados("biologia", alumnos);
        System.out.println("Porcentaje de aprobados en biologia: " + porcentajeAprobados + "%");
        String materiaConMasAprobados = getMateriaConMasAprobados(materias, alumnos);
        System.out.println("Materia con más aprobados: " + materiaConMasAprobados);
    }

    private static String getMateriaConMasAprobados(ArrayList<String> materias, ArrayList<Alumno> alumnos) {
        String materiaConMayorCantAprobados = "";
        int cantMayorAprobados = 0;
        for (String m: materias) {
            int cantAprobados = getCantAprobados(m, alumnos);
            if (cantAprobados > cantMayorAprobados) {
                cantMayorAprobados = cantAprobados;
                materiaConMayorCantAprobados = m;
            }
        }
        return materiaConMayorCantAprobados;
    }

    private static int getCantAprobados(String materia, ArrayList<Alumno> alumnos) {
        int cantAprobados = 0;
        for (Alumno a: alumnos) {
            int nota = a.getCalificacion(materia);
            if (nota >= NOTA_APROBACION) {
                cantAprobados++;
            }
        }
        return cantAprobados;
    }

    private static double getPorcentajeAprobados(String materia, ArrayList<Alumno> alumnos) {
        int cantAprobados = getCantAprobados(materia, alumnos);
        return cantAprobados * 100 / alumnos.size();
    }

}
