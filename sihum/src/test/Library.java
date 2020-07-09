package test;

public class Library{

	public static void main(String[] args) {//main method 생성
		//title,author,price,year
		Book_ book1 = new Book_();// Boo1 객체 생성
		book1.setTitle("미움 받을 용기");
		book1.setAuthor("기시미 이치로");
		book1.setPrice(18000);
		book1.setYear(1988);
	    book1.setPublisher("한빛");// 출판사 입력
		System.out.printf("N0.1: 책이름 - %s\t 작가 - %s\t 가겨그억 - %d\t 출판년도 - %d\t 출판사 - %s\t\n",book1.getTitle(),book1.getAuthor(),book1.getPrice(),book1.getYear(),book1.getPublisher());
		
		Book_ book2 = new Book_();// Boo1 객체 생성
		book2.setTitle("홍길동");
		book2.setAuthor("허균");
		book2.setPublisher("김영사");
		System.out.printf("N0.1: 책이름 - %s\t 작가 - %s\t 가겨어억 - %s\t 출판년도 - %s\t 출판사 - %s\t\n",book2.getTitle(),book2.getAuthor(),book2.getPrice(),book2.getYear(),book2.getPublisher());
		
		Book_ book3 = new Book_();// Boo1 객체 생성
		book3.setTitle("무소유");
		book3.setAuthor("법정스님");
		book3.setYear(1972);
		System.out.println("N0.3: 책이름 - "+ book3.getTitle()+"\t 작가 - "+book3.getAuthor()+"\t 그아겨억 - "+book3.getPrice()+"\t 출판년도 - "+book3.getYear()+"\t 출판사 - "
		+book3.getPublisher());
		
		Book_ book4 = new Book_();// Boo1 객체 생성
		book4.setTitle("어린왕자");
		book4.setAuthor("생택쥐페리");
		book4.setPrice(10000);
		book4.setYear(1943);
		System.out.println("N0.4: 책이름 - "+ book4.getTitle()+"\t 작가 - "+book4.getAuthor()+"\t 가격 - "+book4.getPrice()+"\t 출판년도 - "+book4.getYear()+"\t 출판사 - "+book4.getPublisher());
		
		Book_ book5 = new Book_();// Boo1 객체 생성
		book5.setTitle("미움 받을 용기");
		book5.setAuthor("기시미 이치로");
		book5.setPrice(18000);
		book5.setYear(1988);
		book5.setPublisher("대교");
		System.out.println("N0.5: 책이름 - "+ book5.getTitle()+"\t 작가 - "+book5.getAuthor()+"\t 가격 - "+book5.getPrice()+"\t 출판년도 - "+book5.getYear()+"\t 출판사 - "+book5.getPublisher());
		
		
		System.out.println("");
		
		User_ user1 = new User_();// User1 객체 생성
		user1.setName("김현진");
		user1.setAge(21);
		user1.setGender("여");
		user1.setLevel(2);
		user1.setResidence("경기");
		System.out.println("N0.1: 이름 - "+ user1.getName()+"\t 나이 - "+user1.getAge()+"\t 성별 - "+user1.getGender()+"\t 학년 - "+user1.getLevel()+"\t 거주지 - "+user1.getResidence());
		
		User_ user2 = new User_();// user2 객체 생성
		user2.setName("최아름");
		user2.setAge(25);
		user2.setGender("여");
		user2.setLevel(4);
		user2.setResidence("서울");
		System.out.println("N0.2: 이름 - "+ user2.getName()+"\t 나이 - "+user2.getAge()+"\t 성별 - "+user2.getGender()+"\t 학년 - "+user2.getLevel()+"\t 거주지 - "+user2.getResidence());

		User_ user3 = new User_();// user3 객체 생성
		user3.setName("김영운");
		user3.setAge(19);
		user3.setGender("남");
		System.out.println("N0.3: 이름 - "+ user3.getName()+"\t 나이 - "+user3.getAge()+"\t 성별 - "+user3.getGender()+"\t 학년 - "+user3.getLevel()+"\t 거주지 - "+user3.getResidence());
		
		User_ user4 = new User_();// user4 객체 생성
		user4.setName("이낭");
		user4.setAge(27);
		user4.setGender("여");
		user4.setLevel(4);
		user4.setResidence("울산");
		System.out.println("N0.4: 이름 - "+ user4.getName()+"\t 나이 - "+user4.getAge()+"\t 성별 - "+user4.getGender()+"\t 학년 - "+user4.getLevel()+"\t 거주지 - "+user4.getResidence());
		
		User_ user5 = new User_();// user5 객체 생성
		user5.setName("한마음");
		user5.setAge(24);
		user5.setGender("남");
		user5.setLevel(2);
		user5.setResidence("통영");
		System.out.println("N0.5: 이름 - "+ user5.getName()+"\t 나이 - "+user5.getAge()+"\t 성별 - "+user5.getGender()+"\t 학년 - "+user5.getLevel()+"\t 거주지 - "+user5.getResidence());

	
	}	

}