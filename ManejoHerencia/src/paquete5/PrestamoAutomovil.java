package paquete5;

import paquete4.Prestamo;
import paquete3.Persona;

public class PrestamoAutomovil extends Prestamo {

    private String tipoAutomovil;
    private String marcaAutomovil;
    private Persona primerGarante;
    private double valorAutomovil;
    private double valorMensual;

    public PrestamoAutomovil(Persona ben, int tiemp, String ciud, String tipAut,
            String marcaAut, Persona primerg, double valorAut) {
        super(ben, tiemp,ciud);
        
        establecerCiudadPrestamo(ciud);

        tipoAutomovil = tipAut;
        marcaAutomovil = marcaAut;
        primerGarante = primerg;
        valorAutomovil = valorAut;

    }

    @Override
    public void establecerCiudadPrestamo(String ciud){
        ciudadPrestamo = ciud.toLowerCase();
    
    }

    //metodos establecer
    public void establecerTipoAutomovil(String tipo) {
        tipoAutomovil = tipo;
    }

    public void establecerMarcaAutomovil(String marca) {
        marcaAutomovil = marca;
    }

    public void establecerPrimerGarante(Persona primer) {
        primerGarante = primer;
    }

    public void establecerValorAutomovil(double valorA) {
        valorAutomovil = valorA;
    }

    public void calcularValorMensual() {
        valorMensual = valorAutomovil / tiempoMeses;
    }

    //metodos obtener
    public String obtenerTipoAutomovil() {
        return tipoAutomovil;
    }

    public String obtenerMarcaAutomovil() {
        return marcaAutomovil;
    }

    public Persona obtenerPrimerGarante() {
        return primerGarante;
    }

    public double obtenerValorAutomovil() {
        return valorAutomovil;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    @Override
    public String toString() {
        String cadenaFinal = String.format("Prestamo de Automovil:\n%s", super.toString());

        cadenaFinal = String.format("%s\n"
                + "Tipo de Automovil: %s\n"
                + "Marca Automovil: %s\n"
                + "Primer Garante: %s\n"
                + "Valor Automovil: %.2f\n"
                + "Valor Mensual: %.2f\n",
                cadenaFinal,
                obtenerTipoAutomovil(),
                obtenerMarcaAutomovil(),
                obtenerPrimerGarante(),
                obtenerValorAutomovil(),
                obtenerValorMensual());

        return cadenaFinal;
    }

}
