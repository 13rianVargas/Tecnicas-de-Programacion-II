package co.edu.konradlorenz.model;

public class Vehiculo {

	private String placa;
	private String tipoDeVehiculo;
	private static final byte precioBici = 13;
	private static final byte precioMoto = 43;
	private static final byte precioCarro = 71;
	private int duracion;
	private String fecha;
	private double valorPagar;
	private int precioAntesIva;
	
	
	
	// - // - // - // Constructors // - // - // - //
	public Vehiculo () {
	
	}

	public Vehiculo(String placa, String tipoDeVehiculo, int duracion, String fecha, double valorPagar) {
		super();
		this.placa = placa;
		this.tipoDeVehiculo = tipoDeVehiculo;
		this.duracion = duracion;
		this.fecha = fecha;
		this.valorPagar = valorPagar;
	}

	
	
	// - // - // - // Getters & Setters // - // - // - //
	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getTipoDeVehiculo() {
		return tipoDeVehiculo;
	}


	public void setTipoDeVehiculo(String tipoDeVehiculo) {
		this.tipoDeVehiculo = tipoDeVehiculo.toLowerCase();
	}


	public byte getPrecioMoto() {
		return precioMoto;
	}


	public byte getPrecioBici() {
		return precioBici;
	}


	public byte getPrecioCarro() {
		return precioCarro;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public double getValorPagar() {
		return valorPagar;
	}


	public void setValorPagar(double valorPagar) {
		this.valorPagar = valorPagar;
	}
	
	public int getPrecioAntesIva() {
		return precioAntesIva;
	}

	public void setPrecioAntesIva(int precioAntesIva) {
		this.precioAntesIva = precioAntesIva;
	}
	
	
	// - // - // - // Methods // - // - // - //
	public void calcularPrecio(){
		
		switch (tipoDeVehiculo) {
		
			case "bici": {
				setPrecioAntesIva(precioBici* duracion);
				break;
			}
			case "moto": {
				setPrecioAntesIva(precioMoto* duracion);
				break;
			}
			case "carro": {
				setPrecioAntesIva(precioCarro* duracion);
				break;
			}
			default: {
				System.out.println("Error de tipo de vehiculo.");
			}
		}
	}
	
	public double calcularIva() {
		return getPrecioAntesIva()*0.19;
	}
	
	public int calcularMultiplo50(){
		return (((getPrecioAntesIva()+(int)calcularIva()) / 50) + 1) * 50;
	}

}
