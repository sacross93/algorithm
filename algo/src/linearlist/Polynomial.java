package linearlist;

public class Polynomial {

	private int degree;
	private float coef[] = new float[20];

	public Polynomial(int degree) {
		this.degree = degree;
		for (int i = 0; i <= degree; i++) {
			this.coef[i] = 0;
		}
	}

	public Polynomial(int degree, float[] coef) {
		this.degree = degree;
		this.coef = coef;
	}

	public float getCoef(int i) {
		return this.coef[i];
	}

	public float setCoef(int i, float coef) {
		return this.coef[i] = coef;
	}

	public float addCoef(int i, float coef) { // 곱셈식에서 특정 항끼리 더해야 하기때문에 만든 셋메소드
		return this.coef[i] += coef;
	}

	public int getDegree() {
		return this.degree;
	}

	public void printPoly() {
		int temp = this.degree;
		for (int i = 0; i <= this.degree; i++) {
			System.out.printf("%3.0fx^%d", this.coef[i], temp--);
		}
		System.out.println();
	}

}
