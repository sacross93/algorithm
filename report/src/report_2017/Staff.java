package report_2017;

public class Staff extends Faculty {
	
	public String phoneNumber = "NULL";

	@Override
	public void printData() { //오버라이딩  폰넘버만 출력
		super.printData();
		System.out.print(phoneNumber);
	}
	
	
	
	public void setPhoneNumber(String phoneNumber){ // 폰넘버를 받아오는 멤버메소드 
		this.phoneNumber=phoneNumber;
	}

}
