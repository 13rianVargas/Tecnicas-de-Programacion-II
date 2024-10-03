package co.edu.konradlorenz.model;

public class EstudianteJugador extends Jugador {

	private long codigoEstudiante;

	public EstudianteJugador() {
	}

	public EstudianteJugador(String nombre, long identificacion, String fecha) {
		super(nombre, identificacion, fecha);
	}

	public EstudianteJugador(String nombre, long identificacion, String fecha, long codigoEstudiante) {
		super(nombre, identificacion, fecha);
		this.codigoEstudiante = codigoEstudiante;
	}

	public long getCodigoEstudiante() {
		return codigoEstudiante;
	}

	public void setCodigoEstudiante(long codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}

	@Override
	public String toString() {
		return "EstudianteJugador [codigoEstudiante=" + codigoEstudiante + "]";
	}

	@Override
	public long pagar(int minutos) {
		return calcularDescuento(minutos) == true ? (minutos * 100) - DESCUENTO : minutos * 100;
	}

	@Override
	public boolean calcularDescuento(int minutos) {
		return minutos > 60 ? true : false;
	}

}
