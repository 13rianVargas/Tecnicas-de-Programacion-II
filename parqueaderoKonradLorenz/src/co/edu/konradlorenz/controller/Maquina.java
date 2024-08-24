package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.Vehiculo;
import co.edu.konradlorenz.view.Factura;

public class Maquina {
	
	// - // - // - // Objects // - // - // - //
	protected Vehiculo vehiculo = new Vehiculo();

	// - // - // - // Methods // - // - // - //
	public void run() {
		
		//1.take data
		vehiculo.setPlaca(Factura.ingresarPlaca());
		vehiculo.setTipoDeVehiculo(Factura.ingresarTipoDeVehiculo());
		vehiculo.setFecha(Factura.ingresarFecha());
		vehiculo.setDuracion(Factura.ingresarDuracion());
		
		//2. cálculos xd.
		vehiculo.calcularPrecio();
		double valorParqueo=vehiculo.getPrecioAntesIva();
		double soloIva = vehiculo.calcularIva();
		double subTotal = vehiculo.getPrecioAntesIva() + soloIva;
		double totalPagar = vehiculo.calcularMultiplo50();
		double ajuste = vehiculo.calcularMultiplo50() - subTotal;
		
		//3. show receipt
		String placa = vehiculo.getPlaca();
		String fecha = vehiculo.getFecha();
		String tipoVehiculo = vehiculo.getTipoDeVehiculo();
		int duracion = vehiculo.getDuracion();
		int valorMinuto = 0;
		if(vehiculo.getTipoDeVehiculo().equals("bici")){
			valorMinuto = vehiculo.getPrecioBici();
		}else if(vehiculo.getTipoDeVehiculo().equals("moto")) {
			valorMinuto = vehiculo.getPrecioMoto();
		}else if(vehiculo.getTipoDeVehiculo().equals("carro")) {
			valorMinuto = vehiculo.getPrecioCarro();
		}
		
		Factura.mostrarFactura(placa, fecha, tipoVehiculo, duracion, valorMinuto, valorParqueo, soloIva, subTotal, ajuste, totalPagar);
		
	}//close run
	
}//close Maquina
