package ar.utn.dds.macowins;

public class Prenda {
	float precioBase;
	Estado estado;
	Tipo tipo;
	float precio(){
		return this.estado.precioFinal(this.precioBase);
	}
}
