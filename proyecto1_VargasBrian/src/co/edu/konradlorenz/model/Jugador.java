package co.edu.konradlorenz.model;

import java.util.Date;

public abstract class Jugador implements ClienteVip{
	private String nombre;
	private long identificacion;
	private String fecha;

	public Jugador() {
	}

	public Jugador(String nombre, long identificacion, String fecha) {
		super();
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(long identificacion) {
		this.identificacion = identificacion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", identificacion=" + identificacion + ", fecha=" + fecha + "]";
	}

	public abstract long pagar(int minutos);

}
