package report_2017;

public class Professor extends Faculty {
	
	private String lecture; // ��� ����
	
	public Professor(){} //�ؿ� ����Ʈ�� �ƴ� �����ڰ� �־� ����Ʈ �����ڰ� �ڵ����� �������� �ʱ� ������ ����Ʈ �����ڸ� ����
	
	public Professor(String name, int age,String gender, String deanName,String lecture) { // �̸�~�а��� ������� �Է¹޴� ������
		super(name,age,gender,deanName);
		this.lecture = lecture;
	}

	@Override
	public void printData() { // �������̵�
		super.printData();
		System.out.print(lecture);
	}
	
	@Override
	public void printSimple() { // �������̵�
		System.out.println();
		System.out.print(name);
		System.out.print(lecture);
	}
	
	public void setLecture(String lecture) {  // ����޼ҵ�
		this.lecture=lecture;
	}
	
}
