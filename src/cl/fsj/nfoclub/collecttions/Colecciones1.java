package cl.fsj.nfoclub.collecttions;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.*;


public class Colecciones1 {

	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.000");
		
		ArrayList<Double> decimales = new ArrayList<Double> ();
		
		decimales.add(32.4);
		//decimales.add(Double.parseDouble(df.format(Math.random()*1000.0)));
		decimales.add(12.456);
		decimales.add(32.34);
		decimales.add(62.4);
		decimales.add(32.4);
		
		System.out.println("Estos son los decimales de la lista decimales: "+decimales);
		System.out.println("********************");
		
		ArrayList<Double> deci = new ArrayList<>();
		
		deci.add((double)(Math.round((Math.random()*10)*1000.0)/10));
		deci.add(Math.random()*10);
		
		System.out.println(deci);
		System.out.println("********************");
		decimales.addAll(deci);
		System.out.println("********************");
		System.out.println(decimales);
		System.out.println(decimales.size());   //Devuelve un Entero "Largo del arreglo"
		
		//Imprime posicion en la lista decimales
		System.out.println(decimales.indexOf(32.4)); //0
		System.out.println(decimales.indexOf(32.34)); //2
		System.out.println(decimales.indexOf(32.4456)); //-1
		
//		System.out.println("**************SET***********");
//		Muestra los valores ingresados de forma desordenado
//		Set<String> nicknames = new HashSet<>();
//		
//		 nicknames.add("ducksito");
//		 nicknames.add("rolando90");
//		 nicknames.add("polypleti");
//		 nicknames.add("gonzalezlillo");
//		 nicknames.add("edgamer63");
//		 nicknames.add("silvia2015");
//		 nicknames.add("sebaoteiza");
//		 nicknames.add("callita");
//		 nicknames.add("giornobanana");
//		 nicknames.add("lucianocesc");
//		 nicknames.add("felicity");
//		 nicknames.add("kernelweb");
//		 nicknames.add("cr111");
//		 nicknames.add("kessillox");
//		 
//		 System.out.println(nicknames);
		 
//		 System.out.println("**************LinkedHashSet***********");
//		 Se muestra en el orden ingresado
		
//		 Set<String> nicknames = new LinkedHashSet<>();
//			
//		 nicknames.add("ducksito");
//		 nicknames.add("rolando90");
//		 nicknames.add("polypleti");
//		 nicknames.add("gonzalezlillo");
//		 nicknames.add("edgamer63");
//		 nicknames.add("silvia2015");
//		 nicknames.add("sebaoteiza");
//		 nicknames.add("callita");
//		 nicknames.add("giornobanana");
//		 nicknames.add("lucianocesc");
//		 nicknames.add("felicity");
//		 nicknames.add("kernelweb");
//		 nicknames.add("cr111");
//		 nicknames.add("kessillox");
//		 
//		 System.out.println(nicknames);
		
//		 System.out.println("**************TreeSet***********");
//		 //Ordena en funcion alfabetica (a-z)
//		 Set<String> nicknames = new TreeSet<>();
//			
//		 nicknames.add("ducksito");
//		 nicknames.add("rolando90");
//		 nicknames.add("polypleti");
//		 nicknames.add("gonzalezlillo");
//		 nicknames.add("edgamer63");
//		 nicknames.add("silvia2015");
//		 nicknames.add("sebaoteiza");
//		 nicknames.add("callita");
//		 nicknames.add("giornobanana");
//		 nicknames.add("lucianocesc");
//		 nicknames.add("felicity");
//		 nicknames.add("kernelweb");
//		 nicknames.add("cr111");
//		 nicknames.add("kessillox");
//		 
//		 System.out.println(nicknames);
//		
		 System.out.println("**************Queue***********");
		 //Imprime toda la cola y puede repetir ingresos
		 Queue <String> nicknames = new LinkedList<>();
			
		 nicknames.add("ducksito");
		 nicknames.add("rolando90");
		 nicknames.add("polypleti");
		 nicknames.add("gonzalezlillo");
		 nicknames.add("edgamer63");
		 nicknames.add("silvia2015");
		 nicknames.add("sebaoteiza");
		 nicknames.add("callita");
		 nicknames.add("giornobanana");
		 nicknames.add("lucianocesc");
		 nicknames.add("felicity");
		 nicknames.add("kernelweb");
		 nicknames.add("cr111");
		 nicknames.add("kessillox");
		 
		 System.out.println(nicknames);
		 
	}
	 
	
}
