package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.Ventana;

public class Control {

	protected Jugador objJugador = new Jugador();
	protected Estacion objEstacion = new Estacion();
	
    public void run() {
    	byte i = 0;
    	
    	do {
    		i = Ventana.mostrarMenu();
    		
    		switch (i){
    		case 0:
    			Ventana.mostrarMensaje("Seleccionó salir, hasta pronto.");
    			break;
    		case 1:
    			Ventana.mostrarMensaje("Seleccionó asignar jugador.");
    			crearJugadorConConstructor();
    			
    			break;
    		case 2:
    			Ventana.mostrarMensaje("Seleccionó mostrar jugador.");
    			crearJugadorConSetter();
    			break;
    		}
    	}while(i!=0);
        
    }
    
    public void crearJugadorConConstructor() {
    	/*
    	String n,f;
    	long id;
    	
    	n = Ventana.pedirString("nombre");
    	id = Long.parseLong(Ventana.pedirString("identificación"));
    	f = Ventana.pedirString("fecha");
    	
    	objJugador = new Jugador (n,id,f);
    	//*/
    	
    	//*
    	objJugador = new Jugador (Ventana.pedirString("nombre"),Long.parseLong(Ventana.pedirString("identificación")),Ventana.pedirString("fecha"));
    	objEstacion.setListaJugadores(objJugador);
    	//*/
    }
    
    public void crearJugadorConSetter() {
    	objJugador = new Jugador ();
    	
    	objJugador.setNombre(Ventana.pedirString("nombre"));
    	objJugador.setIdentificacion(Long.parseLong(Ventana.pedirString("identificación")));
    	objJugador.setFecha(Ventana.pedirString("fecha"));
    	
    }
}
