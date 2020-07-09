package sihum;

public class algo1 {
	protected int a;
	
	protected algo1 (int a){
		this.a=a;
	}
	
	public static void main(String[] args) {
		int result = 0;
		for (int i = 0 ; i < 1000 ; i++ ) {
			if ( i%3 == 0 || i%5 == 0 ) {
				result += i;
			}
		}
		System.out.println(result);

	}

}
