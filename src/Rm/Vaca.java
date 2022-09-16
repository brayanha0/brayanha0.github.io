package Rm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import Clase2.Vacas;

public class Vaca {
	 final int N = 300;
		private int limite;
		private Vacas lista[];

		public Vaca() throws FileNotFoundException {
			limite = 0;
			lista  = new Vacas[N];
			cVacas();
		}

		private void cVacas() throws FileNotFoundException  {
	    	Scanner input;
			
			input = new Scanner(new FileInputStream("C:\\Archivos\\DatosVaca.txt"));
			input.useDelimiter(";");
			while (input.hasNext()) {
				String cdr = input.next();
				int cdp = input.nextInt();
				String fecha = input.next();
				String raza = input.next();
				byte edad = input.nextByte();
				short año = input.nextShort();
				byte sm = input.nextByte();
				lista[limite++] = new Vacas(cdr, cdp, fecha, raza, edad, año, sm);
			}

			input.close();	
	    }

		public int getCdps() {
			int producto = 0;
			for(int i=0; i<limite; i++)
				producto+=lista[i].getCdp();
			return producto;
		}

		public float getMaxProducto() {
			float mProd = 0;
			for(int i=0;i<limite;i++)
	    		if(lista[i].getCdp()>mProd)
					mProd = lista[i].getCdp();
			return mProd;
		}

		public void imprimeMxV() {
			float mProdcuto = getMaxProducto();
			System.out.print("Estas vacas producen la mayor cantidad de leche: \n");
			for(int i=0; i<limite; i++)
				if(lista[i].getCdp()==mProdcuto)
					System.out.println(lista[i].getCdr());
		}

		public void imprimeDatos() {
			System.out.println("Vacas: ");
	    	for(int i=0; i<limite; i++) {
	    		System.out.print(lista[i].getCdr());
	    		System.out.print("\t"+lista[i].getCdp());
	    		System.out.print("\t"+(lista[i].getCdp()*100)/getCdps()+"%");
	    		System.out.print("\t"+lista[i].getFecha());
	    		System.out.print("\t"+lista[i].getRaza());
	    		System.out.print("\t"+lista[i].getEdad());
	    		System.out.print("\t"+lista[i].getAño());
	    		System.out.print("\t"+lista[i].getSm()+"\n");
	    	}
	    }

		public void impCantidadProductoVaca() {
			System.out.println("\nProducto total de la cabra semanal: "+getCdps());
		}

}
