package clase5.PlataformaSeries;

/*
Por último, un capítulo contiene un número de capítulo, un título y una duración.
 */

public class Capitulo {

    private int numCapitulo;
    private String titulo;
    private double duracion;

    public Capitulo(int numCapitulo, String titulo, double duracion) {
        this.numCapitulo = numCapitulo;
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public int getNumCapitulo() {
        return numCapitulo;
    }

    public void setNumCapitulo(int numCapitulo) {
        this.numCapitulo = numCapitulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
}
