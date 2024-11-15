/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.konradlorenz.model;

/**
 *
 * @author brian
 */
public class CuentaAhorros extends Cuenta{

    boolean exenta = true;
    
    @Override
    public void retirar(long retirito) {
        if (exenta){
            setSaldo(getSaldo() - retirito);
        } else {
            //Excepcion xd
        }
    }
    
}
