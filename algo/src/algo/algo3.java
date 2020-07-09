package algo;

import java.util.*;
import java.io.*;

public class algo3 {

	public static void main(String[] args)throws IOException {
		FileReader reader = new FileReader("C:\\Users\\wlsdu\\Desktop\\À¯Æ¿\\test.txt");
		int ch;
		int a[][] = new int[300][10];
		int b=0;
		int c=0;
		int d=0;
		int result[] = new int[300];

		while((ch = reader.read()) != -1) { 
				a[b][c]=(char)ch;
				a[b][c]-=48;
				c++;
				if (c == 5) {
					b++;
					c=0;
				}
			System.out.print((char)ch);	
		}
		System.out.println("");
		for(int i = 0 ; i < a.length ; i++ ){
			result[i]=1;
			for (int j = 0 ; j < 5 ; j++ ) {
				System.out.print(a[i][j]);
				result[i] *= a[i][j];
			}
			System.out.println("");
			System.out.println(result[i]);
			System.out.println("");
		}
		for ( int i = 0 ; i<result.length;i++){
			if( result[i] > d ) {
				d = result[i];
				System.out.println(d);
			}
		}
		System.out.println(d);
	}
}
