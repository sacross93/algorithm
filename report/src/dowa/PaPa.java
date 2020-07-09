package dowa;

public class PaPa extends GrandPa {
	private int car;
	private int building;
	
	    PaPa(){
	    	super();
	    	car=0;
	    	building=0;
	    };

		PaPa(boolean debt){
			super();
			super.setDebt(debt);
			};
			

		
		PaPa(int car,int building){
			super();
			this.car=car;
			this.building=building;
		};
		
		@Override
		public void prtMyStat(){
			if (super.getDebt()==true||super.getMoney()<=-100000000*1.1)
				{System.out.println("ÆÄ»êÇÏ¼Ì½À´Ï´Ù.");}
			else { System.out.println("Áý="+ getHouse() + "\n¶¥=" + getLand() + "\nµ·=" + getMoney() +"\nÂ÷=" + getCar() + "\nºôµù=" + getBuilding() + "\n" ); }
			}
		

		public void setCar(int car) {
			this.car=car;
		}
		public int getCar() {
			return car;
		}
		
		public void setBuilding(int building ) {
			this.building=building;
		}
		public int getBuilding() {
			return building;
		}	
		
	}