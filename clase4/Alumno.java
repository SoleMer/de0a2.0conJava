package clase4;

/*
Cada alumno tiene nombre, apellido, dni, y un conjunto de calificaciones.
 */

import java.util.ArrayList;

public class Alumno {

    private String nombre;
    private String apellido;
    private String dni;
    private ArrayList<Calificacion> calificaciones;

    public Alumno(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.calificaciones = new ArrayList<>();
    }

    //getters y setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList<Calificacion> getCalificaciones() {
        return new ArrayList<>(calificaciones);
    }

    public void addCalificacion(Calificacion calificacion) {
        this.calificaciones.add(calificacion);
    }

    public int getPromedio() {
        int suma = 0;
        for (Calificacion c: this.calificaciones) {
            suma += c.getNota();
        }
        return suma / this.calificaciones.size();
    }

    public int getCalificacion(String materia) {
        for (Calificacion c: this.calificaciones) {
            if (c.getMateria().equals(materia)) {
                return c.getNota();
            }
        }
        return 0;
    }
}
