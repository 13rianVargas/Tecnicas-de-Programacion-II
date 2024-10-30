package co.edu.konradlorenz.controller;

import java.io.*;
import java.util.*;

import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.Vista;

public class Controlador {

	private String path = "src/co/edu/konradlorenz/model/listaEstudiantes.txt";
    public void run() {
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
}
//class