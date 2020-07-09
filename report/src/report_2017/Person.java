package report_2017;

public abstract class Person {
	
	protected int age; //�������
	protected String gender; //������� �ڽ��� ������ ��� Ŭ���������� �����ϱ����� protected ���
	
	public Person( ) {} // ����Ʈ ������ �ڽ� Ŭ������ ����ؾߵǱ⶧����
	
	public Person(int age , String gender){ // person ������
		this.age=age;
		this.gender=gender;
	}
	
	public abstract void printData(); //�ʿ��� �����͵��� ����ϱ� ���� �߻�޼ҵ�
	
	public abstract void printName(); //Ư�� name ���� ����ϱ� ���� �߻�޼ҵ�
	
	public void setAge(int age){ //������� age�� �ޱ����� ��� �޼ҵ�
		this.age=age;
	}
	public void setGender(String gender){ //�ɹ����� gender�� �ޱ����� ��� �޼ҵ�
		this.gender=gender;
	}


}
