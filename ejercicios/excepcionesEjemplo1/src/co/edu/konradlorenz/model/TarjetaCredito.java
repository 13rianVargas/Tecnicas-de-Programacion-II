package co.edu.konradlorenz.model;

public class TarjetaCredito {
	String numeroUnico;
	String nombreCliente;

	public TarjetaCredito(String numeroUnico, String nombreCliente) {
		this.numeroUnico = numeroUnico;
		this.nombreCliente = nombreCliente;
	}
	public String getNumeroUnico() {
		return numeroUnico;
	}
	public void setNumeroUnico(String numeroUnico) {
		this.numeroUnico = numeroUnico;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	@Override
	public String toString() {
		return "TarjetaCredito [numeroUnico=" + numeroUnico + ", nombreCliente=" + nombreCliente + "]";
	}
}
