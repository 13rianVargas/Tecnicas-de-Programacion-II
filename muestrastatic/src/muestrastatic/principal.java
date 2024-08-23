package muestrastatic;

public class principal {

	public static void main(String[] args) {
		auto a1 = new auto("XYZ123", "MERCEDEZ", 200000, "azul");
		auto a2 = new auto("XYZ234", "MAZDA", 300000, "Rojo");
		auto a3 = new auto("XYZ345", "KIA", 400000, "Negro");
		auto a4 = new auto("XYZ456", "TOYOTA", 500000, "Azul");

		System.out.println("Precio con descuento del 10%");
		System.out.println(a1.precioPromocional());
		System.out.println(a2.precioPromocional());
		System.out.println(a3.precioPromocional());
		System.out.println(a4.precioPromocional());

		System.out.println("Precio sin descuento");
		auto.anularDescuento();

		System.out.println(a1.precioPromocional());
		System.out.println(a2.precioPromocional());
		System.out.println(a3.precioPromocional());
		System.out.println(a4.precioPromocional());

	}
}