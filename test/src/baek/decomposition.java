package baek;
import java.util.*;

public class decomposition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int num=0;
		int result=0;
		int result2=0;

		for(int i=0; i<N; i++){
			result=i;
			num=i;
			if(i>=10){
				while(num>0){
				result+= num%10;
				num /= 10;
				}
			}
			if(result==N){result2=i; break;}
			else{result2=0;}
		}
		System.out.println(result2);
	}

}
