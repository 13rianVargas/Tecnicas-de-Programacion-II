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
					for (Persona persona : listaPersonas) {
						if (persona instanceof Estudiante) {
							Estudiante estudiante = (Estudiante) persona;
					        Vista.mostrarMensaje(estudiante.toString());
					    }
					}
					break;
				case 2:
					Vista.mostrarMensaje("");
					for (Persona persona : listaPersonas) {
						if (persona instanceof Profesor) {
							Profesor profesor = (Profesor) persona;
					        Vista.mostrarMensaje(profesor.toString());
					    }
					}
					break;
				case 3:
					Vista.mostrarMensaje("");
					for (Persona persona : listaPersonas) {
						if (persona instanceof Decano) {
							Decano decano = (Decano) persona;
					        Vista.mostrarMensaje(decano.toString());
					    }
					}
					break;
				case 4:
					Vista.mostrarMensaje("");
					for (Persona persona : listaPersonas) {
						if (persona instanceof PersonalDeSeguridad) {
							PersonalDeSeguridad personalDeSeguridad = (PersonalDeSeguridad) persona;
					        Vista.mostrarMensaje(personalDeSeguridad.toString());
					    }
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
					ArrayList<Estudiante> estudiantesTemporal = new ArrayList<>();
					Vista.mostrarMensaje("");
					for (Persona persona : listaPersonas) {
						if (persona instanceof Estudiante) {
							Estudiante estudiante = (Estudiante) persona;
							Vista.mostrarMensaje("["+ i +"] "+ estudiante.toString());
							estudiantesTemporal.add(estudiante);
							i++;
					    }
					}
					Vista.mostrarMensaje("Seleccione el estudiante a modificar: ");
					index = Vista.pedirIndex();
					index--;
					Estudiante estudianteSeleccionado = estudiantesTemporal.get(index);
					Vista.mostrarMensaje("Seleccione atributo a modificar: ");
					atributo = Vista.mostrarAtributosDeEstudiante();
					switch (atributo) {
					case 1:
						estudianteSeleccionado.setNombre(Vista.pedirString("nombre"));
						Vista.mostrarMensaje("Atributo actualizado.");
						break;
					case 2:
			            estudianteSeleccionado.setCedula(Vista.pedirString("cédula"));
			            Vista.mostrarMensaje("Atributo actualizado.");
			            break;
			        case 3:
			            estudianteSeleccionado.setCodigoEstudiantil(Long.parseLong(Vista.pedirString("código estudiantil")));
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
					ArrayList<Profesor> profesoresTemporal = new ArrayList<>();
					Vista.mostrarMensaje("");
					for (Persona persona : listaPersonas) {
						if (persona instanceof Profesor) {
							Profesor profesor = (Profesor) persona;
							Vista.mostrarMensaje("["+ i +"] "+ profesor.toString());
							profesoresTemporal.add(profesor);
							i++;
					    }
					}
					Vista.mostrarMensaje("Seleccione el profesor a modificar: ");
					index = Vista.pedirIndex();
					index--;
					Profesor profesorSeleccionado = profesoresTemporal.get(index);
					Vista.mostrarMensaje("Seleccione atributo a modificar: ");
					atributo = Vista.mostrarAtributosDeProfesor();
					
					switch (atributo) {
					case 1:
						profesorSeleccionado.setNombre(Vista.pedirString("nombre"));
						Vista.mostrarMensaje("Atributo actualizado.");
						break;
					case 2:
						profesorSeleccionado.setCedula(Vista.pedirString("cédula"));
						Vista.mostrarMensaje("Atributo actualizado.");
						break;
					case 3:
						profesorSeleccionado.setNumeroDeTarjetaProfesional(Vista.pedirString("número de tarjeta profesional"));
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
					ArrayList<Decano> decanosTemporal = new ArrayList<>();
					Vista.mostrarMensaje("");
					for (Persona persona : listaPersonas) {
						if (persona instanceof Decano) {
							Decano decano = (Decano) persona;
							Vista.mostrarMensaje("["+ i +"] "+ decano.toString());
							decanosTemporal.add(decano);
							i++;
					    }
					}
					Vista.mostrarMensaje("Seleccione el decano a modificar: ");
					index = Vista.pedirIndex();
					index--;
					Decano decanoSeleccionado = decanosTemporal.get(index);
					Vista.mostrarMensaje("Seleccione atributo a modificar: ");
					atributo = Vista.mostrarAtributosDeDecano();
					switch (atributo) {
					case 1:
						decanoSeleccionado.setNombre(Vista.pedirString("nombre"));
						Vista.mostrarMensaje("Atributo actualizado.");
						break;
					case 2:
						decanoSeleccionado.setCedula(Vista.pedirString("cédula"));
						Vista.mostrarMensaje("Atributo actualizado.");
						break;
					case 3:
						decanoSeleccionado.setNumeroDeTarjetaProfesional(Vista.pedirString("número de tarjeta profesional"));
						Vista.mostrarMensaje("Atributo actualizado.");
						break;
					case 4:
						decanoSeleccionado.setFacultad(Vista.pedirString("facultad"));
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
					ArrayList<PersonalDeSeguridad> personalDeSeguridadTemporal = new ArrayList<>();
					Vista.mostrarMensaje("");
					for (Persona persona : listaPersonas) {
						if (persona instanceof PersonalDeSeguridad) {
							PersonalDeSeguridad personalDeSeguridad = (PersonalDeSeguridad) persona;
							Vista.mostrarMensaje("["+ i +"] "+ personalDeSeguridad.toString());
							personalDeSeguridadTemporal.add(personalDeSeguridad);
							i++;
					    }
					}
					Vista.mostrarMensaje("Seleccione el decano a modificar: ");
					index = Vista.pedirIndex();
					index--;
					PersonalDeSeguridad personalDeSeguridad = personalDeSeguridadTemporal.get(index);
					Vista.mostrarMensaje("Seleccione atributo a modificar: ");
					atributo = Vista.mostrarAtributosDeDecano();
					switch (atributo) {
					case 1:
						personalDeSeguridad.setNombre(Vista.pedirString("nombre"));
						Vista.mostrarMensaje("Atributo actualizado.");
						break;
					case 2:
						personalDeSeguridad.setCedula(Vista.pedirString("cédula"));
						Vista.mostrarMensaje("Atributo actualizado.");
						break;
					case 3:
						personalDeSeguridad.setNumeroDeMatricula(Long.parseLong(Vista.pedirString("número de matrícula")));
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
					ArrayList<Estudiante> estudiantesTemporal = new ArrayList<>();
					Vista.mostrarMensaje("");
					for (Persona persona : listaPersonas) {
						if (persona instanceof Estudiante) {
							Estudiante estudiante = (Estudiante) persona;
							Vista.mostrarMensaje("["+ i +"] "+ estudiante.toString());
							estudiantesTemporal.add(estudiante);
							i++;
					    }
					}
					Vista.mostrarMensaje("Seleccione el estudiante a eliminar: ");
					index = Vista.pedirIndex();
					index--;
					Estudiante estudianteAEliminar = estudiantesTemporal.get(index);
					listaPersonas.remove(estudianteAEliminar);
					estudiantesTemporal.remove(estudianteAEliminar);
					Vista.mostrarMensaje("Estudiante eliminado.");
					break;
				case 2:
					ArrayList<Profesor> profesoresTemporal = new ArrayList<>();
					Vista.mostrarMensaje("");
					for (Persona persona : listaPersonas) {
						if (persona instanceof Profesor) {
							Profesor profesor = (Profesor) persona;
							Vista.mostrarMensaje("["+ i +"] "+ profesor.toString());
							profesoresTemporal.add(profesor);
							i++;
					    }
					}
					Vista.mostrarMensaje("Seleccione el profesor a eliminar: ");
					index = Vista.pedirIndex();
					index--;
					Profesor profesorAEliminar = profesoresTemporal.get(index);
					listaPersonas.remove(profesorAEliminar);
					profesoresTemporal.remove(profesorAEliminar);
					Vista.mostrarMensaje("Profesor eliminado.");
					break;
				case 3:
					ArrayList<Decano> decanosTemporal = new ArrayList<>();
					Vista.mostrarMensaje("");
					for (Persona persona : listaPersonas) {
						if (persona instanceof Decano) {
							Decano decano = (Decano) persona;
							Vista.mostrarMensaje("["+ i +"] "+ decano.toString());
							decanosTemporal.add(decano);
							i++;
					    }
					}
					Vista.mostrarMensaje("Seleccione el decano a eliminar: ");
					index = Vista.pedirIndex();
					index--;
					Decano decanoAEliminar = decanosTemporal.get(index);
					listaPersonas.remove(decanoAEliminar);
					decanosTemporal.remove(decanoAEliminar);
					Vista.mostrarMensaje("Decano eliminado.");
					break;
				case 4:
					ArrayList<PersonalDeSeguridad> personalDeSeguridadTemporal = new ArrayList<>();
					Vista.mostrarMensaje("");
					for (Persona persona : listaPersonas) {
						if (persona instanceof PersonalDeSeguridad) {
							PersonalDeSeguridad personalDeSeguridad = (PersonalDeSeguridad) persona;
							Vista.mostrarMensaje("["+ i +"] "+ personalDeSeguridad.toString());
							personalDeSeguridadTemporal.add(personalDeSeguridad);
							i++;
					    }
					}
					Vista.mostrarMensaje("Seleccione el personal de seguridad a eliminar: ");
					index = Vista.pedirIndex();
					index--;
					PersonalDeSeguridad personalDeSeguridadAEliminar = personalDeSeguridadTemporal.get(index);
					listaPersonas.remove(personalDeSeguridadAEliminar);
					personalDeSeguridadTemporal.remove(personalDeSeguridadAEliminar);
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
					ArrayList<Estudiante> estudiantesTemporal = new ArrayList<>();
					Vista.mostrarMensaje("");
					for (Persona persona : listaPersonas) {
						if (persona instanceof Estudiante) {
							Estudiante estudiante = (Estudiante) persona;
							Vista.mostrarMensaje("["+ i +"] "+ estudiante.toString());
							estudiantesTemporal.add(estudiante);
							i++;
					    }
					}
					Vista.mostrarMensaje("Seleccione el estudiante: ");
					index = Vista.pedirIndex();
					index--;
					accion = Vista.mostrarAccionesEstudiante();
					switch (accion) {
					case 1:
						Vista.mostrarMensaje(" <> " + estudiantesTemporal.get(index).getNombre() + " pagó la matrícula, con un valor de: " + estudiantesTemporal.get(index).pagarMatricula());
						break;
					case 2:
						Vista.mostrarMensaje(estudiantesTemporal.get(index).asistirAClase());
						break;
					case 3:
						String mensaje = estudiantesTemporal.get(index).realizarLectura() ? " realizó la lectura." : " no realizó la lectura.";
						Vista.mostrarMensaje("\n" + estudiantesTemporal.get(index).getNombre() + mensaje);
						break;
					case 4:
						Vista.mostrarMensaje(estudiantesTemporal.get(index).entregarTrabajo());
						break;
					case 5:
						estudiantesTemporal.get(index).registrarEntrada(actualTime);
						Vista.mostrarMensaje("\n <> Entrada registrada ["+ actualTime +"]");
						break;
					case 6:
						estudiantesTemporal.get(index).registrarSalida(actualTime);
						Vista.mostrarMensaje("\n <> Salida registrada ["+ actualTime +"]");
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
					ArrayList<Profesor> profesoresTemporal = new ArrayList<>();
					Vista.mostrarMensaje("");
					for (Persona persona : listaPersonas) {
						if (persona instanceof Profesor) {
							Profesor profesor = (Profesor) persona;
							Vista.mostrarMensaje("["+ i +"] "+ profesor.toString());
							profesoresTemporal.add(profesor);
							i++;
					    }
					}
					Vista.mostrarMensaje("Seleccione el profesor: ");
					index = Vista.pedirIndex();
					index--;
					accion = Vista.mostrarAccionesProfesor();
					switch (accion) {
					case 1:
						Vista.mostrarMensaje(profesoresTemporal.get(index).dictarClase());
						break;
					case 2:
						String mensaje = profesoresTemporal.get(index).cobrarSueldo() ? "Se cobró el sueldo." : "No se cobró el sueldo.";
						Vista.mostrarMensaje("\n" + mensaje);
						break;
					case 3:
						Vista.mostrarMensaje("Se pagó " + profesoresTemporal.get(index).pagarImpuestos() + " en impuestos.");
						break;
					case 4:
						Vista.mostrarMensaje(profesoresTemporal.get(index).asistirAReunion());
						break;
					case 5:
						profesoresTemporal.get(index).registrarEntrada(actualTime);
						Vista.mostrarMensaje("\n <> Entrada registrada ["+ actualTime +"]");
						break;
					case 6:
						profesoresTemporal.get(index).registrarSalida(actualTime);
						Vista.mostrarMensaje("\n <> Salida registrada ["+ actualTime +"]");
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
					ArrayList<Decano> decanosTemporal = new ArrayList<>();
					Vista.mostrarMensaje("");
					for (Persona persona : listaPersonas) {
						if (persona instanceof Decano) {
							Decano decano = (Decano) persona;
							Vista.mostrarMensaje("["+ i +"] "+ decano.toString());
							decanosTemporal.add(decano);
							i++;
					    }
					}
					Vista.mostrarMensaje("Seleccione el decano: ");
					index = Vista.pedirIndex();
					index--;
					accion = Vista.mostrarAccionesDecano();
					switch (accion) {
					case 1:
						Vista.mostrarMensaje(decanosTemporal.get(index).dictarClase());
						break;
					case 2:
						String mensaje = decanosTemporal.get(index).cobrarSueldo() ? "Se cobró el sueldo." : "No se cobró el sueldo.";
						Vista.mostrarMensaje("\n" + mensaje);
						break;
					case 3:
						Vista.mostrarMensaje("Se pagó " + decanosTemporal.get(index).pagarImpuestos() + " en impuestos.");
						break;
					case 4:
						Vista.mostrarMensaje(decanosTemporal.get(index).asistirAReunion());
						break;
					case 5:
						Vista.mostrarMensaje(decanosTemporal.get(index).presentarReportes());
						break;
					case 6:
						decanosTemporal.get(index).registrarEntrada(actualTime);
						Vista.mostrarMensaje("\n <> Entrada registrada ["+ actualTime +"]");
						break;
					case 7:
						decanosTemporal.get(index).registrarSalida(actualTime);
						Vista.mostrarMensaje("\n <> Salida registrada ["+ actualTime +"]");
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
					ArrayList<PersonalDeSeguridad> personalDeSeguridadTemporal = new ArrayList<>();
					Vista.mostrarMensaje("");
					for (Persona persona : listaPersonas) {
						if (persona instanceof PersonalDeSeguridad) {
							PersonalDeSeguridad personalDeSeguridad = (PersonalDeSeguridad) persona;
							Vista.mostrarMensaje("["+ i +"] "+ personalDeSeguridad.toString());
							personalDeSeguridadTemporal.add(personalDeSeguridad);
							i++;
					    }
					}
					Vista.mostrarMensaje("Seleccione el personal de seguridad: ");
					index = Vista.pedirIndex();
					index--;
					accion = Vista.mostrarAccionesPersonalDeSeguridad();
					switch (accion) {
					case 1:
						Vista.mostrarMensaje(personalDeSeguridadTemporal.get(index).disparar());
						break;
					case 2:
						String mensaje = personalDeSeguridadTemporal.get(index).cobrarSueldo() ? "Se cobró el sueldo." : "No se cobró el sueldo.";
						Vista.mostrarMensaje("\n" + mensaje);
						break;
					case 3:
						Vista.mostrarMensaje("Se pagó " + personalDeSeguridadTemporal.get(index).pagarImpuestos() + " en impuestos.");
						break;
					case 4:
						Vista.mostrarMensaje(personalDeSeguridadTemporal.get(index).asistirAReunion());
						break;
					case 5:
						personalDeSeguridadTemporal.get(index).registrarEntrada(actualTime);
						Vista.mostrarMensaje("\n <> Entrada registrada ["+ actualTime +"]");
						break;
					case 6:
						personalDeSeguridadTemporal.get(index).registrarSalida(actualTime);
						Vista.mostrarMensaje("\n <> Salida registrada ["+ actualTime +"]");
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
		Vista.mostrarMensaje("\n <> Estudiante creado. <>");
	}

	private void nuevoProfesor() {
		Profesor profesor = new Profesor (Vista.pedirString("nombre"),Vista.pedirString("cédula"),Vista.pedirString("número de tarjeta profesional"));
		listaPersonas.add(profesor);
		Vista.mostrarMensaje("\n <> Profesor creado. <>");
	}

	private void nuevoDecano() {
		Decano decano = new Decano (Vista.pedirString("nombre"),Vista.pedirString("cédula"),Vista.pedirString("número de tarjeta profesional"),Vista.pedirString("facultad"));
		listaPersonas.add(decano);
		Vista.mostrarMensaje("\n <> Decano creado. <>");
	}

	private void nuevoPersonalDeSeguridad() {
		PersonalDeSeguridad personalDeSeguridad = new PersonalDeSeguridad (Vista.pedirString("nombre"),Vista.pedirString("cédula"),Long.parseLong(Vista.pedirString("número de matrícula")));
		listaPersonas.add(personalDeSeguridad);
		Vista.mostrarMensaje("\n <> Personal de seguridad creado. <>");
	}
}
