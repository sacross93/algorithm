package test;

public class User_ { // Ŭ���� ����
		String Name;// �̸��� �Է�
		int Age;// User ���̰� �Է�
		String Gender;// ������ �Է�
		int Level;// �г� �� �Է�
		String Residence;//������
		
		public  User_(){
			this("�� �� ����",0,"�� �� ����",0,"�� �� ����");
		}
		
		public User_(String name,int age, String gender, int level, String residence) { // User name ������
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
		
		