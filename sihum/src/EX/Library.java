package EX;

import java.io.*;//IOEception�� ���� ���ǹ�

class book {// book Ŭ����
	String name;// �ʵ�
	String person;// �ʵ�
	String made;// �ʵ�

	public book(String a, String b) {// ������ ���� ù ��°
		name = a;
		person = b;
		made = "\t�𸣰ڴ�";

	}

	public book(String a) {// ������ ���� �ι�°
		name = a;
		person = "�𸣰ڴ�\t";
		made = "\t�𸣰ڴ�";

	}

	public book(String a, String b, String c) {// ������ ���� ����°
		name = a;
		person = b;
		made = c;

	}

	public void userprint() {// �����¹�
		System.out.println(name + person + made);
	}
}

class user {// user Ŭ����
	String name;// �ʵ�
	int age;// �ʵ�
	String bloodtype;// �ʵ�
	int height;
	int IQ;

	public user(String a, int b, int c, String d, String e, int f) {// ������ ����
																	// ù��°
		name = a;
		age = f;
		bloodtype = d;
		height = 0;
		IQ = 0;

	}

	public user(String a, String b, String c) {// ������ ���� �ι�°
		name = a;
		age = 0;
		bloodtype = "\t�𸣰ڴ�";
		height = 0;
		IQ = 0;

	}

	public user(String a, int b, String c) {// ������ ���� ������
		name = a;
		age = 0;
		bloodtype = c;
		height = b;
		IQ = 0;

	}

	public void userprint() {// ��� ��º�
		System.out.println(name + age + bloodtype + height + IQ);
	}
}

public class Library {

	public static void main(String[] args) throws IOException {// ��� ����ϱ� ���� ����
																// �ڵ�

		book q = new book("��\t", "��");

		book w = new book("��\t");
		book e = new book("��\t");
		book r = new book("��\t");
		book t = new book("��\t", "��\t", "��");

		q.userprint();
		w.userprint();
		e.userprint();
		r.userprint();
		t.userprint();

		user o = new user("��", 180, "\t");
		o.name = "��";
		o.height = 180;
		o.bloodtype = "\t";
	
	

	
		System.out.printf("������̸��� %s �̰� Ű�� %d �̸� �̰��� %s �̴�", o.name,o.height,o.bloodtype);
		
	}

}