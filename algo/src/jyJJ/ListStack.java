package jyJJ;

public class ListStack implements Stack {
	private ListNode top;
	
	public boolean isEmpty(){ return top == null; }
	public void push(char item){
		ListNode newNode = new ListNode();
		newNode.item = item;
		newNode.link = top;
		top = newNode;
	}
	public char pop(){
		if(isEmpty()) { return 0;}
		else { char item = top.item;
		top = top.link;
		return item;
		}
	}
	public void delete(){
		if(isEmpty()){}
		else { top = top.link; }
	}
	public char peek(){
		if(isEmpty()) { return 0; }
		else {return top.item;}
	}
}
