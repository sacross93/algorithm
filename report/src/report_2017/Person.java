package report_2017;

public abstract class Person {
	
	protected int age; //멤버변수
	protected String gender; //멤버변수 자신을 포함한 상속 클래스에서만 접근하기위해 protected 사용
	
	public Person( ) {} // 디폴트 생성자 자식 클래스가 사용해야되기때문에
	
	public Person(int age , String gender){ // person 생성자
		this.age=age;
		this.gender=gender;
	}
	
	public abstract void printData(); //필요한 데이터들을 출력하기 위한 추상메소드
	
	public abstract void printName(); //특정 name 만을 출력하기 위한 추상메소드
	
	public void setAge(int age){ //멤버변수 age를 받기위한 멤버 메소드
		this.age=age;
	}
	public void setGender(String gender){ //맴버변수 gender를 받기위한 멤버 메소드
		this.gender=gender;
	}


}
