package cl.fsj.infoclub;

import java.util.Scanner;

public class Anidado {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int i,j;
		
		for(i=0;i<n;i++) {
			System.out.print("*");
			for (j=0;j<i;j++) {
				System.out.println("");
			}
		}
	}

}
