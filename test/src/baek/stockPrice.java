package baek;

import java.util.*;

public class stockPrice {

	public static void main(String[] args) {
		int[] prices = new int[]{1,2,3,2,3};
		int[] answer = new int[prices.length];
		int count = 0;
		
        for(int i=0;i<prices.length;i++) {
        	for(int j=i+1;j<prices.length;j++) {
        		
        	
        	if(prices[i]<=prices[j]) {
        		count++;
        	}
        	
        	
        	}
        	answer[i]=count;
        	count = 0;
        	System.out.println(answer[i]);
        }

		
		
		

	}

}
