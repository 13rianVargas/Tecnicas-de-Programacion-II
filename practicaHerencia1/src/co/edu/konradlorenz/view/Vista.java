package co.edu.konradlorenz.view;

import java.util.Scanner;

public class Vista {
	Scanner sc = new Scanner(System.in);
	
	public void ingreseDatoDeNuevo() {
		System.out.println("¡Error!\nIngrese el dato de nuevo.");
	}
	public String pedirTipoFigura() {
		System.out.println("Ingrese la letra del tipo de figura:\n[R] -> Rectángulo.\n[C] -> Círculo.");
		String tipoFigura = sc.nextLine();
		return tipoFigura;
	}
	public double pedirDouble() {
		double numero = sc.nextDouble();
		return numero;
	}
	public void mostrarArea(double area) {
		System.out.println("El area es: " + area);
		
	}
	public void mostrarPerimetro(double perimetro) {
		System.out.println("El perimetro es: " + perimetro);
		
	}

	
	
}
