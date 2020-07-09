package baek;
import java.util.*;

public class plus {

	public static void main(String[] args) {
		int a = 0; int b = 0;
		
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("첫번째 값은 0보다는 커야 합니다.");
			a = scan.nextInt();
			
			if(a>0){break;}
		}
		while(true){
			System.out.println("두번째 값은 10보다는 작아야 합니다.");
			b = scan.nextInt();
			
			if(b<10){break;}
		}
		
		int result = a+b;
		
		System.out.println("결과는 : "+result);
		
		scan.close();

	}

}
