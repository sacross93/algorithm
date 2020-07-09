package algo;

import java.util.*;
import java.io.*;

public class algo1 {

	public static void main(String[] args)throws IOException {
		int result = 0;
		int result2 =0;
		int result3 =0;
		for( int i = 1 ; i <= 100 ; i++ ) {
			result += i*i;
		}
		for ( int i = 1 ; i <= 100 ; i++ ) {
			result2 += i;
		}
		result2*=result2;
		
		result3 = result2-result;
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
	}

}
