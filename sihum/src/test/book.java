package test;

class Book_ { // Book_ 클래스 생성
	private String Title;//책 제목 입력
	private String Author;// 작가 입력
	private int Price;//가격 값 입력
	private int Year;//출판년도 입력
    private String Publisher;// 출판사 입력
	
	public  Book_(){
		this("알 수 없음","알 수 없음",0,0000,"알 수 없음");
	}
	public Book_(String title, String author, int price, int year,String publisher){
		this.Title = title;
		this.Author = author;
		this.Price = price;
		this.Year = year;
		this.Publisher = publisher;
	}
	
	public void setTitle(String title) { 
		Title=title;
	}
	public void setAuthor(String author) {
		Author=author;
	}
	public void setPrice(int price) {
		Price=price;
	}
	public void setYear(int year) { 
		Year=year;
	}
	public void setPublisher(String publisher) { 
		Publisher=publisher;
	}
	public String getTitle(){
		return(Title);
	}
	public String getAuthor(){
		return(Author);
	}
	public int getPrice(){
		return(Price);
	}
	public int getYear(){
		return(Year);
	}
	public String getPublisher(){
		return(Publisher);
	}
	
	public String pprint (String a,String b,int c,int d , String e){
		String result="";
		Title = a;
		Author = b;
		Price = c;
		Year = d;
		Publisher = e;
		result = "책이름 - "+a+"\t작가 - "+b+"\t가격 - "+c+"\t ";
		return result;
		
	}
}