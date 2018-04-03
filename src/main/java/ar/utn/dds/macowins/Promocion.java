package ar.utn.dds.macowins;

public class Promocion implements Estado {
	private float descuento;
	public Promocion(float descuento){
		this.descuento=descuento;
	}
	
	@Override
	public float precioFinal(float precioOriginal) {
		return precioOriginal-this.descuento;
	}

}
