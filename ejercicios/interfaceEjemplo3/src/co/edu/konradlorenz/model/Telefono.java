package co.edu.konradlorenz.model;

public class Telefono implements GPS,Radio {

	@Override
	public String iniciarRadio() {
		return "Radio iniciada :)";
		
	}

	@Override
	public String detenerRadio() {
		return "Radio detenida :(";
	}

	@Override
	public String obtenerCoordenadas() {
		return "Las coordenadas son: (X= 2168) (Z= -234)";	
	}
}
