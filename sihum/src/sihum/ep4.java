package sihum;

import java.util.*;
import java.io.*;

public class ep4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[5];
		int b[];
		System.out.println("5���� ������ �Է��ϼ��� :  ");
		
		for ( int i = 0 ; i < a.length ; i++ ) {
			a[i] = scanner.nextInt();
		}
		for(int i : a ) {
			System.out.println(a[i]);
		}
		

	}

}
