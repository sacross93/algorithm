package report_2017;

public class Student extends Uni_People {
	public double grade; //멤버데이터
	private String major;

	
	public Student(String name,int age,String gender){ // 슈퍼를 통한 생성자 
		super(name,age,gender);
	}

	public Student(String name,int age,String gender,double grade,String major){ // 나머지 값도 전부 받는 생성자
		super(name,age,gender);
		this.grade=grade;
		this.major=major;
	}
	
	@Override
	public void printData() { //오버라이딩 major 와 grade 도 출력
		super.printData();
		System.out.print(major);
		System.out.print(grade);
	}
	
	@Override
	public void printSimple() { // 오버라이딩 major 만 출력 
		super.printSimple();
		System.out.print(major);
	}
	public void setMajor(String major){ //멤버메소드
		this.major=major;
	}

	public void setGrade(double grade){ //멤버메소드
		this.grade=grade;
	}


}
