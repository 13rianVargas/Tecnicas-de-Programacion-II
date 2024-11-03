package co.edu.konradlorenz.model;

import co.edu.konradlorenz.view.Vista;

public class Estudiante {

	private String nombre;
	private int edad;

	public Estudiante() {
	}

	public Estudiante(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public int notaCurso(String notas) throws IllegalArgumentException, NumberFormatException {
		try {
			String [] calificaciones = notas.split("&");
			int notaFinal = 0;
			for (int i =0 ; i<calificaciones.length; i++) {
				notaFinal += Integer.parseInt(calificaciones[i]);	
			}
			notaFinal = notaFinal/calificaciones.length;
			if(notaFinal < 0) {
				throw new NotaInvalidaException("La nota resultante fue inferior a cero.");
			}
			return notaFinal;
		} catch (NotaInvalidaException e) {
			e.printStackTrace();
			Vista.mostrarMensaje("Vuelva a realizar el calculo, se halló un error");
		}
		return 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
