package ar.utn.dds.macowins;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venta {
	private List<Item> items = new ArrayList<>();
	private Date fecha;
	ModoDePago modoDePago;
	
	public float subtotal() {
		return items.stream().map(item->item.importe()).sum();
	}
	public boolean esDeFecha(Date unaFecha) {
		return this.fecha==unaFecha;
	}
	
}
