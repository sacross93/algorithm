package test;

public class Library{

	public static void main(String[] args) {//main method ����
		//title,author,price,year
		Book_ book1 = new Book_();// Boo1 ��ü ����
		book1.setTitle("�̿� ���� ���");
		book1.setAuthor("��ù� ��ġ��");
		book1.setPrice(18000);
		book1.setYear(1988);
	    book1.setPublisher("�Ѻ�");// ���ǻ� �Է�
		System.out.printf("N0.1: å�̸� - %s\t �۰� - %s\t ���ܱ׾� - %d\t ���ǳ⵵ - %d\t ���ǻ� - %s\t\n",book1.getTitle(),book1.getAuthor(),book1.getPrice(),book1.getYear(),book1.getPublisher());
		
		Book_ book2 = new Book_();// Boo1 ��ü ����
		book2.setTitle("ȫ�浿");
		book2.setAuthor("���");
		book2.setPublisher("�迵��");
		System.out.printf("N0.1: å�̸� - %s\t �۰� - %s\t ���ܾ�� - %s\t ���ǳ⵵ - %s\t ���ǻ� - %s\t\n",book2.getTitle(),book2.getAuthor(),book2.getPrice(),book2.getYear(),book2.getPublisher());
		
		Book_ book3 = new Book_();// Boo1 ��ü ����
		book3.setTitle("������");
		book3.setAuthor("��������");
		book3.setYear(1972);
		System.out.println("N0.3: å�̸� - "+ book3.getTitle()+"\t �۰� - "+book3.getAuthor()+"\t �׾ưܾ� - "+book3.getPrice()+"\t ���ǳ⵵ - "+book3.getYear()+"\t ���ǻ� - "
		+book3.getPublisher());
		
		Book_ book4 = new Book_();// Boo1 ��ü ����
		book4.setTitle("�����");
		book4.setAuthor("�������丮");
		book4.setPrice(10000);
		book4.setYear(1943);
		System.out.println("N0.4: å�̸� - "+ book4.getTitle()+"\t �۰� - "+book4.getAuthor()+"\t ���� - "+book4.getPrice()+"\t ���ǳ⵵ - "+book4.getYear()+"\t ���ǻ� - "+book4.getPublisher());
		
		Book_ book5 = new Book_();// Boo1 ��ü ����
		book5.setTitle("�̿� ���� ���");
		book5.setAuthor("��ù� ��ġ��");
		book5.setPrice(18000);
		book5.setYear(1988);
		book5.setPublisher("�뱳");
		System.out.println("N0.5: å�̸� - "+ book5.getTitle()+"\t �۰� - "+book5.getAuthor()+"\t ���� - "+book5.getPrice()+"\t ���ǳ⵵ - "+book5.getYear()+"\t ���ǻ� - "+book5.getPublisher());
		
		
		System.out.println("");
		
		User_ user1 = new User_();// User1 ��ü ����
		user1.setName("������");
		user1.setAge(21);
		user1.setGender("��");
		user1.setLevel(2);
		user1.setResidence("���");
		System.out.println("N0.1: �̸� - "+ user1.getName()+"\t ���� - "+user1.getAge()+"\t ���� - "+user1.getGender()+"\t �г� - "+user1.getLevel()+"\t ������ - "+user1.getResidence());
		
		User_ user2 = new User_();// user2 ��ü ����
		user2.setName("�־Ƹ�");
		user2.setAge(25);
		user2.setGender("��");
		user2.setLevel(4);
		user2.setResidence("����");
		System.out.println("N0.2: �̸� - "+ user2.getName()+"\t ���� - "+user2.getAge()+"\t ���� - "+user2.getGender()+"\t �г� - "+user2.getLevel()+"\t ������ - "+user2.getResidence());

		User_ user3 = new User_();// user3 ��ü ����
		user3.setName("�迵��");
		user3.setAge(19);
		user3.setGender("��");
		System.out.println("N0.3: �̸� - "+ user3.getName()+"\t ���� - "+user3.getAge()+"\t ���� - "+user3.getGender()+"\t �г� - "+user3.getLevel()+"\t ������ - "+user3.getResidence());
		
		User_ user4 = new User_();// user4 ��ü ����
		user4.setName("�̳�");
		user4.setAge(27);
		user4.setGender("��");
		user4.setLevel(4);
		user4.setResidence("���");
		System.out.println("N0.4: �̸� - "+ user4.getName()+"\t ���� - "+user4.getAge()+"\t ���� - "+user4.getGender()+"\t �г� - "+user4.getLevel()+"\t ������ - "+user4.getResidence());
		
		User_ user5 = new User_();// user5 ��ü ����
		user5.setName("�Ѹ���");
		user5.setAge(24);
		user5.setGender("��");
		user5.setLevel(2);
		user5.setResidence("�뿵");
		System.out.println("N0.5: �̸� - "+ user5.getName()+"\t ���� - "+user5.getAge()+"\t ���� - "+user5.getGender()+"\t �г� - "+user5.getLevel()+"\t ������ - "+user5.getResidence());

	
	}	

}