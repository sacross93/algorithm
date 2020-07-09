package linearlist;

public class OperatePoly {

	private int degree_A = 0, degree_B = 0, degree_C = 0, index_A = 0, index_B = 0, index_C = 0;
	private int expo_A, expo_B;

	public Polynomial addPoly(Polynomial A, Polynomial B) {
		degree_A = A.getDegree();
		degree_B = B.getDegree();
		expo_A = degree_A;
		expo_B = degree_B;

		if (degree_A >= degree_B) {
			degree_C = degree_A;
		} else {
			degree_C = degree_B;
		}

		Polynomial C = new Polynomial(degree_C);

		while (index_A <= degree_A && index_B <= degree_B) {

			if (expo_A > expo_B) {
				C.setCoef(index_C++, A.getCoef(index_A++));

				expo_A--;
			} else if (expo_A == expo_B) {
				C.setCoef(index_C++, A.getCoef(index_A++) + B.getCoef(index_B++));
				expo_A--;
				expo_B--;
			} else {
				C.setCoef(index_C++, B.getCoef(index_B++));
				expo_B--;
			}
		}

		return C;
	}

	public Polynomial multiplyPoly(Polynomial A, Polynomial B) {

		degree_A = A.getDegree(); // 다항식 A의 차수 저장
		degree_B = B.getDegree(); // 다항식 B의 차수 저장
		degree_C = degree_A + degree_B; // 다항식의 곱셈이기 때문에 다항식 A , B 의 차수를 더한것으로 C 차수를 결정

		Polynomial C = new Polynomial(degree_C); // C의 차수만큼의 0으로 이루어진 다항식 생성

		for (index_A = 0; index_A <= degree_A; index_A++) { // A의 차수만큼 반복하는 for구문
			for (index_B = 0; index_B <= degree_B; index_B++) { // B의 차수만큼 반복하는 for구문
				C.addCoef(index_A + index_B, A.getCoef(index_A) * B.getCoef(index_B)); // 곱할A의차수,B의차수를 C의차수로 결정
				// index_A의 차수값과 index_B의 차수값을 곱해서 특정 C의차수에 값을 더함
			}
		}
		return C;
	}
}
