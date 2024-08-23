package muestrastatic;

public class auto {

    private String patente;
    private String marca;
    private double precio;
    private String color;
    private static double dcto;

    public auto(String patente, String marca, double precio, String color) {
        super();
        this.patente = patente;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        auto.dcto = 10;
    }

    public double precioPromocional() {
        return this.precio - this.precio * auto.dcto / 100;
    }

    public static void anularDescuento() {
        auto.dcto = 0;
    }

    public String toString() {
        return "auto [patente=" + patente + ", marca=" + marca + ", precio=" + precio + ", color=" + color + "]";
    }

}
