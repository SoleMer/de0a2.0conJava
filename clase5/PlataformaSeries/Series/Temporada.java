package clase5.PlataformaSeries;

/*
Una temporada posee un número de temporada y un conjunto de capítulos.
 */

import java.util.ArrayList;

public class Temporada {

    private int numTemporada;
    private ArrayList<Capitulo> capitulos;

    public Temporada(int numTemporada) {
        this.numTemporada = numTemporada;
        this.capitulos = new ArrayList<>();
    }

    public int getNumTemporada() {
        return numTemporada;
    }

    public void setNumTemporada(int numTemporada) {
        this.numTemporada = numTemporada;
    }

    //Obtener el listado de capítulos de una temporada dada.
    public ArrayList<Capitulo> getCapitulos() {
        return new ArrayList<>(capitulos);
    }

    public void addCapitulo(Capitulo c) {
        this.capitulos.add(c);
    }

    //Obtener la duración de una temporada, sabiendo que esta se calcula como la suma de las duraciones de los capítulos que contiene.
    public double getDuracion() {
        double duracion = 0;
        for (Capitulo c : this.capitulos) {
            duracion += c.getDuracion();
        }
        return duracion;
    }
}
