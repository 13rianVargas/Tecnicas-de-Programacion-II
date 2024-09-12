package co.edu.konradlorenz.model;

public class Video {
	private String nombre;
	private String canal;
	private String enlace;
	
	
	public Video() {
	}
	public Video(String nombre, String canal, String enlace) {
		this.nombre = nombre;
		this.canal = canal;
		this.enlace = enlace;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCanal() {
		return canal;
	}
	public void setCanal(String canal) {
		this.canal = canal;
	}
	public String getEnlace() {
		return enlace;
	}
	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}


	@Override
	public String toString() {
		return "\n[Nombre => " + nombre + ", Canal => " + canal + ", Enlace => " + enlace + "]";
	}

}
