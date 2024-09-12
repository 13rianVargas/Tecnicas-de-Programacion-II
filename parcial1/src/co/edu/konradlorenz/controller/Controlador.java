package co.edu.konradlorenz.controller;

import java.util.ArrayList;

import co.edu.konradlorenz.model.Educativo;
import co.edu.konradlorenz.model.Video;
import co.edu.konradlorenz.model.VideoJuego;
import co.edu.konradlorenz.view.Vista;

public class Controlador {

	protected Video video = new Video();
	protected Educativo educativo = new Educativo();
	protected VideoJuego videoJuego = new VideoJuego();

	private ArrayList<Video> listaDeVideos = new ArrayList<>();
	
	public void run() {

		while (true) {

			int option = Vista.menu();

			switch (option) {
				case 1:
				int contEducativos = 0;
				int contVideojuegos = 0;
					for (Video video : listaDeVideos) {
						Vista.mostrarMensaje(video.toString());
						if (video instanceof Educativo) {
							contEducativos++;
						}
						if (video instanceof VideoJuego) {
							contVideojuegos++;
						}
					}
					Vista.mostrarMensaje("\nTotal videos Educativos => " + contEducativos);
					Vista.mostrarMensaje("Total videos de Videojuegos => " + contVideojuegos);
					break;
				case 2:
					int opt = Vista.menuTipo();

					switch (opt) {
						case 1:
							for (Video video : listaDeVideos) {
								if (video instanceof Educativo) {
									Vista.mostrarMensaje(video.toString());
								}
							}
							break;
						case 2:
							for (Video video : listaDeVideos) {
								if (video instanceof VideoJuego) {
									Vista.mostrarMensaje(video.toString());
								}
							}
							break;
						case 3:

							break;
						case 4:
							Vista.mostrarMensaje("<> <> FIN <> <>");
							System.exit(0);
							break;
					
						default:
							break;
					}
					break;
				case 3:
					Vista.mostrarMensaje("Ingrese nombre del video:");
					String nombre = Vista.pedirString();
					Vista.mostrarMensaje("Ingrese canal del video:");
					String canal = Vista.pedirString();
					Vista.mostrarMensaje("Ingrese enlace");
					String enlace = Vista.pedirString();
					int optionTipoVideo = Vista.pedirTipo();
					String tipoVideo;

					switch (optionTipoVideo) {
						case 1:
							tipoVideo = "Educativo";
							nuevoVideoEducativo(nombre, canal, enlace, tipoVideo);
							break;
						case 2:
							tipoVideo = "Videojuego";
							nuevoVideoVideojuegos(nombre, canal, enlace, tipoVideo);
							break;
						case 3:
							//regresa al men´ú principal
							break;
					
						default:
							Vista.mostrarMensaje("Error al seleccionar opción");
							break;
					}

					break;
				case 4:
					Vista.mostrarMensaje("<> <> FIN <> <>");
					System.exit(0);
					break;
				default:
				Vista.mostrarMensaje("No se encuentra la opción");
					break;
			}
		}
    }

	public void nuevoVideoEducativo(String nombre, String canal, String enlace, String tipoVideo){
		Educativo video = new Educativo(nombre, canal, enlace, tipoVideo);
		listaDeVideos.add(video);
	}
	public void nuevoVideoVideojuegos(String nombre, String canal, String enlace, String tipoVideo){
		VideoJuego video = new VideoJuego(nombre, canal, enlace, tipoVideo);
		listaDeVideos.add(video);
	}

	



}
