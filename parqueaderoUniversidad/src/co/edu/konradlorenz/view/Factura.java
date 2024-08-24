package co.edu.konradlorenz.view;

import java.util.Scanner;

public class Factura {

	static Scanner leer = new Scanner (System.in);
	
	public static void mostrarFactura (String placa, String fecha, String tipoVehiculo, int duracion, int valorMinuto, double valorParqueo, double soloIva, double subTotal, double ajuste50, double totalPagar) {
		System.out.println("\n" + placa.toUpperCase());
		System.out.println("\n «» PARKING KONRAD LORENZ «» \n");
		System.out.println("Fecha: " + fecha);
		System.out.println("Tipo de vehiculo: " + tipoVehiculo);
		System.out.println("Minutos: " + duracion + "   Tarifa: $" + valorMinuto);
		System.out.println("Valor Parqueo: $" + valorParqueo);
		System.out.println("I.V.A. (19%): $" + soloIva);
		System.out.println("Subtotal: $" + subTotal);
		System.out.println("Ajuste 50: $" + ajuste50);
		System.out.println("TOTAL a pagar: $" + totalPagar);
	}
	
	public static String ingresarPlaca() {
		System.out.println("Ingrese la placa: ");
		return leer.nextLine();
	}
	
	public static String ingresarTipoDeVehiculo() {
		System.out.println("Ingrese la el tipo de vehiculo: \n (bici/moto/carro)");
		return leer.nextLine();
	}
	
	public static String ingresarFecha() {
		System.out.println("Ingrese fecha de ingreso: ");
		return leer.nextLine();
	}
	
	public static int ingresarDuracion() {
		System.out.println("Ingrese minutos: ");
		return leer.nextInt();
	}
	
}
