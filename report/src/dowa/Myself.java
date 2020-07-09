package dowa;

class Myself extends PaPa {
	private int stock;
	
	    Myself(){
	    	super();
	    	stock=0;
	    };
		
		Myself(boolean debt){
			super(debt);
			stock=0;
			};
		
		public void prtMyStat(){
			if (super.getDebt()==true||super.getMoney()<=-100000000*1.2)
				{ System.out.println("파산하셨습니다."); }
		}
		
		
		public void setStock(int stock ) {
			this.stock=stock;
		}
		public int getStock() {
			return stock;
		}
		public void StockUp(int increment) {
			stock += increment;
		}
		public void StockDown(int decrement) {
			stock -= decrement;
		}

		

}
