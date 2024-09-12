package co.edu.konradlorenz.model;

public class Educativo extends Video{
	private String tipoVideo;


	public Educativo() {
	}
	public Educativo(String nombre, String canal, String enlace, String tipoVideo) {
		super(nombre, canal, enlace);
		this.tipoVideo = tipoVideo;
	}


	public String getTipoVideo() {
		return tipoVideo;
	}
	public void setTipoVideo(String tipoVideo) {
		this.tipoVideo = tipoVideo;
	}
	
	@Override
	public String toString() {
		return "\n[Nombre => " + getNombre() + ", Canal => " + getCanal() + ", Enlace => " + getEnlace() + ", Tipo de video => " + tipoVideo + "]";
	}
	
}
