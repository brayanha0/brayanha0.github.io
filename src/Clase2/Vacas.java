package Clase2;

import Clase1.Animales;

public class Vacas extends Animales{
	private byte sm;

	public Vacas(String cdr, int cdp, String fecha, String raza, byte edad, short a�o,
			byte sm) {
		super(cdr, cdp, fecha, raza, edad, a�o);
		this.sm = sm;
	}

	public byte getSm() {
		return sm;
	}

	public void setSm(byte sm) {
		this.sm = sm;
	}

}
