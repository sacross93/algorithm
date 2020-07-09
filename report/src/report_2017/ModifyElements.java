package report_2017;

public class ModifyElements {
	static Uni_People[] p = new Uni_People[10]; // uni_people 배열 10개 생성 0~9
	static int a[] = new int[5];
	static int pCount = 0;
	static final int UNI_PEOPLE = 0;
	static final int STUDENT = 1;
	static final int FACULTY = 2;
	static final int PROFESSOR = 3;
	static final int STAFF = 4;

	public static void main(String[] args) {
	
		p[0] = new Uni_People(); // 유니피플 디폴트생성자 불러와서 하나하나 멤버메소드로 값들을 정함
		pCount++;
		p[0].setName("김진영");
		p[0].setAge(25);
		p[0].setGender("남자");

		p[1] = new Uni_People("유동희", 25, "남자"); // 유니피플 생성자로 한번에 이름 나이 성별 값을 받는다
		pCount++;
		
		p[2] = new Student("양우현", 25, "남자", 1.5, "기계공학"); // 스튜던트 생성자로 이름~성별에 grade 와 major 까지 한번에 받는다
		pCount++;
		
		p[3] = new Student("정태화", 25, "남자"); // 이름 나이 성별까지만 받는 스튜던트 생성자
		pCount++;
		Student s = (Student) p[3]; // 업캐스팅을 위해서 사용
		s.setGrade(2.75);
		s.setMajor("요리");
		// 이후에 p[3].printData() 를 사용하면 s 에 저장된 값들이 나오게 됨

		p[4] = new Faculty(); // faculty 디폴트 생성자로 위에 스튜던트와 같이 업캐스팅을 사용하여 faculty 멤버데이터 값 까지 p[4]에 넣습니다
		pCount++;
		Faculty f = (Faculty) p[4];
		f.setName("컴퓨터공학과");
		f.setAge(30);
		f.setGender("");
		f.setdeanName("홍삼");

		p[5] = new Faculty("통계학과", 40, "", "박재규"); // 한번에 받아내는 faculty 생성자
		pCount++;

		p[6] = new Professor(); // professor 디폴트 생성자 업캐스팅으로 받아내고 전부 멤버메소드로 입력받아낸다
		pCount++;
		Professor prf = (Professor) p[6];
		prf.setName("홍삼");
		prf.setAge(30);
		prf.setGender("");
		
		prf.setdeanName("홍삼");
		prf.setLecture("알고리즘");

		p[7] = new Professor("박재규", 40, "", "박재규", "응용통계학"); // 한번에 다 받아내는 professor 생성자
		pCount++;

		p[8] = new Staff(); // staff 디폴트 생성자로 밑에 업캐스팅으로 받아내고 전부 멤버메소드로 입력을 받아낸다
		pCount++;
		Staff staff = (Staff) p[8];
		staff.setName("컴퓨터공학과");
		staff.setAge(30);
		staff.setGender("");
		staff.setdeanName("홍삼");
		staff.setPhoneNumber("010-5528-5401");

		p[9] = new Faculty("통계학과", 40, "", "김재규");
		pCount++;

		printP();
	
		deleteLast(PROFESSOR);
		deleteLast(UNI_PEOPLE);
		
		printP();

		Staff staff2 = new Staff();
		staff2.setName("컴퓨터공학과");
		staff2.setAge(30);
		staff2.setGender("");
		staff2.setdeanName("홍삼");
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
		p[7] = new Uni_People("김아무개", 25, "남자");
		pCount++;
		
		printP();
		
		deleteLast(FACULTY);
		
		for ( int i = pCount; i > 0 ; i-- ) {
			p[i]=p[i-1];
		}
		p[1]=new Student("김학생",15,"남자",0.7,"신학과");
		pCount++;
		
		for ( int i = pCount; i > 3 ; i-- ) {
			p[i]=p[i-1];
		}
		p[4]=new Student("유학생",14,"여자",0.8,"신학과");
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

		System.out.printf("Uni_People형은 %d개 Student형은 %d개 Facult형은 %d개 Professor형응 %d개 Staff형은 %d 입니다.\n", a[4], a[3],
				a[2], a[1], a[0]);
		clearA();
	}

}
