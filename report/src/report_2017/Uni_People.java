package report_2017;

public class Uni_People extends Person {
	
	public String name; //�������
	
	public Uni_People(){} //�ؿ� ����Ʈ�� �ƴ� �����ڰ� �־� ����Ʈ �����ڰ� �ڵ����� �������� �ʱ� ������ ����Ʈ �����ڸ� ����
	
	public Uni_People(String name,int age,String gender){ //�̸������̿ͼ����� �޴� ������
		super(age,gender);
		this.name=name;

	}
	
	public void printData(){ // �߻�޼ҵ� ���� (�̸� ���� ������ ���)
		System.out.println();
		System.out.print(name);
		System.out.print(age);
		System.out.print(gender);
	}
	public void printName(){ // �߻�޼ҵ� ���� (�̸����� ���)
		System.out.println();
		System.out.print(name);
	}
	
	public void printSimple(){ // �ڽŸ��� �޼ҵ� (�ڽ��� ��� ������ ���)
		System.out.println();
		System.out.print(name);
	}
	
	public void setName(String name){ // �̸��� �ޱ����� ��� �޼ҵ�
		this.name=name;
	}

}
