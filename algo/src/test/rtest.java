package test;

public class rtest {

	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		Node b = new Node();
		LinkedList c = new LinkedList();
		
		c.insertFirstNode("��");
		c.insertFirstNode("ȭ");

		a.insertFirstNode("��");
		a.insertFirstNode("ȭ");
		a.insertFirstNode("��");
		a.insertFirstNode("��");
		a.insertFirstNode("��");
		a.insertFirstNode("��");
		a.insertFirstNode("��");
		
		a.prtWeek();
		
		//b=a.searchNode("��");
		
		//System.out.println(a.head.week+a.head.link.week+a.head.link.link.week+a.head.link.link.link.week);
		

	}

}
