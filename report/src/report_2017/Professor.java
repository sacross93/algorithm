package report_2017;

public class Professor extends Faculty {
	
	private String lecture; // 멤버 변수
	
	public Professor(){} //밑에 디폴트가 아닌 생성자가 있어 디폴트 생성자가 자동으로 생성되지 않기 때문에 디폴트 생성자를 생성
	
	public Professor(String name, int age,String gender, String deanName,String lecture) { // 이름~학과장 과목까지 입력받는 생성자
		super(name,age,gender,deanName);
		this.lecture = lecture;
	}

	@Override
	public void printData() { // 오버라이딩
		super.printData();
		System.out.print(lecture);
	}
	
	@Override
	public void printSimple() { // 오버라이딩
		System.out.println();
		System.out.print(name);
		System.out.print(lecture);
	}
	
	public void setLecture(String lecture) {  // 멤버메소드
		this.lecture=lecture;
	}
	
}
