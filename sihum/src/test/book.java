package test;

class Book_ { // Book_ Ŭ���� ����
	private String Title;//å ���� �Է�
	private String Author;// �۰� �Է�
	private int Price;//���� �� �Է�
	private int Year;//���ǳ⵵ �Է�
    private String Publisher;// ���ǻ� �Է�
	
	public  Book_(){
		this("�� �� ����","�� �� ����",0,0000,"�� �� ����");
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
		result = "å�̸� - "+a+"\t�۰� - "+b+"\t���� - "+c+"\t ";
		return result;
		
	}
}