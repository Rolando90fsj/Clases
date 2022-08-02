package cl.fsj.infoclub;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Notas {

	public static void main(String[] args) {
		ArrayList<Float> notas = new ArrayList<Float>();
		notas.add(4.7f); //Al ser float o double se debe colocar f al final
		notas.add(2.2f);
		notas.add(5.4f);
		notas.add(6.9f);
		notas.add(4.4f);
		notas.add(2.6f);
		
		System.out.println("Estas son tus notas: "+notas+"\n");
		min(notas);
		max(notas);
	}
	
	static void min(ArrayList<Float> a) {
	
		System.out.println("El minimo de notas del arreglo es: "+Collections.min(a));
	}
	static void max(ArrayList<Float> b) {
		System.out.println("El minimo de notas del arreglo es: "+Collections.min(b));
	}
}
