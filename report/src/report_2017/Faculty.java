package report_2017;

public class Faculty extends Uni_People {

	public String deanName; // ��� ����
	
	public Faculty(){} //�ؿ� ����Ʈ�� �ƴ� �����ڰ� �־� ����Ʈ �����ڰ� �ڵ����� �������� �ʱ� ������ ����Ʈ �����ڸ� ����

	public Faculty(String name, int age,String gender,String deanName){ // �̸�~������ �а����� �̸����� �Է¹޴� ������ 
		super(name,age,gender);
		this.deanName = deanName;
	}

	@Override //�������̵��� ���� �ʵ� �޼ҵ带 ������ �� ��Ÿ���� ������ 
	public void printData() { // Uni_People���� �ϼ��� �޼ҵ带 �������̵� 
		System.out.println();
		System.out.print(name);
		System.out.print(age);
		System.out.print(deanName);
	}
	
	@Override
	public void printSimple() { // Uni_People���� �ϼ��� �޼ҵ带 �������̵� 
		super.printSimple();
		System.out.print(deanName);
	}
	
	public void setdeanName(String deanName){ // �а��� �̸��� �ޱ����� ��� �޼ҵ�
		this.deanName=deanName;
	}

}