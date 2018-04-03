package ar.utn.dds.macowins;

public class Item {
	Prenda prenda;
	int cantidad;
	public float importe() {
		return prenda.precio()*this.cantidad;
	}
}
