package report_2017;

public class Staff extends Faculty {
	
	public String phoneNumber = "NULL";

	@Override
	public void printData() { //�������̵�  ���ѹ��� ���
		super.printData();
		System.out.print(phoneNumber);
	}
	
	
	
	public void setPhoneNumber(String phoneNumber){ // ���ѹ��� �޾ƿ��� ����޼ҵ� 
		this.phoneNumber=phoneNumber;
	}

}
