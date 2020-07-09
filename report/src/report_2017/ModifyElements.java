package report_2017;

public class ModifyElements {
	static Uni_People[] p = new Uni_People[10]; // uni_people �迭 10�� ���� 0~9
	static int a[] = new int[5];
	static int pCount = 0;
	static final int UNI_PEOPLE = 0;
	static final int STUDENT = 1;
	static final int FACULTY = 2;
	static final int PROFESSOR = 3;
	static final int STAFF = 4;

	public static void main(String[] args) {
	
		p[0] = new Uni_People(); // �������� ����Ʈ������ �ҷ��ͼ� �ϳ��ϳ� ����޼ҵ�� ������ ����
		pCount++;
		p[0].setName("������");
		p[0].setAge(25);
		p[0].setGender("����");

		p[1] = new Uni_People("������", 25, "����"); // �������� �����ڷ� �ѹ��� �̸� ���� ���� ���� �޴´�
		pCount++;
		
		p[2] = new Student("�����", 25, "����", 1.5, "������"); // ��Ʃ��Ʈ �����ڷ� �̸�~������ grade �� major ���� �ѹ��� �޴´�
		pCount++;
		
		p[3] = new Student("����ȭ", 25, "����"); // �̸� ���� ���������� �޴� ��Ʃ��Ʈ ������
		pCount++;
		Student s = (Student) p[3]; // ��ĳ������ ���ؼ� ���
		s.setGrade(2.75);
		s.setMajor("�丮");
		// ���Ŀ� p[3].printData() �� ����ϸ� s �� ����� ������ ������ ��

		p[4] = new Faculty(); // faculty ����Ʈ �����ڷ� ���� ��Ʃ��Ʈ�� ���� ��ĳ������ ����Ͽ� faculty ��������� �� ���� p[4]�� �ֽ��ϴ�
		pCount++;
		Faculty f = (Faculty) p[4];
		f.setName("��ǻ�Ͱ��а�");
		f.setAge(30);
		f.setGender("");
		f.setdeanName("ȫ��");

		p[5] = new Faculty("����а�", 40, "", "�����"); // �ѹ��� �޾Ƴ��� faculty ������
		pCount++;

		p[6] = new Professor(); // professor ����Ʈ ������ ��ĳ�������� �޾Ƴ��� ���� ����޼ҵ�� �Է¹޾Ƴ���
		pCount++;
		Professor prf = (Professor) p[6];
		prf.setName("ȫ��");
		prf.setAge(30);
		prf.setGender("");
		
		prf.setdeanName("ȫ��");
		prf.setLecture("�˰���");

		p[7] = new Professor("�����", 40, "", "�����", "���������"); // �ѹ��� �� �޾Ƴ��� professor ������
		pCount++;

		p[8] = new Staff(); // staff ����Ʈ �����ڷ� �ؿ� ��ĳ�������� �޾Ƴ��� ���� ����޼ҵ�� �Է��� �޾Ƴ���
		pCount++;
		Staff staff = (Staff) p[8];
		staff.setName("��ǻ�Ͱ��а�");
		staff.setAge(30);
		staff.setGender("");
		staff.setdeanName("ȫ��");
		staff.setPhoneNumber("010-5528-5401");

		p[9] = new Faculty("����а�", 40, "", "�����");
		pCount++;

		printP();
	
		deleteLast(PROFESSOR);
		deleteLast(UNI_PEOPLE);
		
		printP();

		Staff staff2 = new Staff();
		staff2.setName("��ǻ�Ͱ��а�");
		staff2.setAge(30);
		staff2.setGender("");
		staff2.setdeanName("ȫ��");
		staff2.setPhoneNumber("010-5528-5402");

		for ( int i = pCount; i > 5; i-- ) {
			p[i]=p[i-1];
		}
		p[6] = new Staff();
		pCount++;
		p[6] = staff2;
	
		deleteLast(PROFESSOR);
		
		printP();
		
		for ( int i = pCount; i > 6 ; i-- ) {
			p[i]=p[i-1];
		}
		p[7] = new Uni_People("��ƹ���", 25, "����");
		pCount++;
		
		printP();
		
		deleteLast(FACULTY);
		
		for ( int i = pCount; i > 0 ; i-- ) {
			p[i]=p[i-1];
		}
		p[1]=new Student("���л�",15,"����",0.7,"���а�");
		pCount++;
		
		for ( int i = pCount; i > 3 ; i-- ) {
			p[i]=p[i-1];
		}
		p[4]=new Student("���л�",14,"����",0.8,"���а�");
		pCount++;
		
		printP();

	}
	public static void checkTypeCount(){
		for (int i = 0; i < p.length; i++) {
			if (p[i] instanceof Staff == true) {
				a[0] += 1;
			} else if (p[i] instanceof Professor == true) {
				a[1] += 1;
			} else if (p[i] instanceof Faculty == true) {
				a[2] += 1;
			} else if (p[i] instanceof Student == true) {
				a[3] += 1;
			} else if (p[i] instanceof Uni_People == true) {
				a[4] += 1;
			}
		}
		
	}
	public static void clearA(){
		for (int i = 0; i < a.length; i++) {
			a[i] = 0;
		}
	}
	public static void deleteLast(int type){
		switch(type){
			case UNI_PEOPLE:
				for (int i = 0; i < pCount; i++) {
					if (p[i] instanceof Uni_People == true) {
						for (int j = i + 1; j < 10; j++) {
							p[j - 1] = p[j];
						}
						p[--pCount] = null;
						break;
					}
				}
				break;
			case STUDENT:
				for (int i = 0; i < pCount; i++) {
					if (p[i] instanceof Student == true) {
						for (int j = i + 1; j < 10; j++) {
							p[j - 1] = p[j];
						}
						p[--pCount] = null;
						break;
					}
				}
				break;
			case FACULTY:
				for (int i = 0; i < pCount; i++) {
					if (p[i] instanceof Faculty == true) {
						for (int j = i + 1; j < 10; j++) {
							p[j - 1] = p[j];
						}
						p[--pCount] = null;
						break;
					}
				}
				break;
			case PROFESSOR:
				for (int i = 0; i < pCount; i++) {
					if (p[i] instanceof Professor == true) {
						for (int j = i + 1; j < 10; j++) {
							p[j - 1] = p[j];
						}
						p[--pCount] = null;
						break;
					}
				}
				break;
			case STAFF:
				for (int i = 0; i < pCount; i++) {
					if (p[i] instanceof Staff == true) {
						for (int j = i + 1; j < 10; j++) {
							p[j - 1] = p[j];
						}
						p[--pCount] = null;
						break;
					}
				}
				break;	
	
		}
		
	}
	public static void printP(){
		checkTypeCount();
		for (int i = 0; i < pCount; i++) {
			p[i].printData();
		}
		System.out.println();

		System.out.printf("Uni_People���� %d�� Student���� %d�� Facult���� %d�� Professor���� %d�� Staff���� %d �Դϴ�.\n", a[4], a[3],
				a[2], a[1], a[0]);
		clearA();
	}

}
