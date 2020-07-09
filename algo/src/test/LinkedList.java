package test;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class LinkedList {
	Node head;
	
	public LinkedList(){ head=null; }
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public void insertFirstNode(String week){
		Node a = new Node();
		a.week = week;
		a.link = head;
		head = a;
	}
	
	public Node searchNode(String week){
		Node temp = new Node();
		temp = head;
		while (temp != null){
			if (temp.week == week){ return temp; }
			else { temp = temp.link; }
		}
		return temp;
	}
	
	public Node deleteNode(Node week){
		Node old = new Node();
		if (head==null){System.out.println("리스트 비어있는데 ㅋㅋ");}
		else {
			old=week.link;
			if (old == null){}
			else { week.link = old.link; }
		}
		return old;
	}
	
	public void prtWeek(){
		Node a = new Node();
		Node temp = new Node();
		temp=head;
		temp.link=head.link;
		a.link=null;
		while (temp != null){
			a=temp;
			System.out.println("temp : "+temp.week);
			System.out.println("a : "+a.week);
			temp=temp.link;
		}
		while (a != null){
		System.out.println(a.week);
		a=a.link;
		}
	}

}
