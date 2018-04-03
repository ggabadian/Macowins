package ar.utn.dds.macowins;

public class Efectivo implements ModoDePago {

	@Override
	public float modificarSubtotal(float subtotal) {
		return subtotal;
	}

}
