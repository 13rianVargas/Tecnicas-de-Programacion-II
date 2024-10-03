package co.edu.konradlorenz.model;

public interface MedioDeTransporte {
	public static int VELPROMEDIO = 1;
	//debe ser static, ir en mayuscula
	
	public void arrancar();
	public String frenar();
	//los metodos no se implementan, y no son static
			
}
