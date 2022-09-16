package Clase2;

import Clase1.Animales;

public class Cabras extends Animales {
	private byte ms;

	public Cabras(String cdr, int cdp, String raza, String fecha, byte edad, short año,
			byte ms) {
		super(cdr, cdp, raza, fecha, edad, año);
		this.ms = ms;
	}

	public byte getMs() {
		return ms;
	}

	public void setMs(byte ms) {
		this.ms = ms;
	}
	

}
