package co.edu.konradlorenz.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vista {
    private Scanner sc = new Scanner(System.in);
    
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    
    public static String pedirString(){
    	Vista v = new Vista();
    	
        return v.sc.nextLine();
    }
    
    public static int pedirEntero(){
    	Vista v = new Vista();
    	System.out.println("Ingrese un número entero: ");
    	return v.sc.nextInt();
    }
}
