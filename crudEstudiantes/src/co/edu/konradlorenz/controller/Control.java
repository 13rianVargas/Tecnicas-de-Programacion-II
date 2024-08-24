package co.edu.konradlorenz.controller;

import java.util.ArrayList;

import co.edu.konradlorenz.model.Estudiante;
import co.edu.konradlorenz.view.Formulario;

public class Control {
	
	// - // - // Objects // - // - //
	protected Estudiante estudiante = new Estudiante();
	//protected Formulario formulario = new Formulario(); //Static then no longer useful
	private ArrayList<Estudiante> listaDeEstudiantes = new ArrayList<>();
	private static byte option;
	
	
	// - // - // Methods // - // - //
	public void run() {
		
		//0. Show menu
		option = menu();

		//1. Using the option in a switch case
		option = switch1(option);
		
	}//close run
	
	public byte menu() {
		
		byte option;
		
		do {//Ciclo para verificar que option sea una opción valida. 
			option = Formulario.mostrarMenu();
		} while (option != 1 && option != 2 && option != 3 &&  option != 4 && option != 5);
		
		return option;
		
	}//close menu
	
	public byte switch1(byte option) {
		switch (option) {
		case 1://[1] Mostrar todos los estudiantes
			
			for (Estudiante estudiante : listaDeEstudiantes) {
	            
				String estudianteToString= estudiante.toString(); 
				Formulario.mostrarEstudiante(estudianteToString);
				
	        }
			
			option = 0;//Reinicia option
			
			return option = menu();//Vuelve al menú
		case 2://[2] Nuevo estudiante
			
			Estudiante nuevoEstudiante = new Estudiante();//Crea nuevoEstudiante
			
			//Pide datos del nuevoEstudiante
			nuevoEstudiante.setNombres(Formulario.pedirNombres(/*/null/*/));//TODO: Resolver el null
			nuevoEstudiante.setApellidos(Formulario.pedirApellidos());
			nuevoEstudiante.setCodigo(Formulario.pedirCodigo());
			nuevoEstudiante.setEdad(Formulario.pedirEdad());
			nuevoEstudiante.setPrograma(Formulario.pedirPrograma());
			nuevoEstudiante.setCorreo(Formulario.pedirCorreo());
			nuevoEstudiante.setNumeroMatricula(Formulario.pedirNumeroMatricula());
			
			//Guarda el nuevoEstudiante en la listaDeEstudiantes
			listaDeEstudiantes.add(nuevoEstudiante);
			
			Formulario.estudianteCreadoExitoso();
			
			option = 0;//Reinicia option
			
			return option = menu();//Vuelve al menú
		case 3://[3] Modificar estudiante
			
			String palabraDeBusqueda = Formulario.pedirPalabraDeBusqueda();
			Estudiante estudianteModificar = buscarEstudiante(palabraDeBusqueda);
			
			String nuevoAtributo = Formulario.pedirNuevoAtributo();
			
			option = 0;//Reinicia option
			
			do {//Ciclo para verificar que option sea una opción valida. 
				option = Formulario.menuModificar();
			} while (option != 1 && option != 2 && option != 3 &&  option != 4 && option != 5 && option != 6 && option != 7 && option != 8);
			
			switch (option) {
			case 1:
				estudianteModificar.setNombres(nuevoAtributo);
				Formulario.cambioAtributoExitoso();
				break;
			case 2:
				estudianteModificar.setApellidos(nuevoAtributo);
				Formulario.cambioAtributoExitoso();
				break;
			case 3:
				estudianteModificar.setCodigo(Long.parseLong(nuevoAtributo));//Transformo String en long
				Formulario.cambioAtributoExitoso();
				break;
			case 4:
				estudianteModificar.setEdad(Byte.parseByte(nuevoAtributo));//Transformo String en byte
				Formulario.cambioAtributoExitoso();
				break;
			case 5:
				estudianteModificar.setPrograma(nuevoAtributo);
				Formulario.cambioAtributoExitoso();
				break;
			case 6:
				estudianteModificar.setCorreo(nuevoAtributo);
				Formulario.cambioAtributoExitoso();
				break;
			case 7:
				estudianteModificar.setNumeroMatricula(Byte.parseByte(nuevoAtributo));//Transformo String en byte
				Formulario.cambioAtributoExitoso();
				break;
			case 8:
				return option = menu();//Vuelve al menú
			}//close switch2
			
			option = 0;//Reinicia option
			
			return option = menu();//Vuelve al menú
		case 4://[4] Eliminar estudiante
			
			palabraDeBusqueda = Formulario.pedirPalabraDeBusqueda();
			Estudiante estudianteEliminar = buscarEstudiante(palabraDeBusqueda);
			
			listaDeEstudiantes.remove(estudianteEliminar);
			
			Formulario.eliminarEstudianteExitoso();
			
			option = 0;//Reinicia option
			
			return option = menu();//Vuelve al menú
		case 5://[5] Salir
			
			Formulario.salir();
			
			System.exit(0);//Finaliza programa
			
			return 0;
			
		}//close switch1
		
		return option = menu();//Vuelve al menú
	}
	
	
	public Estudiante buscarEstudiante(String palabraDeBusqueda){
		
		boolean found = false;
		
		for (Estudiante estudiante : listaDeEstudiantes) {
            if (estudiante.getNombres().equals(palabraDeBusqueda)) {
            	Formulario.estudianteEncontrado();
            	found = true;
            	return estudiante;
            } else if (estudiante.getApellidos().equals(palabraDeBusqueda)) {
            	Formulario.estudianteEncontrado();
            	found = true;
            	return estudiante;
            } else if (estudiante.getCodigo() == Long.parseLong(palabraDeBusqueda)) {//Transformo String en long
            	Formulario.estudianteEncontrado();
            	found = true;
            	return estudiante;
            } else if (estudiante.getCorreo().equals(palabraDeBusqueda)) {
            	Formulario.estudianteEncontrado();
            	found = true;
            	return estudiante;
            }
        }//close for

        if (!found) {
        	String nuevaPalabraDeBusqueda = Formulario.reintentarPalabraDeBusqueda();
            return buscarEstudiante(nuevaPalabraDeBusqueda);//Vuelve a llamar a buscar estudiante.
        }
        
        return null;
	}//close buscarEstudiante
	
}//close Control
