package ar.utn.dds.macowins;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Negocio {
	List<Venta> ventas = new ArrayList<>();
	
	public float gananciasDeUnDia(Date unDia) {
		return (float)this.ventas.stream().mapToDouble(venta->venta.total()).sum();
	}
	
}
