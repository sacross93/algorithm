package sihum;

import java.util.Scanner;

public class ep2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int b = 1;
		System.out.println("�ϰ� ������� ���� : ");
		int a = scanner.nextInt();
		
		for ( int i = a ; i > 0 ; i-- ) {
			b *= i ;
			
		}
		System.out.print(b);
	}

}
