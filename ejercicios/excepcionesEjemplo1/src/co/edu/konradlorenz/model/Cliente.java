package co.edu.konradlorenz.model;

import java.util.LinkedList;

import co.edu.konradlorenz.view.Vista;

public class Cliente implements TarifaEspecial {

	String nombre;
	String direccion;
	String pais;
	String documentoIdentidad;
	LinkedList <Cuenta> listaCuentas;

	public Cliente(String nombre, String direccion, String pais, String documentoIdentidad) {
        super();
        this.nombre = nombre;
        this.direccion = direccion;
        this.pais = pais;
        this.documentoIdentidad = documentoIdentidad;
        this.listaCuentas = new LinkedList<>();
    }
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getDocumentoIdentidad() {
		return documentoIdentidad;
	}
	public void setDocumentoIdentidad(String documentoIdentidad) {
		this.documentoIdentidad = documentoIdentidad;
	}
	public LinkedList<Cuenta> getListaCuentas() {
		return listaCuentas;
	}
	public void setListaCuentas(LinkedList<Cuenta> listaCuentas) {
		this.listaCuentas = listaCuentas;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", direccion=" + direccion + ", pais=" + pais + ", documentoIdentidad="
				+ documentoIdentidad + ", listaCuentas=" + listaCuentas + "]";
	}
	@SuppressWarnings("finally")
	@Override
	public double aplicarTarifaEspecial(){
		double tarifaBase = 100;
		boolean extranjero = false;
		try {
			extranjero = esClienteExtranjero();
		} catch (NullPointerException e) {
			Vista.mostrarMensaje("Agarré la excepción NullPointerException");
			if(!pais.equalsIgnoreCase("Colombia")) extranjero = true;
		} finally {
	        if (extranjero) {
	            return tarifaBase * 1.2;
	        } else {
	            return tarifaBase;
	        }
		}
	}
	@Override
    public boolean esClienteExtranjero() throws NullPointerException {
        String paisBanco = "Colombia";
        String paisesValidos[] = null; //Aquí genero el error je
        boolean extranjero = false;
        for (int i = 0; i < paisesValidos.length; i++) {
        	if (paisesValidos[i].equalsIgnoreCase(paisBanco)) {
        		extranjero = true;
        	}
		}
        return extranjero;
    }
}
