package linearlist;

public class PolyArithmetic {

	public static void main(String[] args) {
		float a[] = new float[] {4,3,5,0};
		float b[] = new float[] {3,1,0,2,1};
		
		Polynomial A = new Polynomial(3,a);
		Polynomial B = new Polynomial(4,b);
		
		OperatePoly optPoly = new OperatePoly();
		Polynomial C = optPoly.addPoly(A,B);
		
		System.out.println("A(x)="); A.printPoly();
		System.out.println("B(x)="); B.printPoly();
		System.out.println("C(x)="); C.printPoly();
		
		Polynomial D = optPoly.multiplyPoly(A,B);
		System.out.println("A(x)="); A.printPoly();
		System.out.println("B(x)="); B.printPoly();
		System.out.println("D(x)="); D.printPoly();
		
	}

}	
