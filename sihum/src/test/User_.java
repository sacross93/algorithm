package test;

public class User_ { // 클래스 생성
		String Name;// 이름값 입력
		int Age;// User 나이값 입력
		String Gender;// 성별값 입력
		int Level;// 학년 값 입력
		String Residence;//거주지
		
		public  User_(){
			this("알 수 없음",0,"알 수 없음",0,"알 수 없음");
		}
		
		public User_(String name,int age, String gender, int level, String residence) { // User name 생성자
			this.Name = name;
			this.Age = age;
			this.Gender = gender;
			this.Level = level;
			this.Residence = residence;
		}
		public void setName(String name) { 
			this.Name=name;
		}
		public void setAge(int age) { 
			this.Age=age;
		}
		public void setGender(String gender) { 
			this.Gender=gender;
		}
		public void setLevel(int level) { 
			this.Level=level;
		}
		public void setResidence(String residence) { 
			this.Residence=residence;
		}
		public String getName(){
			return Name;
		}
		public int getAge(){
			return Age;
		}	
		public String getGender(){
			return Gender;
		}	
		public int getLevel(){
			return Level;
		}
		public String getResidence(){
			return Residence;
		}
}
		
		