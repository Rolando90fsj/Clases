package cl.fsj.infoclub;

import java.util.Scanner;

public class Patrones {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese numero de patrones: \n");
		int n = sc.nextInt();
		int it;
		
		 for(it=0;it<n;it++) {
			 System.out.printf("*");
		 }
	}
}	
/*static void imprimirMenu() {
	System.out.println("MENU:");
	System.out.println("1) Opcion 1");
	System.out.println("2) Opcion 2");
	System.out.println("3) Opcion 3");
	System.out.println("4) Salir");
	
}
}*/