/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.konradlorenz.model;

/**
 *
 * @author brian
 */
public interface Impuesto {
    public static final double IVA = 0.19;
    
    public abstract long calcular4x1000(long valorRetiro);
    
}
