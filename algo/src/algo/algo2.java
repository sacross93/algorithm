package algo;

import java.util.*;
import java.io.*;

public class algo2 {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 0;
		
		while (a<10002){
			for (int i =1; i <= b ; i++ ){
				if ( b%i == 0 ) {
					c++;
					}
				}
			if (c == 2){
					a++;
					System.out.println(b);
			}
			
			b++;
			c=0;
		}

	}

}
