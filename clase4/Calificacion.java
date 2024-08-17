package clase4;

/*
una calificación posee el nombre de la materia a la cual pertenece y una nota numérica.
 */

public class Calificacion {

    private String materia;
    private int nota;

    public Calificacion(String materia, int nota) {
        this.materia = materia;
        this.nota = nota;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
