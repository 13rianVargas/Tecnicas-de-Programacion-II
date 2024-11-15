/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.konradlorenz.model;

/**
 *
 * @author brian
 */
public abstract class Cuenta {
    private String numeroCuenta;
    private long saldo = 0;

    public Cuenta() {
    }
    
    public Cuenta(String numeroCuenta, long saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }
    
    public void deposito(long saldo){
        this.saldo += saldo;
    }
    
    public abstract void retirar(long retirito);
    
}
