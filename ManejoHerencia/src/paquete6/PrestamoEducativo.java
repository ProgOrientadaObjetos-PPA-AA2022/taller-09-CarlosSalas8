package paquete6;

import paquete4.Prestamo;
import paquete3.Persona;
import paquete2.InstitucionEducativa;

public class PrestamoEducativo extends Prestamo {

    private String nivelEducativo;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensual;

    public PrestamoEducativo(Persona ben, int tiemp, String ciud, String nE,
            InstitucionEducativa cE, double valC) {
        super(ben, tiemp, ciud);

        establecerCiudadPrestamo(ciud);

        nivelEducativo = nE;
        centroEducativo = cE;
        valorCarrera = valC;

    }

    @Override
    public void establecerCiudadPrestamo(String ciud) {
        ciudadPrestamo = ciud.toUpperCase();

    }

    //metodos establecer
    public void establecerNivelEducativo(String nivelE) {
        nivelEducativo = nivelE;
    }

    public void establecerCentroEducativo(InstitucionEducativa centroE) {
        centroEducativo = centroE;
    }

    public void establecerValorCarrera(double valorC) {
        valorCarrera = valorC;
    }

    public void calcularValorMensual() {
        valorMensual = (valorCarrera / tiempoMeses)
                - ((valorCarrera / tiempoMeses) * 0.1);;
    }

    //metodos obtener
    public String obtenerNivelEducativo() {
        return nivelEducativo;
    }

    public InstitucionEducativa obtenerCentroEducativo() {
        return centroEducativo;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    @Override
    public String toString() {
        String cadenaFinal = String.format("\"Prestamo Educativo:\n%s", super.toString());

        cadenaFinal = String.format("%s\n"
                + "Nivel Educativo: %s\n"
                + "Centro Educativo: %s\n"
                + "Valor Carrera: %.2f\n"
                + "Valor Mensual: %.2f\n",
                cadenaFinal,
                obtenerNivelEducativo(),
                obtenerCentroEducativo(),
                obtenerValorCarrera(),
                obtenerValorMensual());

        return cadenaFinal;
    }

}
