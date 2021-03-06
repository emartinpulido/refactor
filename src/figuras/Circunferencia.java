package figuras;

public class Circunferencia {
	private double radio;
	private String color;

	public Circunferencia(double radio) {
		this.radio = radio;
	}
	/**
	 Imprimir por pantalla información relativa a diámetro, color y área
	 @param No lleva
	 * */
	public void imprimir() {
		color = "rojo";
		System.out.println("Di�metro: " + (2 * radio));
		System.out.println("Color: " + color);
		double area = 2 * 3.1416 * radio * radio;
		System.out.println(area);
	}
	/** 
	 Comprobación si una circunferencia dada es igual al objeto en cuestión.
	 * */

	public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
		double radio1 = this.radio;
		double radio2 = otro.getRad();
		if (considerarDecimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}
	/**
	 Getter
	 * */
	
	public double getRad() {
		return radio;
	}

	public void setRad(double rad) {
		this.radio = rad;
	}
}
