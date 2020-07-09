package test;

public class rtest {

	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		Node b = new Node();
		LinkedList c = new LinkedList();
		
		c.insertFirstNode("월");
		c.insertFirstNode("화");

		a.insertFirstNode("월");
		a.insertFirstNode("화");
		a.insertFirstNode("수");
		a.insertFirstNode("목");
		a.insertFirstNode("금");
		a.insertFirstNode("토");
		a.insertFirstNode("일");
		
		a.prtWeek();
		
		//b=a.searchNode("금");
		
		//System.out.println(a.head.week+a.head.link.week+a.head.link.link.week+a.head.link.link.link.week);
		

	}

}
