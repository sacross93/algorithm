package mazerunner;

public class ListStack implements Stack {
	private ListNode top;
	
	public boolean isEmpty(){ return top == null; }
	public void push(ListNode runner){
		ListNode newNode = new ListNode();
		newNode.x=runner.x;
		newNode.y=runner.y;
		newNode.z=runner.z;
		newNode.go=runner.go;
		top = newNode;
	}
	public ListNode pop(){
		if(isEmpty()) { return null;}
		else { 
			ListNode item = new ListNode();
			item.x = top.x;
			item.y = top.y;
			item.z = top.z;
			item.go = top.go;
		top = top.link;
		return item;
		}
	}
	public void delete(){
		if(isEmpty()){}
		else { top = top.link; }
	}
	public ListNode peek(){
		if(isEmpty()) { return null; }
		else {return top;}
	}
}
