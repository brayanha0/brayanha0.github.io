package Clase1;

public class Animales {
	
	private int cdp;
	private String fecha, raza, cdr;
	private short año;
	private byte edad;

	public Animales(String cdr, int cdp, String fecha, String raza, byte edad, short año) {
		this.cdr = cdr;
		this.cdp = cdp;
		this.fecha = fecha;
		this.raza = raza;
		this.edad = edad;
		this.año = año;
	}

	public String getCdr() {
		return cdr;
	}

	public int getCdp() {
		return cdp;
	}

	public String getFecha() {
		return fecha;
	}

	public String getRaza() {
		return raza;
	}

	public byte getEdad() {
		return edad;
	}

	public short getAño() {
		return año;
	}

	public void setCdr(String cdr) {
		this.cdr = cdr;
	}

	public void setCdp(int cdp) {
		this.cdp = cdp;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public void setAño(short año) {
		this.año = año;
	}

}
