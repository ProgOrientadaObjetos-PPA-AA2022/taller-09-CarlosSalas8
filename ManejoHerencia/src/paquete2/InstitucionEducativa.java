package paquete2;

public class InstitucionEducativa {

    private String nombre;
    private String siglas;

    //metodos establecer
    public InstitucionEducativa(String nom, String sigl) {
        nombre = nom;
        siglas = sigl;
    }

    public void establecerNombre(String nom) {
        nombre = nom;

    }

    public void establecerSiglas(String sigl) {
        siglas = sigl;

    }

    //metodos obtener
    public String obtenerNombre() {
        return nombre;

    }

    public String obtenerSiglas() {
        return siglas;

    }

    public String toString() {
        String cadena = String.format("Institucion: %s\n"
                + "Siglas: %s\n",
                nombre,
                siglas);
        return cadena;
    }

}
