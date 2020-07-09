package baek;
import java.util.*;

public class blackjack {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum[]=new int[2];
		sum[0]=0;
		int N = scan.nextInt();
		int maxNum=scan.nextInt();
		int card[]=new int[N];
		
		for(int i =0; i<card.length; i++){
			card[i]=scan.nextInt();
		}
		
			for(int i=0; i<card.length-2; i++){
				for(int j=i+1; j<card.length-1 ; j++){
					for(int k=j+1; k<card.length ; k++){
						sum[1]=card[i]+card[j]+card[k];
						if(sum[0]==0 && sum[0]<=maxNum && sum[1]<=maxNum){sum[0]=sum[1];}
						else if(sum[1]==maxNum){sum[0]=sum[1]; break;}
						if(sum[1]<maxNum){
							if((maxNum-sum[0])>(maxNum-sum[1])){
								sum[0]=sum[1];
							}
						}
					}
				}
			}
		System.out.println(sum[0]);
		

	}

}
