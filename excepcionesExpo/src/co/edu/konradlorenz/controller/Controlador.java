package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.Vista;

public class Controlador {

    public void run() {
    	
    	System.out.println("Días de la semana: ");
        for (WeekDay day : WeekDay.values()) {
            System.out.println(day);
        }
    	
        Vista.mostrarMensaje("\n >> Ingrese un día de la semana");
        
        while(true) {
        	try {
		        
		    	String weekDay = Vista.pedirString();
		    	
		    	WeekDay day = WeekDay.valueOf(weekDay);
		    	
		    	Vista.mostrarMensaje("\nEl día elegido fue -> " + day);
		    	break;
        	} catch(IllegalArgumentException e) {
        		Vista.mostrarMensaje("Excepción encontrada: " + e);
        		Vista.mostrarMensaje("\n >> Ingrese un día de la semana VÁLIDO");
        	}
        }
    }
}
