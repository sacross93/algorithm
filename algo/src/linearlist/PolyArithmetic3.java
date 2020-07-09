package linearlist;

import java.util.*;

public class PolyArithmetic3 {

	public static void main(String[] args) {
		
		int degree = 0;
		
		System.out.println("다항식 A, B의 최대 지수를 각각 입력하시오.");
		
		Scanner scan = new Scanner(System.in);
		
		degree = scan.nextInt();
		float a[] = new float[degree+1];
		degree = scan.nextInt();
		float b[] = new float[degree+1];
		
		System.out.println("다항식 A의 계수들을 빈 칸으로 구분하여 입력하시오.");
		scan = new Scanner(System.in);
		
		for ( int i = 0; i < a.length; i++){ a[i]= scan.nextInt(); }
		
		System.out.println("다항식 B의 계수들을 빈 칸으로 구분하여 입력하시오.");
		scan = new Scanner(System.in);
		
		for ( int i = 0; i < b.length; i++){ b[i]= scan.nextInt(); }
		
		Polynomial A = new Polynomial(a.length-1,a);
		Polynomial B = new Polynomial(b.length-1,b);
		
		OperatePoly optPoly = new OperatePoly();
		Polynomial C = optPoly.addPoly(A,B);
		
		System.out.println("덧셈은\n");
		
		System.out.println("A(x)="); A.printPoly();
		System.out.println("B(x)="); B.printPoly();
		System.out.println("C(x)="); C.printPoly();
		
		System.out.println("\n곱셈은\n");
		
		Polynomial D = optPoly.multiplyPoly(A,B);
		System.out.println("A(x)="); A.printPoly();
		System.out.println("B(x)="); B.printPoly();
		System.out.println("D(x)="); D.printPoly();
		
		
		
		

	}

}
