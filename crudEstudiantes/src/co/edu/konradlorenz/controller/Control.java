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
		//1. Getting data
		//estudiante.setNombres(Formulario.pedirNombres(null));//TODO: Resolver el null
		estudiante.setApellidos(Formulario.pedirApellidos());
		estudiante.setCodigo(Formulario.pedirCodigo());
		estudiante.setEdad(Formulario.pedirEdad());
		estudiante.setPrograma(Formulario.pedirPrograma());
		estudiante.setCorreo(Formulario.pedirCorreo());
		estudiante.setNumeroMatricula(Formulario.pedirNumeroMatricula());
		
		//2. Setting variables to send to View
		String nombres=estudiante.getNombres();
		String apellidos=estudiante.getApellidos();
		long codigo=estudiante.getCodigo();
		byte edad=estudiante.getEdad();
		String programa=estudiante.getPrograma();
		String correo=estudiante.getCorreo();
		byte numeroMatricula=estudiante.getNumeroMatricula();
		
		//3. Iterate the list
		
		//for (int i = 0; i < listaDeEstudiantes.size(); i++) {
			
		//}//TODO:Crear for
			
		//4. Sending to view
		Formulario.mostrarEstudiante(null);//TODO: Resolver el null
		
		//5. 
		//int index = Formulario.pedirEntero("");
		//listaDeEstudiantes.get(index);
	}
	
}
