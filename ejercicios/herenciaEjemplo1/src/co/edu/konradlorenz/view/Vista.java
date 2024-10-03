package co.edu.konradlorenz.view;

import java.util.Scanner;

public class Vista {
	Scanner sc = new Scanner(System.in);
	
	public String menuPrincipal() {
		System.out.println("\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n"
				+ " <>                                  <>\n"
				+ " <>          CALCULADORA DE          <>\n"
				+ " <>        ÁREAS & PERÍMETROS        <>\n"
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
	public String pedirTipoFigura() {
		System.out.print("\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n"
				+ " <>                                  <>\n"
				+ " <>    Ingrese el tipo de figura:    <>\n"
				+ " <>   [R] Rectángulo. [C] Círculo.   <>\n"
				+ " <>                                  <>\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n");
		String tipoFigura = sc.nextLine();
		return tipoFigura;
	}
	public double pedirX() {
		System.out.print("\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n"
				+ " <>                                  <>\n"
				+ " <>       Ingrese la ubicación       <>\n"
				+ " <>       en X del rectángulo        <>\n"
				+ " <>                                  <>\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n");
		double numero = sc.nextDouble();
		sc.nextLine();//sc clean
		return numero;
	}
	public double pedirY() {
		System.out.print("\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n"
				+ " <>                                  <>\n"
				+ " <>       Ingrese la ubicación       <>\n"
				+ " <>       en Y del rectángulo        <>\n"
				+ " <>                                  <>\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n");
		double numero = sc.nextDouble();
		sc.nextLine();//sc clean
		return numero;
	}
	public double pedirLado1() {
		System.out.print("\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n"
				+ " <>                                  <>\n"
				+ " <>        Ingrese el primer         <>\n"
				+ " <>       lado del rectángulo        <>\n"
				+ " <>                                  <>\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n");
		double numero = sc.nextDouble();
		sc.nextLine();//sc clean
		return numero;
	}
	public double pedirLado2() {
		System.out.print("\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n"
				+ " <>                                  <>\n"
				+ " <>       Ingrese el segundo         <>\n"
				+ " <>       lado del rectángulo        <>\n"
				+ " <>                                  <>\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n");
		double numero = sc.nextDouble();
		sc.nextLine();//sc clean
		return numero;
	}
	public double pedirRadio() {
		System.out.print("\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n"
				+ " <>                                  <>\n"
				+ " <>            Ingrese el            <>\n"
				+ " <>         radio del círculo        <>\n"
				+ " <>                                  <>\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n");
		double numero = sc.nextDouble();
		sc.nextLine();//sc clean
		return numero;
	}
	public void mostrarArea(double area) {
		System.out.print("\n <> <> <> <> <> <> <> <> <> <> <> <> <>\n");
		System.out.print("\n          El area es: " + area + "\n");
		
	}
	public void mostrarPerimetro(double perimetro) {
		System.out.print("        El perímetro es: " + perimetro + "\n");
		
	}
	public void mostrarUbicacion(double x, double y) {
		System.out.print("     Ubicación en X: " + x + ", Y: " + y + "\n\n");
		System.out.print(" <> <> <> <> <> <> <> <> <> <> <> <> <>");
		
	}
}
