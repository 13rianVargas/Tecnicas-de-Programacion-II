package co.edu.konradlorenz.view;

import java.util.Scanner;

public class Vista {
    private Scanner sc = new Scanner(System.in);
    
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    
    public static String pedirString(String info) {
    	Vista v = new Vista();
    	System.out.println("Ingrese " + info + ":");
    	return v.sc.nextLine();
    }
    
    public static byte pedirIndex() {
    	Vista v = new Vista();
    	byte index = v.sc.nextByte();
        v.sc.nextLine();
        return index;
    }
    
    public static byte mostrarMenu() {
    	System.out.print("\n <> <> <> Fundación Universitaria Konrad Lorenz <> <> <> \n"
        		+ "   [1] Nueva persona. \n"
        		+ "   [2] Mostrar personas por tipo. \n"
        		+ "   [3] Mostrar todas las personas. \n"
        		+ "   [4] Modificar persona. \n"
        		+ "   [5] Eliminar persona. \n"
        		+ "   [6] Ejecutar acciones. \n"
        		+ "   [0] Salir. \n"
        		+ "    >> Ingrese una opción: ");
    	
    	Vista v = new Vista();
    	byte opcion = v.sc.nextByte();
        v.sc.nextLine();
        return opcion; 
    }
    
    public static byte mostrarTipoPersona() {
    	System.out.print("\n <> <> <> Tipo de Persona <> <> <> \n"
        		+ "   [1] Estudiante. \n"
        		+ "   [2] Profesor. \n"
        		+ "   [3] Decano. \n"
        		+ "   [4] Personal de seguridad. \n"
        		+ "   [0] Volver. \n"
        		+ "    >> Ingrese una opción: ");
    	
    	Vista v = new Vista();
    	byte opcion = v.sc.nextByte();
        v.sc.nextLine();
        return opcion; 
    }
    
    public static byte mostrarAtributosDeEstudiante() {
    	System.out.print("\n <> <> <> Atributos de Estudiante <> <> <> \n"
        		+ "   [1] Nombre. \n"
        		+ "   [2] Cédula. \n"
        		+ "   [3] Código Estudiantil. \n"
        		+ "   [0] Volver. \n"
        		+ "    >> Ingrese una opción: ");
    	
    	Vista v = new Vista();
    	byte atributo = v.sc.nextByte();
        v.sc.nextLine();
        return atributo; 
    }
    
    public static byte mostrarAtributosDeProfesor() {
    	System.out.print("\n <> <> <> Atributos de Profesor <> <> <> \n"
        		+ "   [1] Nombre. \n"
        		+ "   [2] Cédula. \n"
        		+ "   [3] Número de tarjeta profesional. \n"
        		+ "   [0] Volver. \n"
        		+ "    >> Ingrese una opción: ");
    	
    	Vista v = new Vista();
    	byte atributo = v.sc.nextByte();
        v.sc.nextLine();
        return atributo; 
    }
    
    public static byte mostrarAtributosDeDecano() {
    	System.out.print("\n <> <> <> Atributos de Decano <> <> <> \n"
        		+ "   [1] Nombre. \n"
        		+ "   [2] Cédula. \n"
        		+ "   [3] Número de tarjeta profesional. \n"
        		+ "   [4] Facultad. \n"
        		+ "   [0] Volver. \n"
        		+ "    >> Ingrese una opción: ");
    	
    	Vista v = new Vista();
    	byte atributo = v.sc.nextByte();
        v.sc.nextLine();
        return atributo; 
    }
    
    public static byte mostrarAtributosDePersonalDeSeguridad() {
    	System.out.print("\n <> <> <> Atributos de Personal de Seguridad <> <> <> \n"
        		+ "   [1] Nombre. \n"
        		+ "   [2] Cédula. \n"
        		+ "   [3] Número de matrícula. \n"
        		+ "   [0] Volver. \n"
        		+ "    >> Ingrese una opción: ");
    	
    	Vista v = new Vista();
    	byte atributo = v.sc.nextByte();
        v.sc.nextLine();
        return atributo; 
    }
    
    public static byte mostrarAccionesEstudiante() {
    	System.out.print("\n <> <> <> Acciones de Estudiante <> <> <> \n"
        		+ "   [1] Pagar matrícula. \n"
        		+ "   [2] Asistir a clase. \n"
        		+ "   [3] Realizar lectura. \n"
        		+ "   [4] Entregar trabajo. \n"
        		+ "   [5] Registrar ingreso. \n"
        		+ "   [6] Registrar salida. \n"
        		+ "   [0] Volver. \n"
        		+ "    >> Ingrese una opción: ");
    	
    	Vista v = new Vista();
    	byte accion = v.sc.nextByte();
        v.sc.nextLine();
        return accion; 
    }
    
    public static byte mostrarAccionesProfesor() {
    	System.out.print("\n <> <> <> Acciones de Profesor <> <> <> \n"
        		+ "   [1] Dictar clase. \n"
        		+ "   [2] Cobrar sueldo. \n"
        		+ "   [3] Pagar impuestos. \n"
        		+ "   [4] Asistir a reunión. \n"
        		+ "   [5] Registrar ingreso. \n"
        		+ "   [6] Registrar salida. \n"
        		+ "   [0] Volver. \n"
        		+ "    >> Ingrese una opción: ");
    	
    	Vista v = new Vista();
    	byte accion = v.sc.nextByte();
        v.sc.nextLine();
        return accion; 
    }
    
    public static byte mostrarAccionesDecano() {
    	System.out.print("\n <> <> <> Acciones de Decano <> <> <> \n"
        		+ "   [1] Dictar clase. \n"
        		+ "   [2] Cobrar sueldo. \n"
        		+ "   [3] Pagar impuestos. \n"
        		+ "   [4] Asistir a reunión. \n"
        		+ "   [5] Presentar reportes. \n"
        		+ "   [6] Registrar ingreso. \n"
        		+ "   [7] Registrar salida. \n"
        		+ "   [0] Volver. \n"
        		+ "    >> Ingrese una opción: ");
    	
    	Vista v = new Vista();
    	byte accion = v.sc.nextByte();
        v.sc.nextLine();
        return accion; 
    }
    
    public static byte mostrarAccionesPersonalDeSeguridad() {
    	System.out.print("\n <> <> <> Acciones de Personal de Seguridad <> <> <> \n"
        		+ "   [1] Disparar. \n"
        		+ "   [2] Cobrar sueldo. \n"
        		+ "   [3] Pagar impuestos. \n"
        		+ "   [4] Asistir a reunión. \n"
        		+ "   [5] Registrar ingreso. \n"
        		+ "   [6] Registrar salida. \n"
        		+ "   [0] Volver. \n"
        		+ "    >> Ingrese una opción: ");
    	
    	Vista v = new Vista();
    	byte accion = v.sc.nextByte();
        v.sc.nextLine();
        return accion; 
    }
    
}
