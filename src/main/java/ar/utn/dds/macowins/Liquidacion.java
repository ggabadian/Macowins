package ar.utn.dds.macowins;

public class Liquidacion implements Estado {

	@Override
	public float precioFinal(float precioOriginal) {
		return precioOriginal/2;
	}

}
