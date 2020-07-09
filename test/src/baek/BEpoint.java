package baek;
import java.util.*;

public class BEpoint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a=0; long b = 0; long c=0;
		long bb=0; long cc=0;
		int count=0;
		
		a=scan.nextLong();
		b=scan.nextLong();
		c=scan.nextLong();

		
		while(true){
			if(b>=c){count=-1; break;}
			if (cc>a+bb){break;}
			else { bb+=b; cc+=c; count++;}
			}
			System.out.println(count);

	}

}
