package co.edu.konradlorenz.controller;

import java.util.ArrayList;

import co.edu.konradlorenz.model.Estudiante;
import co.edu.konradlorenz.view.Formulario;

public class Control {
	
	// - // - // Objects // - // - //
	protected Estudiante estudiante = new Estudiante();
	//protected Formulario formulario = new Formulario(); //Static then no longer useful
	private ArrayList<Estudiante> listaDeEstudiantes = new ArrayList<>();
	
	
	// - // - // Methods // - // - //
	public void run() {
		//TODO: Crear la lista de pasos que realiza el Control.
		//TODO: Regresar al menú principal.
		
		//0. Show menu
		byte option;
		
		do {//Ciclo para verificar que option sea una opción valida. 
			option = Formulario.mostrarMenu();
		} while (option != 1 && option != 2 && option != 3 &&  option != 4 && option != 5);
	
		
		//1. Using the option in a switch case
		switch (option) {
		case 1://[1] Mostrar todos los estudiantes
			
			for (Estudiante estudiante : listaDeEstudiantes) {
	            System.out.println(estudiante);//Puede que toque usar el toString
	            //TODO: No sysos
	        }
			
			option = 0;//Reinicia option
			
			break;
		case 2://[2] Nuevo estudiante
			
			Estudiante nuevoEstudiante = new Estudiante();//Crea nuevoEstudiante
			
			//Pide datos del nuevoEstudiante
			nuevoEstudiante.setNombres(Formulario.pedirNombres(null));//TODO: Resolver el null
			nuevoEstudiante.setApellidos(Formulario.pedirApellidos());
			nuevoEstudiante.setCodigo(Formulario.pedirCodigo());
			nuevoEstudiante.setEdad(Formulario.pedirEdad());
			nuevoEstudiante.setPrograma(Formulario.pedirPrograma());
			nuevoEstudiante.setCorreo(Formulario.pedirCorreo());
			nuevoEstudiante.setNumeroMatricula(Formulario.pedirNumeroMatricula());
			
			//Guarda el nuevoEstudiante en la listaDeEstudiantes
			listaDeEstudiantes.add(nuevoEstudiante);
			
			option = 0;//Reinicia option
			
			break;
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
				
				break;
			}
			
			option = 0;//Reinicia option
			
			break;
		case 4://[4] Eliminar estudiante
			
			palabraDeBusqueda = Formulario.pedirPalabraDeBusqueda();
			Estudiante estudianteEliminar = buscarEstudiante(palabraDeBusqueda);
			
			listaDeEstudiantes.remove(estudianteEliminar);
			
			Formulario.eliminarEstudianteExitoso();
			
			option = 0;//Reinicia option
			
			break;
		case 5://[5] Salir
			
			Formulario.salir();
			
			option = 0;//Reinicia option
			
			break;
		}
		
		//6. Getting data
		
		//7. Setting variables to send to View
		String nombres=estudiante.getNombres();
		String apellidos=estudiante.getApellidos();
		long codigo=estudiante.getCodigo();
		byte edad=estudiante.getEdad();
		String programa=estudiante.getPrograma();
		String correo=estudiante.getCorreo();
		byte numeroMatricula=estudiante.getNumeroMatricula();
		
		//8. Iterate the list
		
		//for (int i = 0; i < listaDeEstudiantes.size(); i++) {
			
		//}//TODO:Crear for
			
		//9. Sending to view
		Formulario.mostrarEstudiante(null);//TODO: Resolver el null
		
		//10. 
		//int index = Formulario.pedirEntero("");
		//listaDeEstudiantes.get(index);
	}
	
	public Estudiante buscarEstudiante(String palabraDeBusqueda){
		
		boolean found = false;
		
		for (Estudiante estudiante : listaDeEstudiantes) {
            if (estudiante.getNombres().equals(palabraDeBusqueda)) {
            	found = true;
            	return estudiante;
            } else if (estudiante.getApellidos().equals(palabraDeBusqueda)) {
            	found = true;
            	return estudiante;
            } else if (estudiante.getCodigo() == Long.parseLong(palabraDeBusqueda)) {//Transformo String en long
            	found = true;
            	return estudiante;
            } else if (estudiante.getCorreo().equals(palabraDeBusqueda)) {
            	found = true;
            	return estudiante;
            }
        }

        if (!found) {
        	String nuevaPalabraDeBusqueda = Formulario.reintentarPalabraDeBusqueda();
            return buscarEstudiante(nuevaPalabraDeBusqueda);//Vuelve a llamar a buscar estudiante.
        }
        
        return null;
	}
	
}
