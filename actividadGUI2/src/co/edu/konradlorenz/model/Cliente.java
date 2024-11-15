/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.konradlorenz.model;

/**
 *
 * @author brian
 */
public class Cliente extends Persona{
    
    protected String clave;

    public Cliente() {
    }

    public Cliente(String clave) {
        this.clave = clave;
    }

    public Cliente(String nombre, String cedula) {
        super(nombre, cedula);
    } 
    
    public Cliente(String clave, String nombre, String cedula) {
        super(nombre, cedula);
        this.clave = clave;
    }    

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Cliente{" + "clave=" + clave + '}';
    }
    
}
