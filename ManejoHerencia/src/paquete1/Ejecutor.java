package paquete1;

import paquete6.PrestamoEducativo;
import paquete5.PrestamoAutomovil;
import paquete3.Persona;
import paquete2.InstitucionEducativa;
import java.util.Locale;
import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int opcion;
        String cadena1 = "";
        String cadena2 = "";
        String salir = "";

        do {
            System.out.println("Seleccione el tipo de prestamo que desee adquirir:\n"
                    + " 1.- Para Prestamo de Automovil\n"
                    + " 2.- Para Prestamo Educativo\n"
                    + " 0.- Para Finalizar el Programa");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1 || opcion == 2) {

                System.out.println("BENEFICIARIO");
                System.out.println("-------------");
                System.out.println("\nIngrese el nombre: ");
                String nombre = sc.nextLine();
                System.out.println("Ingrese el apellido: ");
                String apellido = sc.nextLine();
                System.out.println("Ingrese el username: ");
                String username = sc.nextLine();
                System.out.println("Ingrese el tiempo de pago en meses: ");
                int meses = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingrese la ciudad");
                String ciudad = sc.nextLine();

                Persona persona = new Persona(nombre, apellido, username);
                persona.establecerNombre(nombre);
                persona.establecerApellido(apellido);
                persona.establecerUsername(username);

                switch (opcion) {

                    case 1:
                        do {
                            System.out.println("Ingrese el Tipo de Automovil");
                            String tipoA = sc.nextLine();
                            System.out.println("Ingrese la Marca del Automovil");
                            String marcaA = sc.nextLine();
                            System.out.println("Ingrese el Nombre del Garante");
                            String nom = sc.nextLine();
                            System.out.println("Ingrese el Apellido del Garante");
                            String ape = sc.nextLine();
                            System.out.println("Ingrese el Username del Garante");
                            String user = sc.nextLine();
                            System.out.println("Ingrese el Valor del Automovil");
                            double valorA = sc.nextDouble();

                            Persona primerGarante = new Persona(nom, ape, user);
                            primerGarante.establecerNombre(nom);
                            primerGarante.establecerApellido(ape);
                            primerGarante.establecerUsername(user);

                            PrestamoAutomovil prestamo = new PrestamoAutomovil(persona,
                                    meses, ciudad, tipoA, marcaA, primerGarante, valorA);

                            prestamo.establecerBeneficiario(persona);
                            prestamo.establecerTiempoMeses(meses);
                            prestamo.establecerCiudadPrestamo(ciudad);
                            prestamo.establecerTipoAutomovil(tipoA);
                            prestamo.establecerMarcaAutomovil(marcaA);
                            prestamo.establecerPrimerGarante(primerGarante);
                            prestamo.establecerValorAutomovil(valorA);
                            prestamo.calcularValorMensual();

                            System.out.println("Seleccione la letra S para continuar "
                                    + "o digite la letra N para salir");
                            sc.nextLine();
                            salir  = sc.nextLine();

                            cadena1 = String.format("%s%s\n", cadena1, prestamo);

                        } while (salir .equals("S"));
                        System.out.println(cadena1);
                        break;

                    case 2:
                        do {
                            System.out.println("Centro Educativo");
                            System.out.println("----------------");
                            System.out.println("Ingrese su Nivel Educativo");
                            String nivel = sc.nextLine();
                            System.out.println("Ingrese el Nombre del Centro");
                            String nombreC = sc.nextLine();
                            System.out.println("Ingrese las Siglas");
                            String siglas = sc.nextLine();
                            System.out.println("Ingrese el Valor de la arrera");
                            double valorC = sc.nextDouble();

                            InstitucionEducativa institucion = new InstitucionEducativa(nombreC,
                                    siglas);

                            PrestamoEducativo prestamo2 = new PrestamoEducativo(persona,
                                    meses, ciudad, nivel, institucion, valorC);

                            prestamo2.establecerBeneficiario(persona);
                            prestamo2.establecerTiempoMeses(meses);
                            prestamo2.establecerCiudadPrestamo(ciudad.toUpperCase());
                            prestamo2.establecerNivelEducativo(nivel);
                            prestamo2.establecerCentroEducativo(institucion);
                            prestamo2.establecerValorCarrera(valorC);
                            prestamo2.calcularValorMensual();

                            System.out.println("Seleccione la letra S para continuar "
                                    + "o digite la letra N para salir");
                            sc.nextLine();
                            salir  = sc.nextLine();

                            cadena2 = String.format("%s%s\n", cadena2, prestamo2);

                        } while (salir .equals("S"));
                        System.out.println(cadena2);
                        break;
                    default:
                        System.out.println("Opcion Fuera de Rango");

                }

            } else if (opcion != 0) {
                System.out.println("Opcion Fuera de Rango");
            } else {
                System.out.println("Gracias por Usar el Programa");
            }
        } while (opcion != 0);
    }
}
