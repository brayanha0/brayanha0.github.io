package Ejecutable;

import java.io.FileNotFoundException;
import Rm.Cabra;
import Rm.Vaca;

public class Main {
	  static void run() throws FileNotFoundException {
			Vaca  vaca = new Vaca();
	        Cabra cabra = new Cabra();
			vaca.imprimeDatos();
	        cabra.imprimeDatosC();
	        vaca.impCantidadProductoVaca();
	        cabra.impCdProductoC();
	        vaca.imprimeMxV();
	        cabra.imprimeMxC();
		}

	    public static void main(String[] args) throws FileNotFoundException {
	        run();
	    }

}
