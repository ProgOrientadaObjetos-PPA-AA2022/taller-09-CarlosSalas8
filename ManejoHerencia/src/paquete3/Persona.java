
package paquete3;

public class Persona {

    private String nombre;
    private String apellido;
    private String username;

    //metodos establecer
    public Persona(String nom, String ape, String user) {
        nombre = nom;
        apellido = ape;
        username = user;
    }

    public Persona(String nomb) {
        nombre = nomb;
    }

    public void establecerNombre(String nom) {
        nombre = nom;

    }

    public void establecerApellido(String ape) {
        apellido = ape;

    }

    public void establecerUsername(String user) {
        username = user;

    }

    //metodo obtener
    public String obtenerNombres() {
        return nombre;

    }

    public String obtenerApellido() {
        return apellido;

    }

    public String obtenerUsername() {
        return username;

    }

    public String toString() {
        String cadena = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Username: %s",
                nombre,
                apellido,
                username);
        return cadena;
    }

}
