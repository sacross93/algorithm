package baek;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class realFunctionDeveopment {

	public static void main(String[] args) {
		int[] progresses=new int[]{93,30,55};
		int[] speeds = new int[]{1,30,5};
		int[] middle = new int[progresses.length];
		Queue<Integer> a = new LinkedList<Integer>();
		Stack<Integer> b = new Stack<>();
		int temp=0;
		int working=0;
		for(int i=0; i<progresses.length; i++){
			temp=1;
			working=speeds[i];
			while(true){
				temp++;
				working +=speeds[i];
				if(progresses[i]+working>=100){
					middle[i]=temp;
					break;
			}	
			}
		}
		temp=0;
		for(int i=0; i<middle.length; i++){
			if(middle[i]!=101){
				temp++;
				for(int j=i+1; j<middle.length; j++){
					if(middle[i]>=middle[j]){
						temp++;
						middle[j]=101;
					}
				}
			}
			if(temp!=0){a.add(temp);}
			temp=0;
		}

		int[] answer = new int[a.size()];
		for(int i=0; i<answer.length; i++){
			answer[i]=a.poll();
			System.out.println(answer[i]);
		}

	}

}
