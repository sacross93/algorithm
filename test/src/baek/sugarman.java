package baek;
import java.util.*;

public class sugarman {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int a=0; int b=0;
		
		while(N%5!=0&&N>=0){
			N-=3;
			a++;
		}
		if(N<0){
			System.out.println(-1);
		}
		else{
			b=N/5;
			System.out.println(a+b);
		}

		

	}

}
