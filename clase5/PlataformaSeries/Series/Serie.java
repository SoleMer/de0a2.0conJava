package clase5.PlataformaSeries;

/*
Se sabe que una serie tiene un nombre, una descripcion, una lista de palabras clave y una lista de temporadas.
 */

import java.util.ArrayList;

public class Serie {

    private String nombre;
    private String descripcion;
    private ArrayList<String> palabrasClave;
    private ArrayList<Temporada> temporadas;

    private static int cantidadMinimaCoincidencias;

    public Serie(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.palabrasClave = new ArrayList<>();
        this.temporadas = new ArrayList<>();
        cantidadMinimaCoincidencias = 3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(palabrasClave);
    }

    //Obtener el listado de temporadas de una serie dada.
    public ArrayList<Temporada> getTemporadas() {
        return new ArrayList<>(temporadas);
    }

    public void addPalabraClave(String pClave) {
        this.palabrasClave.add(pClave);
    }

    public void addTemporada(Temporada t) {
        this.temporadas.add(t);
    }

    public static int getCantidadMinimaCoincidencias() {
        return cantidadMinimaCoincidencias;
    }

    public static void setCantidadMinimaCoincidencias(int cantidadMinimaCoincidencias) {
        Serie.cantidadMinimaCoincidencias = cantidadMinimaCoincidencias;
    }

    //Obtener la duración total de una serie, que se calcula como la suma de las duraciones de las temporadas que contiene.
    public double getDuracion() {
        double duracion = 0;
        for (Temporada t : this.temporadas) {
            duracion += t.getDuracion();
        }
        return duracion;
    }

    public boolean contienePalabrasClave(Serie serie) {
        int contCoincidencias = 0;
        for (String pc : serie.palabrasClave) {
            if (this.palabrasClave.contains(pc)) {
                contCoincidencias++;
                if (contCoincidencias == cantidadMinimaCoincidencias) {
                    return true;
                }
            }
        }
        return false;
    }
}
