package report_2017;

public class University_Drive {

	public static void main(String[] args) {
		Uni_People[] p = new Uni_People[10]; // uni_people �迭 10�� ���� 0~9
		
		p[0]=new Uni_People(); // �������� ����Ʈ������ �ҷ��ͼ� �ϳ��ϳ� ����޼ҵ�� ������ ����
		p[0].setName("������");
		p[0].setAge(25);
		p[0].setGender("����");
		
		p[1]=new Uni_People("������",25,"����"); // �������� �����ڷ� �ѹ��� �̸� ���� ���� ���� �޴´�
		
		p[2] = new Student("�����",25,"����",1.5,"������"); // ��Ʃ��Ʈ �����ڷ� �̸�~������ grade �� major ���� �ѹ��� �޴´� 

		p[3] = new Student("����ȭ",25,"����"); // �̸� ���� ���������� �޴� ��Ʃ��Ʈ ������
		Student s = (Student)p[3]; // ��ĳ������ ���ؼ� ���
		s.setGrade(2.75);
		s.setMajor("�丮");
	//���Ŀ� p[3].printData() �� ����ϸ� s �� ����� ������ ������ ��
		
		p[4] = new Faculty(); // faculty ����Ʈ �����ڷ� ���� ��Ʃ��Ʈ�� ���� ��ĳ������ ����Ͽ� faculty ��������� �� ���� p[4]�� �ֽ��ϴ�
		Faculty f = (Faculty)p[4];
		f.setName("��ǻ�Ͱ��а�");
		f.setAge(30);
		f.setGender("");
		f.setdeanName("ȫ��");
		

		p[5] = new Faculty("����а�",40,"","�����"); // �ѹ��� �޾Ƴ��� faculty ������
		
		p[6] = new Professor(); // professor ����Ʈ ������ ��ĳ�������� �޾Ƴ��� ���� ����޼ҵ�� �Է¹޾Ƴ���
		Professor prf = (Professor)p[6];
		prf.setName("ȫ��");
		prf.setAge(30);
		prf.setGender("");
		prf.setdeanName("ȫ��");
		prf.setLecture("�˰���");
		
		p[7] = new Professor("�����",40,"","�����","���������"); // �ѹ��� �� �޾Ƴ��� professor ������
		
		p[8] = new Staff(); // staff ����Ʈ �����ڷ� �ؿ� ��ĳ�������� �޾Ƴ��� ���� ����޼ҵ�� �Է��� �޾Ƴ���
		Staff staff = (Staff)p[8];
		staff.setName("��ǻ�Ͱ��а�");
		staff.setAge(30);
		staff.setGender("");
		staff.setdeanName("ȫ��");
		staff.setPhoneNumber("010-5528-5401");
		
		p[9] = new Faculty("����а�",40,"","�����"); // ���� �� �޾Ƴ��� faculty ������
		
		for(int i = 0; i<p.length; i++){ // �迭 ���ں��� ����ϱ����� for����
			p[i].printData();
		}
		for(int i = 0; i<p.length; i++){ // �迭 ���ں��� �̸��� ����ϱ� ���� for����
			p[i].printName();
		}
		for(int i = 0; i<p.length; i++){ // �迭 ���ں��� �����ϰ� ��� ����ϴ� for����
			p[i].printSimple();
		}

	}

}
