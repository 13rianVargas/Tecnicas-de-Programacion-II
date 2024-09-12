package co.edu.konradlorenz.view;
import java.util.Scanner;

public class Vista {
    static Scanner sc = new Scanner(System.in);

    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public static int menu(){
        System.out.print("\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <> <>\n"
				+ " <>            MENÚ PRINCIPAL           <>\n"
				+ " <> [1] Mostrar todos los videos        <>\n"
                + " <> [2] Mostrar videos por tipo         <>\n"
                + " <> [3] Ingresar nuevo video            <>\n"
                + " <> [4] Salir                           <>\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <> <>\n");
                int option = sc.nextInt();
                sc.nextLine();
                return option;
    }

    public static int menuTipo(){
        System.out.print("\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <> <>\n"
				+ " <>       ¿Qué videos desea ver?        <>\n"
				+ " <> [1] Mostrar videos educativos       <>\n"
                + " <> [2] Mostrar videos de videojuegos   <>\n"
                + " <> [3] Volver a menú principal         <>\n"
                + " <> [4] Salir                           <>\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <> <>\n");
                int option = sc.nextInt();
                sc.nextLine();
                return option;
    }

    public static int pedirTipo(){
        System.out.print("\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <> <>\n"
				+ " <>       Elije el tipo de video:       <>\n"
				+ " <> [1] Educativo                       <>\n"
                + " <> [2] Videojuegos                     <>\n"
                + " <> [3] Cancelar                        <>\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <> <>\n");
                int option = sc.nextInt();
                sc.nextLine();
                return option;
    }

    public static String pedirString(){
        return sc.nextLine();
    }
}

