package co.edu.konradlorenz.controller;

import java.util.ArrayList;

import co.edu.konradlorenz.model.Estudiante;
import co.edu.konradlorenz.view.Formulario;

public class Control {
	
	// - // - // Objects // - // - //
	protected Estudiante estudiante = new Estudiante();
	//protected Formulario formulario = new Formulario(); //Static then no longer useful//
	private ArrayList<Estudiante> listaDeEstudiantes = new ArrayList<>();
	
	
	// - // - // Methods // - // - //
	public void run() {
		//TODO: Crear la lista de pasos que realiza el Control.
		
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
	        }
			
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
			
			break;
		case 3://[3] Modificar estudiante
			
			break;
		case 4://[4] Eliminar estudiante
			
			break;
		case 5://[5] Salir
			
			break;
		default:
			
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
	
}
