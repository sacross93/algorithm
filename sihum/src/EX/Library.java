package EX;

import java.io.*;//IOEception을 위한 조건문

class book {// book 클래스
	String name;// 필드
	String person;// 필드
	String made;// 필드

	public book(String a, String b) {// 생성자 종류 첫 번째
		name = a;
		person = b;
		made = "\t모르겠다";

	}

	public book(String a) {// 생성자 종류 두번째
		name = a;
		person = "모르겠다\t";
		made = "\t모르겠다";

	}

	public book(String a, String b, String c) {// 생성자 종류 세번째
		name = a;
		person = b;
		made = c;

	}

	public void userprint() {// 결과출력문
		System.out.println(name + person + made);
	}
}

class user {// user 클래스
	String name;// 필드
	int age;// 필드
	String bloodtype;// 필드
	int height;
	int IQ;

	public user(String a, int b, int c, String d, String e, int f) {// 생성자 종류
																	// 첫번째
		name = a;
		age = f;
		bloodtype = d;
		height = 0;
		IQ = 0;

	}

	public user(String a, String b, String c) {// 생성자 종류 두번째
		name = a;
		age = 0;
		bloodtype = "\t모르겠다";
		height = 0;
		IQ = 0;

	}

	public user(String a, int b, String c) {// 생성자 종류 세번쨰
		name = a;
		age = 0;
		bloodtype = c;
		height = b;
		IQ = 0;

	}

	public void userprint() {// 결과 출력분
		System.out.println(name + age + bloodtype + height + IQ);
	}
}

public class Library {

	public static void main(String[] args) throws IOException {// 결과 출력하기 위한 메인
																// 코드

		book q = new book("ㅇ\t", "ㅇ");

		book w = new book("ㅇ\t");
		book e = new book("ㅇ\t");
		book r = new book("ㅇ\t");
		book t = new book("ㅇ\t", "ㅇ\t", "ㅇ");

		q.userprint();
		w.userprint();
		e.userprint();
		r.userprint();
		t.userprint();

		user o = new user("ㅇ", 180, "\t");
		o.name = "ㅇ";
		o.height = 180;
		o.bloodtype = "\t";
	
	

	
		System.out.printf("사용자이름은 %s 이고 키는 %d 이며 이것은 %s 이다", o.name,o.height,o.bloodtype);
		
	}

}