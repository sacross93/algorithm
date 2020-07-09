package sihum;

import java.util.Scanner;

public class ep3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = 0 ;
		int b = 0 ;
		int r = 1 ;
		System.out.println("ÀÔ·Â°ª :   ");
		b = scanner.nextInt();
		
		while ( b > 0 ) {
			r *= b;
			b--;
			
		}
		System.out.print(r);

		
		

	}

}
