package report_2017;

public class Uni_People extends Person {
	
	public String name; //멤버변수
	
	public Uni_People(){} //밑에 디폴트가 아닌 생성자가 있어 디폴트 생성자가 자동으로 생성되지 않기 때문에 디폴트 생성자를 생성
	
	public Uni_People(String name,int age,String gender){ //이름과나이와성별을 받는 생성자
		super(age,gender);
		this.name=name;

	}
	
	public void printData(){ // 추상메소드 구현 (이름 나이 성별을 출력)
		System.out.println();
		System.out.print(name);
		System.out.print(age);
		System.out.print(gender);
	}
	public void printName(){ // 추상메소드 구현 (이름만을 출력)
		System.out.println();
		System.out.print(name);
	}
	
	public void printSimple(){ // 자신만의 메소드 (자신의 멤버 변수를 출력)
		System.out.println();
		System.out.print(name);
	}
	
	public void setName(String name){ // 이름을 받기위한 멤버 메소드
		this.name=name;
	}

}
