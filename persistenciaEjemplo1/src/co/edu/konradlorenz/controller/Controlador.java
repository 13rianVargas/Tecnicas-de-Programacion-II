package co.edu.konradlorenz.controller;

import java.io.*;
import java.util.*;

import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.Vista;

public class Controlador {
	
	private Estudiante e = new Estudiante();

	private String path = "src/co/edu/konradlorenz/model/listaEstudiantes.txt";
    public void run() {
    	
    	int op = 0;
    	
    	String menu = "1. Ingresar estudiante\n"
    				+ "2. Mostrar estudiante\n"
    				+ "3. Actualizar estudiante\n"
    				+ "4. Borrar estudiante\n"
    				+ "5. Salir\n";
    	
    	do {
    		op = Vista.pedirEntero(menu);
    		
    		switch (op) {
				case 1:
					crearEstudiante();
					break;
				case 2:
					mostrarEstudiantes();
					break;
				case 3:
					actualizarEstudiante();
					break;
				case 4:
					borrarEstudiante();
					break;
				case 5:
					Vista.mostrarMensaje("Hasta pronto.");
					break;
				default:
					Vista.mostrarMensaje("Error de opción.");
					throw new AssertionError();
			}
    		
    	} while (op != 5);    	
    	
    	try {
    		
    		File archivito = new File(path);
    		Scanner sc = new Scanner(archivito);
			while (sc.hasNextLine()) {
				Vista.mostrarMensaje(sc.nextLine());
    		}
			//while
    	} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//try
    }
    //run
    
    private void borrarEstudiante() {
		// TODO Auto-generated method stub
		
	}
	private void actualizarEstudiante() {
		// TODO Auto-generated method stub
		
	}
	private void mostrarEstudiantes() throws NumberFormatException {
		int notaFinal;
		try {
			notaFinal = e.notaCurso("-50&-35&-10&-35");
		} catch (IllegalArgumentException e) {
			Vista.mostrarMensaje("Hay una nota errada");
		}
		
		
	}
	private void crearEstudiante() {
		// TODO Auto-generated method stub
		
	}
	//run
}
//class