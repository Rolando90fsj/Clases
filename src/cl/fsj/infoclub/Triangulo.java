package cl.fsj.infoclub;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	    int fila;
		System.out.println("Ingrese la cantidad de filas: ");
		fila = sc.nextInt();
		
		                
		        for (int x = 1; x <= fila; x++)
		        {
		            for (int i = 1; i <= x; i++)
		            {
		                System.out.print("* ");
		            }
		            
		            System.out.println("");
		        }
		    }
		
	

}
