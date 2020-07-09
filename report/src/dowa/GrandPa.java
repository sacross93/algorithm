package dowa;

public class GrandPa {
	private int house;
	private int land;
	private int money;
	private boolean debt;
	
	GrandPa(){
		house = 0;
		land = 0;
		money = 0;
		debt=false;
	};
	
	GrandPa(boolean debt){ 
		super();
		this.debt = debt; };
	
	GrandPa(int house,int land,int money){
		this.house = house ;
		this.land = land ;
		this.money = money;
		debt=false;
	};
	
	public void prtMyStat(){
		if (debt==true||money<=-100000000) { System.out.println("ÆÄ»êÇÏ¼Ì½À´Ï´Ù."); }
		else { System.out.println("Áý="+ getHouse() + "\n¶¥=" + getLand() + "\nµ·=" + getMoney() +"\n" ); }
	}
	
	
	
	public void setHouse(int house) {
		this.house=house;
	}
	public int getHouse() {
		return house;
	}

	public void setLand(int land) {
		this.land=land;
	}
	public int getLand() {
		return land;
	}
	
	public void setMoney(int money) {
		this.money=money;
	}
	public int getMoney() {
		return money;
	}
	
	public void setDebt(boolean debt) {
		this.debt=debt;
	}
	public boolean getDebt() {
		return debt;
	}

	


}
