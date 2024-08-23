package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.Order;
import co.edu.konradlorenz.view.Window;

public class Waiter {
	
	// - // - // - // Objects // - // - // - //
	protected Order objOrder = new Order();
	protected Window objWindow = new Window();


	// - // - // - // Methods // - // - // - //
	public void run() {
		//1. Take order from customer.
		objOrder.setPlateName(objWindow.plateNameIn("nombre del plato"));
		objOrder.setDrinkName(objWindow.drinkNameIn("nombre de la bebida"));
		objOrder.setAnnotation(objWindow.annotationIn("anotaciones"));
		objOrder.setPrice(objWindow.priceIn());
		
		
		//2. Deliver order to chef.
		
		
		
		//3. Taker food from chef and deliver to customer.
		objWindow.showOrder(objOrder.toString());
		
		
		//4. Charge.
		objWindow.showOrder(" «» FACTURA «» ");
		int p = (int)(objOrder.getPrice()*0.8);
		objWindow.toBill(objOrder.getPlateName(), p);
		p = (int)(objOrder.getPrice()*0.2);
		objWindow.toBill(objOrder.getDrinkName(), p);
		objWindow.toBill("TOTAL A PAGAR: $", objOrder.getPrice());
		
		
	}//close run
	
}//close class