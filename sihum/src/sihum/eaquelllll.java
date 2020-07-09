package sihum;

import java.util.Scanner;

public class eaquelllll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int a = 0 ;
		
		System.out.println("정수를 입력하세요");
		
		a = scanner.nextInt();
		
		int b = a%60 ;
		System.out.println(b + "초");
		int c = (a/60)%60 ;
		int e = (a/60)/60;
		System.out.println((c + "분" + e +"시간"));
		
		
		
		
		

		}

	}


