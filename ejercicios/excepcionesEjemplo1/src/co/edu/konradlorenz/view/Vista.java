package co.edu.konradlorenz.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vista {

    private static Scanner sc = new Scanner(System.in);

    public static int mostrarMenu() {
        System.out.println("Seleccione una opción:");
        System.out.println("[1] Crear Cliente");
        System.out.println("[2] Mostrar Clientes");
        System.out.println("[3] Modificar Cliente");
        System.out.println("[4] Eliminar Cliente");
        System.out.println("[5] Crear Cuenta");
        System.out.println("[6] Crear Tarjeta de Credito");
        System.out.println("[7] Abrir Cajero");
        System.out.println("[0] Salir");
        return pedirEntero("Ingrese su opción: ");
    }

    public static int pedirEntero(String mensaje) {
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print(mensaje);
            try {
                numero = sc.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
                sc.next();
            } catch (ArithmeticException e) {
                System.out.println("Error: Ocurrió un error aritmético. " + e.getMessage());
            } finally {
            	mostrarMensaje("------------------------------------");
            }
        }

        return numero;
    }
    
    public static double pedirDouble(String mensaje) {
        double numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print(mensaje);
            try {
                numero = sc.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número decimal válido.");
                sc.next();
            } catch (ArithmeticException e) {
                System.out.println("Error: Ocurrió un error aritmético. " + e.getMessage());
            } finally {
            	mostrarMensaje("------------------------------------");
            }
        }

        return numero;
    }

    public static String pedirString(String mensaje) {
        System.out.print(mensaje);
        return sc.next();
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static int seleccionarAtributo() {
        System.out.println("Seleccione el atributo a modificar:");
        System.out.println("[1] Nombre");
        System.out.println("[2] Dirección");
        System.out.println("[3] País");
        System.out.println("[4] Documento de identidad");
        System.out.println("[5] Cuenta");
        System.out.println("[0] Volver");
        return pedirEntero("Ingrese su opción: ");
    }
}