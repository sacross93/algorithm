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

		degree_A = A.getDegree(); // ���׽� A�� ���� ����
		degree_B = B.getDegree(); // ���׽� B�� ���� ����
		degree_C = degree_A + degree_B; // ���׽��� �����̱� ������ ���׽� A , B �� ������ ���Ѱ����� C ������ ����

		Polynomial C = new Polynomial(degree_C); // C�� ������ŭ�� 0���� �̷���� ���׽� ����

		for (index_A = 0; index_A <= degree_A; index_A++) { // A�� ������ŭ �ݺ��ϴ� for����
			for (index_B = 0; index_B <= degree_B; index_B++) { // B�� ������ŭ �ݺ��ϴ� for����
				C.addCoef(index_A + index_B, A.getCoef(index_A) * B.getCoef(index_B)); // ����A������,B�������� C�������� ����
				// index_A�� �������� index_B�� �������� ���ؼ� Ư�� C�������� ���� ����
			}
		}
		return C;
	}
}
