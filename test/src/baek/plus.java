package baek;
import java.util.*;

public class plus {

	public static void main(String[] args) {
		int a = 0; int b = 0;
		
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("ù��° ���� 0���ٴ� Ŀ�� �մϴ�.");
			a = scan.nextInt();
			
			if(a>0){break;}
		}
		while(true){
			System.out.println("�ι�° ���� 10���ٴ� �۾ƾ� �մϴ�.");
			b = scan.nextInt();
			
			if(b<10){break;}
		}
		
		int result = a+b;
		
		System.out.println("����� : "+result);
		
		scan.close();

	}

}
