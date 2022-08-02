package cl.fsj.infoclub;

import java.util.ArrayList;

public class Arreglos {
	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<>();
		nombres.add("Paulette");
		nombres.add("Guagua 1");
		nombres.add("Guagua 2");
		nombres.add("Claudia");
		nombres.add("Rolando");
		nombres.add("Mercedes");
		nombres.add("Sebastian - Christian");
		nombres.add("Cristian");
		nombres.add("Lisbeth");
		nombres.add("Paula");
		nombres.add("Samanta");
		nombres.add("Rodrigo");
		nombres.add("Cesar");
		nombres.add("Luciano");
		nombres.add("Silvia");
		nombres.add("Patricio");
		nombres.add("Constanza");
		nombres.add("Bossel");
		nombres.add("Cossio");
		nombres.add("Franco");
		nombres.add("Nicolas");
		nombres.add("Cristina");
		nombres.add("Luciano");
		nombres.add("Luciano");
		nombres.add("Luciano");
		nombres.add("Guagua 1");
		nombres.add("Guagua 1");
		
		System.out.println("nombres: "+nombres);
		System.out.println(nombres.size());
		ArrayList<String> borrar = new ArrayList<>();
		
		borrar.add("Luciano");
		borrar.add("Guagua 1");
		
	//	nombres.remove("Guagua 1");
		
	
		nombres.removeAll(borrar);
		System.out.println("nombres: "+nombres);
		System.out.println(nombres.size());
		nombres.set(5, "el amor por las guaguas");
		
		System.out.println("nombres: "+nombres);
		System.out.println(nombres.size());
		
	}

}

/*
nombres.add("Paulette");
nombres.add("Guagua 1");
nombres.add("Guagua 2");
nombres.add("Claudia");
nombres.add("Rolando");
nombres.add("Mercedes");
nombres.add("Sebastian - Christian");
nombres.add("Cristian");
nombres.add("Lisbeth");
nombres.add("Paula");
nombres.add("Samanta");
nombres.add("Rodrigo");
nombres.add("Cesar");
nombres.add("Luciano");
nombres.add("Silvia");
nombres.add("Patricio");
nombres.add("Constanza");
nombres.add("Bossel");
nombres.add("Cossio");
nombres.add("Franco");
nombres.add("Nicolas");
nombres.add("Cristina");
*/
