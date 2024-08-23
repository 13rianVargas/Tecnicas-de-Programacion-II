package co.edu.konradlorenz.view;

import java.util.Scanner;

public class Window {
    
    // - // - // - // Objects // - // - // - /;/
    Scanner readInput = new Scanner(System.in);


    // - // - // - // Methods // - // - // - //
    public int priceIn() {
    	System.out.print("Sra. mesera ingrese el precio del plato: ");
    	int price = readInput.nextInt();
    	return price;
    }
    
    public String plateNameIn(String plateName) {
    	System.out.print("Sra. mesera ingrese el nombre del plato: ");
    	String name = readInput.nextLine();
    	return name;
    }
    
    public String drinkNameIn(String drinkName) {
    	System.out.print("Sra. mesera ingrese el nombre de la bebida: ");
    	String name = readInput.nextLine();
    	return name;
    }
    
    public String annotationIn(String annotation) {
    	System.out.print("Sra. mesera ingrese observaciones del pedido: ");
    	String anno = readInput.nextLine();
    	return anno;
    }
    
    public void showOrder(String Order) {
    	System.out.println(Order);
    }
    public void toBill(String x, long y) {
    	System.out.println(x + " -> $" + y);
    }
    
}//close class