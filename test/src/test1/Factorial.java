package test1;

public class Factorial {
	
	public static int facto(int num){
		int result=1;
		if(num > 1 ){
			result = facto(num-1) * num ;
			return result;
		}
		else {
			return result;
		}
		
	}

	public static void main(String[] args) {
		int a = 0;
		a = facto(5);
		System.out.println(a);
		int b;
		
	}

}
