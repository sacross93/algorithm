package mazerunner;

public class asd {

	public static void main(String[] args) {
		ListNode a= new ListNode();
		a.x=1;a.y=1;a.z=1;a.go=1;
		ListNode b= new ListNode();
		b.x=2;b.y=1;b.z=1;b.go=1;
		ListNode c= new ListNode();
		c.x=3;c.y=1;c.z=1;c.go=1;
		ListStack aa = new ListStack();
		aa.push(a);
		aa.push(a);
		aa.push(a);
		
		ListNode d= new ListNode();
		d=aa.pop();
		System.out.println(d.x+"x");
		d=aa.pop();
		System.out.println(d.x+"x");
		d=aa.pop();
		System.out.println(d.x+"x");
		d=aa.pop();
		System.out.println(d.x+"x");
		
		d=aa.pop();
		System.out.println(d.x+"x");
		
		d=aa.pop();
		System.out.println(d.x+"x");
		
		
		

	}

}
