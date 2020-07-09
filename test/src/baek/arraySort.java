package baek;
import java.util.*;

public class arraySort {

	public static void main(String[] args) {
		int[] numbers = {3,30,34,5,9};
        String answer = "";
        int[] b= new int[4];
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0; i<numbers.length; i++){
            while(true){
                a.add(numbers[i]%10);
                if(numbers[i]>=10){
                    numbers[i]/=10;
                }
                else{break;}
            }
        }
        Collections.sort(a);
        Collections.reverse(a);
        for(int i=0; i<a.size(); i++){
            answer+=Integer.toString(a.get(i));
        }

        System.out.println(answer);
	}

}
