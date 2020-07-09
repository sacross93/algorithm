package baek;

import java.util.ArrayList;

public class queue {

	private ArrayList<Integer> arrayQueue = new ArrayList<Integer>();
	
	public void enqueue(int data){
		arrayQueue.add(data);
	}
	public int dequeue(){
		if(arrayQueue.size()==0){
			if(arrayQueue.size()==0){
				return 0;
			}
		}
		return arrayQueue.remove(0);
	}
	
}
