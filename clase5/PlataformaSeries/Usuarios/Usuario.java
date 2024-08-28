package clase5.PlataformaSeries;

/*
Cada usuario deberá tener un nombre de usuario, un correo electrónico, una contraseña y
un listado de series que les gustan, para sugerirles series con algunas palabras clave compartidas.
 */

import java.util.ArrayList;

public class Usuario {

    private String nombreUsuario;
    private String email;
    private String password;
    private ArrayList<Serie> seriesQueLeGustan;

    public Usuario(String nombreUsuario, String email, String password) {
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
        this.seriesQueLeGustan = new ArrayList<>();
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Serie> getSeriesQueLeGustan() {
        return new ArrayList<>(seriesQueLeGustan);
    }

    public void addSerie(Serie s) {
        this.seriesQueLeGustan.add(s);
    }

    public boolean lePuedeGustarSerie(Serie serie) {
        for (Serie s : this.seriesQueLeGustan) {
            boolean coincide = s.contienePalabrasClave(serie);
            if (coincide) {
                return true;
            }
        }
        return false;
    }

    public boolean leGustaSerie(Serie s) {
        return this.seriesQueLeGustan.contains(s);
    }
}
