package test1;

public class cal {
	public int num=0;
	
	public int add(int num){
		int result=0;
		this.num+=num;
		result = this.num;
		return result;
	}
	public int substract(int num){
		int result=0;
		this.num -= num;
		result = this.num;
		return result;
	}
	public void out(){
		System.out.println(this.num);
	}

}
