package report_2017;

public class University_Drive {

	public static void main(String[] args) {
		Uni_People[] p = new Uni_People[10]; // uni_people 배열 10개 생성 0~9
		
		p[0]=new Uni_People(); // 유니피플 디폴트생성자 불러와서 하나하나 멤버메소드로 값들을 정함
		p[0].setName("김진영");
		p[0].setAge(25);
		p[0].setGender("남자");
		
		p[1]=new Uni_People("유동희",25,"남자"); // 유니피플 생성자로 한번에 이름 나이 성별 값을 받는다
		
		p[2] = new Student("양우현",25,"남자",1.5,"기계공학"); // 스튜던트 생성자로 이름~성별에 grade 와 major 까지 한번에 받는다 

		p[3] = new Student("정태화",25,"남자"); // 이름 나이 성별까지만 받는 스튜던트 생성자
		Student s = (Student)p[3]; // 업캐스팅을 위해서 사용
		s.setGrade(2.75);
		s.setMajor("요리");
	//이후에 p[3].printData() 를 사용하면 s 에 저장된 값들이 나오게 됨
		
		p[4] = new Faculty(); // faculty 디폴트 생성자로 위에 스튜던트와 같이 업캐스팅을 사용하여 faculty 멤버데이터 값 까지 p[4]에 넣습니다
		Faculty f = (Faculty)p[4];
		f.setName("컴퓨터공학과");
		f.setAge(30);
		f.setGender("");
		f.setdeanName("홍삼");
		

		p[5] = new Faculty("통계학과",40,"","박재규"); // 한번에 받아내는 faculty 생성자
		
		p[6] = new Professor(); // professor 디폴트 생성자 업캐스팅으로 받아내고 전부 멤버메소드로 입력받아낸다
		Professor prf = (Professor)p[6];
		prf.setName("홍삼");
		prf.setAge(30);
		prf.setGender("");
		prf.setdeanName("홍삼");
		prf.setLecture("알고리즘");
		
		p[7] = new Professor("박재규",40,"","박재규","응용통계학"); // 한번에 다 받아내는 professor 생성자
		
		p[8] = new Staff(); // staff 디폴트 생성자로 밑에 업캐스팅으로 받아내고 전부 멤버메소드로 입력을 받아낸다
		Staff staff = (Staff)p[8];
		staff.setName("컴퓨터공학과");
		staff.setAge(30);
		staff.setGender("");
		staff.setdeanName("홍삼");
		staff.setPhoneNumber("010-5528-5401");
		
		p[9] = new Faculty("통계학과",40,"","박재규"); // 전부 다 받아내는 faculty 생성자
		
		for(int i = 0; i<p.length; i++){ // 배열 숫자별로 출력하기위한 for구문
			p[i].printData();
		}
		for(int i = 0; i<p.length; i++){ // 배열 숫자별로 이름만 출력하기 위한 for구문
			p[i].printName();
		}
		for(int i = 0; i<p.length; i++){ // 배열 숫자별로 심플하게 몇개만 사용하는 for구문
			p[i].printSimple();
		}

	}

}
