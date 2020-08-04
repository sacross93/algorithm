package baek;
import java.util.*;

public class top {

	public static void main(String[] args) {
		int[] heights= {3,9,9,3,5,7,2};
		Stack<Integer> a = new Stack<Integer>();
		Stack<Integer> c = new Stack<Integer>();
		int specialDay=0;
		int b=0;
		int[] count=new int[heights.length+1];
		for(int i=0; i<heights.length; i++){
			count[i]=0;
		}
		for(int i=heights.length; i>=0 ; i--){
			b=i-1;
			//System.out.print("b값"+b);
			for(int j=0; j<i; j++){
				a.push(heights[j]);
			}
			if(a.isEmpty()==true){break;}
			else{
				specialDay=a.pop();
				}
			//System.out.println("팝될거"+a.peek());
			while(true){
				if(a.isEmpty()==true){break;}
				if(a.pop()>specialDay){
					count[i]=b;
					System.out.println(i+"카운트"+count[i]);
					if(b<=0){
						count[i]=0;
					}
					break;
				}
				else{
					//System.out.println("왜가?"+b);
					b--;
				}
			}
			c.push(count[i]);
		}
		int i=0;
		int[] result= new int[heights.length];
		while(true){
			if(c.isEmpty()==false){
				System.out.println(c.pop());
			}
			else{break;}
		}

	}

}
