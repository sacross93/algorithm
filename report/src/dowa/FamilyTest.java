package dowa;

public class FamilyTest {
	public static void main(String[] args) {
		
		GrandPa a = new GrandPa(1,2,3);
		
		a.prtMyStat();
		
		a.setDebt(true);
		
		a.prtMyStat();
		
		PaPa b = new PaPa(3,4);
		
		b.prtMyStat();


	}

}


