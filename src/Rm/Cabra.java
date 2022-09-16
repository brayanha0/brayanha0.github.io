package Rm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import Clase2.Cabras;

public class Cabra {
	 final int N = 300;
		private int limite;
		private Cabras lista[];

	    public Cabra() throws FileNotFoundException {
			limite = 0;
			lista  = new Cabras[N];
			cargaCabras();
		}

		private void cargaCabras() throws FileNotFoundException  {
	    	Scanner input;
			
			input = new Scanner(new FileInputStream("C:\\Archivos\\DatosCabra.txt"));
			input.useDelimiter(";");
			while (input.hasNext()) {
				String cdr = input.next();
				int cdp = input.nextInt();
				String fecha = input.next();
				String raza = input.next();
				byte edad = input.nextByte();
				short año = input.nextShort();
				byte ms = input.nextByte();
				lista[limite++] = new Cabras(cdr, cdp, fecha, raza, edad, año, ms);
			}

			input.close();	
	    }

		public int getCdpm() {
			int producto = 0;
			for(int i=0; i<limite; i++)
				producto+=lista[i].getCdp();
			return producto;
		}

		public float getMxP() {
			float mProd = 0;
			for(int i=0;i<limite;i++)
	    		if(lista[i].getCdp()>mProd)
					mProd = lista[i].getCdp();
			return mProd;
		}

		public void imprimeMxC() {
			float mProdcuto = getMxP();
			System.out.print("Estas cabras producen la mayor cantidad de leche: \n");
			for(int i=0; i<limite; i++)
				if(lista[i].getCdp()==mProdcuto)
					System.out.println(lista[i].getCdr());
		}

		public void imprimeDatosC() {
			System.out.println("\nCabras: ");
	    	for(int i=0; i<limite; i++) {
	    		System.out.print(lista[i].getCdr());
	    		System.out.print("\t"+lista[i].getCdp());
	    		System.out.print("\t"+(lista[i].getCdp()*100)/getCdpm()+"%");
	    		System.out.print("\t"+lista[i].getFecha());
	    		System.out.print("\t"+lista[i].getRaza());
	    		System.out.print("\t"+lista[i].getEdad());
	    		System.out.print("\t"+lista[i].getAño());
	    		System.out.print("\t"+lista[i].getMs()+"\n");
	    	}
	    }

	    public void impCdProductoC() {
			System.out.println("\nProducto total de la cabra mensual: "+getCdpm());
		}
	
}
