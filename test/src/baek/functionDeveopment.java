package baek;

import java.util.*;

public class functionDeveopment {

	public static void main(String[] args) {
		int[] progresses=new int[]{93,30,55,20,51,30};
		int[] speeds = new int[]{1,30,5,1,20,10};
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
					System.out.println(middle[i]);
					break;
			}	
			}
		}
		temp=0;
		working=0;
		int count=0;
		for(int i=0; i<middle.length; i++){
			if(a.isEmpty()){
				temp=middle[i];
				a.add(1);
			}
			else{
				if(temp<=middle[i]){
					count=a.poll();
					count++;
					a.add(count);
				}
				else{
					a.add(1);
					temp=middle[i];
				}
			}
		}
		int[] result = new int[a.size()];
		for(int i=0;i<result.length;i++){
			result[i]=a.poll();
			System.out.println(result[i]);
		}

	}


}
