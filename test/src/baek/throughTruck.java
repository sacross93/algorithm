package baek;
import java.util.*;

public class throughTruck {

	public static void main(String[] args) {
		queue queue = new queue();
		int bridge_length=2;
		int weight=10;
		int[] truck_weights= {7,4,5,6};
		int count=0;
        int[] through = new int[bridge_length];
        for(int i=0; i<truck_weights.length; i++){
        	queue.enqueue(truck_weights[i]);
        }
        int j=0;

        while(true){
            count++;
            if(through[j]==0){
                through[j]=queue.dequeue();
                j++;
            }
            else {
            	if(weight>=(through[j-1]+through[j])){
            		
            	}
            }
            
        }

	}

}
