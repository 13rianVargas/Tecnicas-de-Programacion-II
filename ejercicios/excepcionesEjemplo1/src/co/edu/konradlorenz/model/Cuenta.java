package co.edu.konradlorenz.model;

public abstract class Cuenta {
	double balance;

	public Cuenta(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double d) {
		this.balance = d;
	}

	public boolean retirar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a retirar debe ser mayor que cero.");
        }
        if (monto > balance) {
            return false;
        }
        balance -= monto;
        return true;
    }

	public void depositar(double monto) {
        if (monto > 0) {
            balance += monto;
        } else {
            throw new IllegalArgumentException("El monto a depositar debe ser mayor que cero.");
        }
    }
	
}
