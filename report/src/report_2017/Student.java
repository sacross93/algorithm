package report_2017;

public class Student extends Uni_People {
	public double grade; //���������
	private String major;

	
	public Student(String name,int age,String gender){ // ���۸� ���� ������ 
		super(name,age,gender);
	}

	public Student(String name,int age,String gender,double grade,String major){ // ������ ���� ���� �޴� ������
		super(name,age,gender);
		this.grade=grade;
		this.major=major;
	}
	
	@Override
	public void printData() { //�������̵� major �� grade �� ���
		super.printData();
		System.out.print(major);
		System.out.print(grade);
	}
	
	@Override
	public void printSimple() { // �������̵� major �� ��� 
		super.printSimple();
		System.out.print(major);
	}
	public void setMajor(String major){ //����޼ҵ�
		this.major=major;
	}

	public void setGrade(double grade){ //����޼ҵ�
		this.grade=grade;
	}


}
