package sihum;

import java.util.Scanner;

public class maaax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("3개의 숫자를 입력");
		int a[] = new int [3];
		int max = 0 ;
		int r = 0 ;
		
		for(int i = 0 ; i < a.length ; i++) {

			a[i] = scanner.nextInt();

			if ( i == 0) {
				max = a[i];
				continue;
			}
			if ( a[i] > a[i-1] ) {
				max = a[i];
			}

			}
		System.out.println(max);
		}
		
	}
	

