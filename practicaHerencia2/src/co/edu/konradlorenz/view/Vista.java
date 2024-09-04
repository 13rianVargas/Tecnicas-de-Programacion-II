package co.edu.konradlorenz.view;

import java.util.Scanner;

public class Vista {
	Scanner sc = new Scanner(System.in);
	
	public String menuPrincipal() {
		System.out.println("\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n"
				+ " <>                                  <>\n"
				+ " <>             PROBADOR             <>\n"
				+ " <>            DE CLAXONS            <>\n"
				+ " <>                                  <>\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>");
		System.out.print("¿Continuar? Y/N : ");
		return sc.nextLine();
	}
	public void salida() {
		System.out.print(" <> FIN <>");
	}
	public void ingreseDatoDeNuevo() {
		System.out.println("\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n"
				+ " <>                                  <>\n"
				+ " <>             ¡Error!              <>\n"
				+ " <>     Ingrese el dato de nuevo     <>\n"
				+ " <>                                  <>\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>");
	}
	public String pedirTipoVehiculo() {
		System.out.print("\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n"
				+ " <>                                  <>\n"
				+ " <>   Ingrese el tipo de vehiculo:   <>\n"
				+ " <>       [C] Coche. [M] Moto.       <>\n"
				+ " <>                                  <>\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n");
		return sc.nextLine();
	}
	public String pedirMarca() {
		System.out.print("\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n"
				+ " <>                                  <>\n"
				+ " <>            Ingrese la            <>\n"
				+ " <>        marca del vehículo        <>\n"
				+ " <>                                  <>\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n");
		return sc.nextLine();
	}
	public String pedirModelo() {
		System.out.print("\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n"
				+ " <>                                  <>\n"
				+ " <>            Ingrese el            <>\n"
				+ " <>        modelo del vehículo       <>\n"
				+ " <>                                  <>\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n");
		return sc.nextLine();
	}
	public String pedirMatricula() {
		System.out.print("\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n"
				+ " <>                                  <>\n"
				+ " <>            Ingrese la            <>\n"
				+ " <>       matrícula del vehículo     <>\n"
				+ " <>                                  <>\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n");
		return sc.nextLine();
	}
	public int pedirAnchura() {
		System.out.print("\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n"
				+ " <>                                  <>\n"
				+ " <>            Ingrese la            <>\n"
				+ " <>         anchura del coche        <>\n"
				+ " <>                                  <>\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n");
		int numero = sc.nextInt();
		sc.nextLine();//sc clean
		return numero;
	}
	public int pedirAltura() {
		System.out.print("\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n"
				+ " <>                                  <>\n"
				+ " <>            Ingrese la            <>\n"
				+ " <>         altura del coche         <>\n"
				+ " <>                                  <>\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n");
		int numero = sc.nextInt();
		sc.nextLine();//sc clean
		return numero;
	}
	public String pedirLimitador() {
		System.out.print("\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n"
				+ " <>                                  <>\n"
				+ " <>      ¿La Moto está limitada?     <>\n"
				+ " <>         [S] Sí. [N] No.          <>\n"
				+ " <>                                  <>\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n");
		return sc.nextLine();
	}
	public void mostrarClaxon(String claxon) {
		 System.out.println("\n <> " + claxon + " <> ");
		
	}
	
}
