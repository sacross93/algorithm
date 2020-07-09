package report_2017;

public class Faculty extends Uni_People {

	public String deanName; // 멤버 변수
	
	public Faculty(){} //밑에 디폴트가 아닌 생성자가 있어 디폴트 생성자가 자동으로 생성되지 않기 때문에 디폴트 생성자를 생성

	public Faculty(String name, int age,String gender,String deanName){ // 이름~성별에 학과장의 이름까지 입력받는 생성자 
		super(name,age,gender);
		this.deanName = deanName;
	}

	@Override //오버라이딩을 위한 필드 메소드를 정의할 때 오타방지 구별용 
	public void printData() { // Uni_People에서 완성된 메소드를 오버라이딩 
		System.out.println();
		System.out.print(name);
		System.out.print(age);
		System.out.print(deanName);
	}
	
	@Override
	public void printSimple() { // Uni_People에서 완성된 메소드를 오버라이딩 
		super.printSimple();
		System.out.print(deanName);
	}
	
	public void setdeanName(String deanName){ // 학과장 이름을 받기위한 멤버 메소드
		this.deanName=deanName;
	}

}