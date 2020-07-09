package baek;
import java.util.*;

public class honeycomb {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Gs=1;
		int count=0;
		int N = scan.nextInt();
		
		while(true){
			if(N==1){count=1;break;}
			if(N>Gs){
				Gs += 6*count;
				count++;
			}
			else{
				break;
			}
		}
		System.out.println(count);
		

	}

}
