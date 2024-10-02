package co.edu.konradlorenz.controller;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import co.edu.konradlorenz.model.*;
import co.edu.konradlorenz.view.Vista;

public class Controlador {
	
	private byte opcion = -1;
	private byte tipoPersona;
	private byte index;
	private byte atributo;
	private byte i;
	private byte accion;
	
	private ArrayList <Persona> listaPersonas = new ArrayList<>();
	private ArrayList <Estudiante> listaEstudiantes = new ArrayList<>();
	private ArrayList <Profesor> listaProfesores = new ArrayList<>();
	private ArrayList <Decano> listaDecanos = new ArrayList<>();
	private ArrayList <PersonalDeSeguridad> listaPersonalDeSeguridad = new ArrayList<>();
	
	private LocalDateTime fechaHoraActual = LocalDateTime.now();
	private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	private String actualTime = fechaHoraActual.format(formato);
	
    public void run() {
        while(opcion != 0) {
        	
        	opcion = Vista.mostrarMenu();
        	
        	switch (opcion) {
			case 1:
				tipoPersona = Vista.mostrarTipoPersona();
				switch (tipoPersona) {
				case 1:
					nuevoEstudiante();
					break;
				case 2:
					nuevoProfesor();
					break;
				case 3:
					nuevoDecano();
					break;
				case 4:
					nuevoPersonalDeSeguridad();
					break;
				case 0:
					Vista.mostrarMensaje("\n <> FIN <> ");
					break;
				default:
					Vista.mostrarMensaje("\n >> Opción no válida.");
					break;
				}
				break;
			case 2:
				tipoPersona = Vista.mostrarTipoPersona();
				switch (tipoPersona) {
				case 1:
					Vista.mostrarMensaje("");
					for (Estudiante estudiante : listaEstudiantes) {
						Vista.mostrarMensaje(estudiante.toString());
					}
					break;
				case 2:
					Vista.mostrarMensaje("");
					for (Profesor profesor : listaProfesores) {
						Vista.mostrarMensaje(profesor.toString());
					}
					break;
				case 3:
					Vista.mostrarMensaje("");
					for (Decano decano : listaDecanos) {
						Vista.mostrarMensaje(decano.toString());
					}
					break;
				case 4:
					Vista.mostrarMensaje("");
					for (PersonalDeSeguridad personalDeSeguridad : listaPersonalDeSeguridad) {
						Vista.mostrarMensaje(personalDeSeguridad.toString());
					}
					break;
				case 0:
					Vista.mostrarMensaje("\n <> FIN <> ");
					break;
				default:
					Vista.mostrarMensaje("\n >> Opción no válida.");
					break;
				}	
				break;
			case 3:
				Vista.mostrarMensaje("");
				for (Persona persona : listaPersonas) {
					Vista.mostrarMensaje(persona.toString());
				}
				break;
			case 4:
				i = 1;
				tipoPersona = Vista.mostrarTipoPersona();
				switch (tipoPersona) {
				case 1:
					Vista.mostrarMensaje("");
					for (Estudiante estudiante : listaEstudiantes) {
						Vista.mostrarMensaje("["+ i +"] "+ estudiante.toString());
						i++;
					}
					
					Vista.mostrarMensaje("Seleccione el estudiante a modificar: ");
					index = Vista.pedirIndex();
					index--;
					Vista.mostrarMensaje("Seleccione atributo a modificar: ");
					atributo = Vista.mostrarAtributosDeEstudiante();
					
					switch (atributo) {
					case 1:
						listaEstudiantes.get(index).setNombre(Vista.pedirString("nombre"));
						Vista.mostrarMensaje("Atributo actualizado.");
						break;
					case 2:
						listaEstudiantes.get(index).setCedula(Vista.pedirString("cédula"));
						Vista.mostrarMensaje("Atributo actualizado.");
						break;
					case 3:
						listaEstudiantes.get(index).setCodigoEstudiantil(Long.parseLong(Vista.pedirString("código estudiantil")));
						Vista.mostrarMensaje("Atributo actualizado.");
						break;
					case 0:
						Vista.mostrarMensaje("\n <> FIN <> ");
						break;
					default:
						Vista.mostrarMensaje("\n >> Opción no válida.");
						break;
					}
					
					break;
				case 2:
					Vista.mostrarMensaje("");
					for (Profesor profesor : listaProfesores) {
						Vista.mostrarMensaje("["+ i +"] " + profesor.toString());
						i++;
					}
					
					Vista.mostrarMensaje("Seleccione el profesor a modificar: ");
					index = Vista.pedirIndex();
					index--;
					Vista.mostrarMensaje("Seleccione atributo a modificar: ");
					atributo = Vista.mostrarAtributosDeProfesor();
					
					switch (atributo) {
					case 1:
						listaProfesores.get(index).setNombre(Vista.pedirString("nombre"));
						Vista.mostrarMensaje("Atributo actualizado.");
						break;
					case 2:
						listaProfesores.get(index).setCedula(Vista.pedirString("cédula"));
						Vista.mostrarMensaje("Atributo actualizado.");
						break;
					case 3:
						listaProfesores.get(index).setNumeroDeTarjetaProfesional(Long.parseLong(Vista.pedirString("número de tarjeta profesional")));
						Vista.mostrarMensaje("Atributo actualizado.");
						break;
					case 0:
						Vista.mostrarMensaje("\n <> FIN <> ");
						break;
					default:
						Vista.mostrarMensaje("\n >> Opción no válida.");
						break;
					}
					
					break;
				case 3:
					Vista.mostrarMensaje("");
					for (Decano decano : listaDecanos) {
						Vista.mostrarMensaje("["+ i +"] " + decano.toString());
						i++;
					}
					
					Vista.mostrarMensaje("Seleccione el decano a modificar: ");
					index = Vista.pedirIndex();
					index--;
					Vista.mostrarMensaje("Seleccione atributo a modificar: ");
					atributo = Vista.mostrarAtributosDeDecano();
					
					switch (atributo) {
					case 1:
						listaDecanos.get(index).setNombre(Vista.pedirString("nombre"));
						Vista.mostrarMensaje("Atributo actualizado.");
						break;
					case 2:
						listaDecanos.get(index).setCedula(Vista.pedirString("cédula"));
						Vista.mostrarMensaje("Atributo actualizado.");
						break;
					case 3:
						listaDecanos.get(index).setNumeroDeTarjetaProfesional(Long.parseLong(Vista.pedirString("número de tarjeta profesional")));
						Vista.mostrarMensaje("Atributo actualizado.");
						break;
					case 4:
						listaDecanos.get(index).setFacultad(Vista.pedirString("facultad"));
						Vista.mostrarMensaje("Atributo actualizado.");
						break;
					case 0:
						Vista.mostrarMensaje("\n <> FIN <> ");
						break;
					default:
						Vista.mostrarMensaje("\n >> Opción no válida.");
						break;
					}
					
					break;
				case 4:
					Vista.mostrarMensaje("");
					for (PersonalDeSeguridad personalDeSeguridad : listaPersonalDeSeguridad) {
						Vista.mostrarMensaje("["+ i +"] " + personalDeSeguridad.toString());
						i++;
					}
					
					Vista.mostrarMensaje("Seleccione el personal de seguridad a modificar: ");
					index = Vista.pedirIndex();
					index--;
					Vista.mostrarMensaje("Seleccione atributo a modificar: ");
					atributo = Vista.mostrarAtributosDePersonalDeSeguridad();
					
					switch (atributo) {
					case 1:
						listaPersonalDeSeguridad.get(index).setNombre(Vista.pedirString("nombre"));
						Vista.mostrarMensaje("Atributo actualizado.");
						break;
					case 2:
						listaPersonalDeSeguridad.get(index).setCedula(Vista.pedirString("cédula"));
						Vista.mostrarMensaje("Atributo actualizado.");
						break;
					case 3:
						listaPersonalDeSeguridad.get(index).setNumeroDeMatricula(Long.parseLong(Vista.pedirString("número de matrícula")));
						Vista.mostrarMensaje("Atributo actualizado.");
						break;
					case 0:
						Vista.mostrarMensaje(" <> FIN <> ");
						break;
					default:
						Vista.mostrarMensaje(" >> Opción no válida.");
						break;
					}
					
					break;
				case 0:
					Vista.mostrarMensaje("\n <> FIN <> ");
					break;
				default:
					Vista.mostrarMensaje("\n >> Opción no válida.");
					break;
				}
					
				break;
			case 5:
				i = 1;
				tipoPersona = Vista.mostrarTipoPersona();
				switch (tipoPersona) {
				case 1:
					Vista.mostrarMensaje("");
					for (Estudiante estudiante : listaEstudiantes) {
						Vista.mostrarMensaje("["+ i +"] "+ estudiante.toString());
						i++;
					}
					
					Vista.mostrarMensaje("Seleccione el estudiante a eliminar: ");
					index = Vista.pedirIndex();
					index--;
					
					listaEstudiantes.remove(index);
					Vista.mostrarMensaje("Estudiante eliminado.");
					
					break;
				case 2:
					Vista.mostrarMensaje("");
					for (Profesor profesor : listaProfesores) {
						Vista.mostrarMensaje("["+ i +"] " + profesor.toString());
						i++;
					}
					
					Vista.mostrarMensaje("Seleccione el profesor a modificar: ");
					index = Vista.pedirIndex();
					index--;
					
					listaProfesores.remove(index);
					Vista.mostrarMensaje("Profesor eliminado.");
					
					break;
				case 3:
					Vista.mostrarMensaje("");
					for (Decano decano : listaDecanos) {
						Vista.mostrarMensaje("["+ i +"] " + decano.toString());
						i++;
					}
					
					Vista.mostrarMensaje("Seleccione el decano a modificar: ");
					index = Vista.pedirIndex();
					index--;
					
					listaDecanos.remove(index);
					Vista.mostrarMensaje("Decano eliminado.");
					
					break;
				case 4:
					Vista.mostrarMensaje("");
					for (PersonalDeSeguridad personalDeSeguridad : listaPersonalDeSeguridad) {
						Vista.mostrarMensaje("["+ i +"] " + personalDeSeguridad.toString());
						i++;
					}
					
					Vista.mostrarMensaje("Seleccione el personal de seguridad a modificar: ");
					index = Vista.pedirIndex();
					index--;
					
					listaPersonalDeSeguridad.remove(index);
					Vista.mostrarMensaje("Personal de seguridad eliminado.");
					
					break;
				case 0:
					Vista.mostrarMensaje(" <> FIN <> ");
					break;
				default:
					Vista.mostrarMensaje(" >> Opción no válida.");
					break;
				}
				
				break;
			case 6:	
				i = 1;
				tipoPersona = Vista.mostrarTipoPersona();
				switch (tipoPersona) {
				case 1:
					Vista.mostrarMensaje("");
					for (Estudiante estudiante : listaEstudiantes) {
						Vista.mostrarMensaje("["+ i +"] "+ estudiante.toString());
						i++;
					}
					
					Vista.mostrarMensaje("Seleccione el estudiante: ");
					index = Vista.pedirIndex();
					index--;
					
					accion = Vista.mostrarAccionesEstudiante();
					
					switch (accion) {
					case 1:
						Vista.mostrarMensaje(listaEstudiantes.get(index).pagarMatricula());
						break;
					case 2:
						Vista.mostrarMensaje(listaEstudiantes.get(index).asistirAClase());
						break;
					case 3:
						Vista.mostrarMensaje(listaEstudiantes.get(index).realizarLectura());
						break;
					case 4:
						Vista.mostrarMensaje(listaEstudiantes.get(index).entregarTrabajo());
						break;
					case 5:
						Vista.mostrarMensaje(listaEstudiantes.get(index).registrarEntrada(actualTime));
						break;
					case 6:
						Vista.mostrarMensaje(listaEstudiantes.get(index).registrarSalida(actualTime));
						break;
					case 0:
						Vista.mostrarMensaje(" <> FIN <> ");
						break;
					default:
						Vista.mostrarMensaje(" >> Opción no válida.");
						break;
					}
					
					break;
				case 2:
					Vista.mostrarMensaje("");
					for (Profesor profesor : listaProfesores) {
						Vista.mostrarMensaje("["+ i +"] " + profesor.toString());
						i++;
					}
					
					Vista.mostrarMensaje("Seleccione el profesor: ");
					index = Vista.pedirIndex();
					index--;
					
					accion = Vista.mostrarAccionesProfesor();
					
					switch (accion) {
					case 1:
						Vista.mostrarMensaje(listaProfesores.get(index).dictarClase());
						break;
					case 2:
						Vista.mostrarMensaje(listaProfesores.get(index).cobrarSueldo(Empleado.SMMLV));
						break;
					case 3:
						Vista.mostrarMensaje(listaProfesores.get(index).pagarImpuestos());
						break;
					case 4:
						Vista.mostrarMensaje(listaProfesores.get(index).asistirAReunion());
						break;
					case 5:
						Vista.mostrarMensaje(listaProfesores.get(index).registrarEntrada(actualTime));
						break;
					case 6:
						Vista.mostrarMensaje(listaProfesores.get(index).registrarSalida(actualTime));
						break;
					case 0:
						Vista.mostrarMensaje(" <> FIN <> ");
						break;
					default:
						Vista.mostrarMensaje(" >> Opción no válida.");
						break;
					}
					
					break;
				case 3:
					Vista.mostrarMensaje("");
					for (Decano decano : listaDecanos) {
						Vista.mostrarMensaje("["+ i +"] " + decano.toString());
						i++;
					}
					
					Vista.mostrarMensaje("Seleccione el decano: ");
					index = Vista.pedirIndex();
					index--;
					
					accion = Vista.mostrarAccionesDecano();
					
					switch (accion) {
					case 1:
						Vista.mostrarMensaje(listaDecanos.get(index).dictarClase());
						break;
					case 2:
						Vista.mostrarMensaje(listaDecanos.get(index).cobrarSueldo(Empleado.SMMLV));
						break;
					case 3:
						Vista.mostrarMensaje(listaDecanos.get(index).pagarImpuestos());
						break;
					case 4:
						Vista.mostrarMensaje(listaDecanos.get(index).asistirAReunion());
						break;
					case 5:
						Vista.mostrarMensaje(listaDecanos.get(index).presentarReportes());
						break;
					case 6:
						Vista.mostrarMensaje(listaDecanos.get(index).registrarEntrada(actualTime));
						break;
					case 7:
						Vista.mostrarMensaje(listaDecanos.get(index).registrarSalida(actualTime));
						break;
					case 0:
						Vista.mostrarMensaje(" <> FIN <> ");
						break;
					default:
						Vista.mostrarMensaje(" >> Opción no válida.");
						break;
					}
					
					break;
				case 4:
					Vista.mostrarMensaje("");
					for (PersonalDeSeguridad personalDeSeguridad : listaPersonalDeSeguridad) {
						Vista.mostrarMensaje("["+ i +"] " + personalDeSeguridad.toString());
						i++;
					}
					
					Vista.mostrarMensaje("Seleccione el personal de seguridad: ");
					index = Vista.pedirIndex();
					index--;
					
					accion = Vista.mostrarAccionesPersonalDeSeguridad();
					
					switch (accion) {
					case 1:
						Vista.mostrarMensaje(listaPersonalDeSeguridad.get(index).disparar());
						break;
					case 2:
						Vista.mostrarMensaje(listaPersonalDeSeguridad.get(index).cobrarSueldo(Empleado.SMMLV));
						break;
					case 3:
						Vista.mostrarMensaje(listaPersonalDeSeguridad.get(index).pagarImpuestos());
						break;
					case 4:
						Vista.mostrarMensaje(listaPersonalDeSeguridad.get(index).asistirAReunion());
						break;
					case 5:
						Vista.mostrarMensaje(listaPersonalDeSeguridad.get(index).registrarEntrada(actualTime));
						break;
					case 6:
						Vista.mostrarMensaje(listaPersonalDeSeguridad.get(index).registrarSalida(actualTime));
						break;
					case 0:
						Vista.mostrarMensaje(" <> FIN <> ");
						break;
					default:
						Vista.mostrarMensaje(" >> Opción no válida.");
						break;
					}
					
					break;
				case 0:
					Vista.mostrarMensaje(" <> FIN <> ");
					break;
				default:
					Vista.mostrarMensaje(" >> Opción no válida.");
					break;
				}
				
				break;
			case 0:
				Vista.mostrarMensaje("\n <> FIN <> ");
				break;
			default:
				Vista.mostrarMensaje("\n >> Opción no válida.");
				break;
			}
        }
    }

	private void nuevoEstudiante() {
		Estudiante estudiante = new Estudiante (Vista.pedirString("nombre"),Vista.pedirString("cédula"),Long.parseLong(Vista.pedirString("código estudiantil")));
		listaPersonas.add(estudiante);
		listaEstudiantes.add(estudiante);
		Vista.mostrarMensaje("Estudiante creado.");
	}

	private void nuevoProfesor() {
		Profesor profesor = new Profesor (Vista.pedirString("nombre"),Vista.pedirString("cédula"),Long.parseLong(Vista.pedirString("número de tarjeta profesional")));
		listaPersonas.add(profesor);
		listaProfesores.add(profesor);
		Vista.mostrarMensaje("Profesor creado.");
	}

	private void nuevoDecano() {
		Decano decano = new Decano (Vista.pedirString("nombre"),Vista.pedirString("cédula"),Long.parseLong(Vista.pedirString("número de tarjeta profesional")),Vista.pedirString("facultad"));
		listaPersonas.add(decano);
		listaDecanos.add(decano);
		Vista.mostrarMensaje("Decano creado.");
	}

	private void nuevoPersonalDeSeguridad() {
		PersonalDeSeguridad personalDeSeguridad = new PersonalDeSeguridad (Vista.pedirString("nombre"),Vista.pedirString("cédula"),Long.parseLong(Vista.pedirString("número de matrícula")));
		listaPersonas.add(personalDeSeguridad);
		listaPersonalDeSeguridad.add(personalDeSeguridad);
		Vista.mostrarMensaje("Personal de seguridad creado.");
	}
}
