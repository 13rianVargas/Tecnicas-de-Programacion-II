/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.konradlorenz.model;

/**
 *
 * @author brian
 */
public class CuentaCorriente extends Cuenta implements Impuesto{
    
    public static final long cuotaManejo = 60000;

    @Override
    public void retirar(long retirito) {
        setSaldo(getSaldo() - retirito - calcular4x1000(retirito));
    }

    @Override
    public long calcular4x1000(long valorRetiro) {
        return (valorRetiro*4)/1000;
    }
    
}
