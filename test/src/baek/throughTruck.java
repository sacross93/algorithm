package baek;
import java.util.*;

public class throughTruck {

	public static void main(String[] args) {
		int bridge_length=100;
		int weight=100;
		int[] truck_weights= {100,100,100};
		int count=0;
		int currentWeight=0;
		int sum=0;
        int[] through = new int[bridge_length];
        
        Queue<Integer> truck = new LinkedList<Integer>();
        for(int i=0; i<bridge_length; i++){
        	through[i]=0;
        }
        for(int i=0; i<truck_weights.length; i++){
        	truck.add(truck_weights[i]);
        }
        while(true){
        	if(truck.isEmpty()==true){
        		for(int i=0; i<through.length; i++){
        			sum+=through[i];
        		}
        		if(sum==0){break;}
        		else{sum=0;}
        		if(currentWeight==0){
        			break;
        		}
        		else {
        			currentWeight-=through[bridge_length-1];
        			for(int i=bridge_length-1; i>0; i--){
        				through[i]=through[i-1];
        			}
        			through[0]=0;
        			count++;
        			System.out.println("1번");
        		}
        	}
        	else{
        		if ((currentWeight+truck.peek())<=weight){
        			if(through[0]==0){
        				through[0]=truck.poll();
        				currentWeight+=through[0];
        				count++;
        				System.out.println("2번");
        			}
        			else {
        				currentWeight-=through[bridge_length-1];
            			for(int i=bridge_length-1; i>0; i--){
            				through[i]=through[i-1];
            			}
        				through[0]=truck.poll();
        				currentWeight+=through[0];
        				count++;
        				System.out.println("3번");
        			}
        		}
        		else {
        			currentWeight-=through[bridge_length-1];
        			for(int i=bridge_length-1; i>0; i--){
        				through[i]=through[i-1];
        			}
        			through[0]=0;
        			count++;
        			System.out.println("4번");
        			if(through[bridge_length-1]==0){
        				through[0]=truck.poll();
        				currentWeight+=through[0];
        			}
        		}
        	}
        }
        System.out.println(count);

	}

}
