package paquete4;

import paquete3.Persona;

public class Prestamo {

    protected Persona beneficiario;
    protected int tiempoMeses;
    protected String ciudadPrestamo;

    public Prestamo(Persona ben, int tiemp,String ciud) {

        beneficiario = ben;
        tiempoMeses = tiemp;
        ciudadPrestamo = ciud;

    }

    //metodos establecer

    public void establecerBeneficiario(Persona ben) {
        beneficiario = ben;

    }

    public void establecerTiempoMeses(int tiemp) {
        tiempoMeses = tiemp;

    }

    public void establecerCiudadPrestamo(String ciud) {
        ciudadPrestamo = ciud;

    }
    //metodos obtener

    public Persona obtenerBeneficiario() {
        return beneficiario;

    }

    public int obtenerTiempoMeses() {
        return tiempoMeses;

    }

    public String obtenerCiudadPrestamo() {
        return ciudadPrestamo;

    }

    @Override
    public String toString() {
        String cadena = String.format("Beneficiario: %s\n"
                + "Tiempo de meses: %d\n"
                + "Ciudad de Prestamo: %s\n",
                obtenerBeneficiario(),
                obtenerTiempoMeses(),
                obtenerCiudadPrestamo());

        return cadena;
    }

}
