package co.edu.konradlorenz.model;

public interface TarifaEspecial {

	abstract double aplicarTarifaEspecial();
	
	abstract boolean esClienteExtranjero() throws NullPointerException;
	
}
