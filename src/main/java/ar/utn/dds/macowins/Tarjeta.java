package ar.utn.dds.macowins;

public class Tarjeta implements ModoDePago {
	int cuotas;
	long coeficiente;
	public float recargo(float subtotal) {
		return (this.cuotas*this.coeficiente+0.01F*subtotal);
	}
	
	@Override
	public float modificarSubtotal(float subtotal) {
		return subtotal+this.recargo(subtotal);
	}

}
