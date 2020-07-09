package baek;
import java.util.*;

public class rank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int H[][]=new int[N][2];
		int rank[]=new int[N];
		int result[]=new int[N];
		
		for(int i=0; i<N; i++){
			H[i][0]=scan.nextInt();
			H[i][1]=scan.nextInt();
			rank[i]=0;
			result[i]=1;
		}
		for(int i=0; i<N-1; i++){
			for(int j=0; j<N; j++){
				if(H[i][0]>H[j][0]&&H[i][1]>H[j][1]){
					rank[i]+=1;
				}
				else if(H[i][0]<H[j][0]&&H[i][1]<H[j][1]){
					rank[j]+=1;
				}
			}
		}
		for(int i=0; i<N-1; i++){
			for(int j=i; j<N; j++){
				if (rank[i]<rank[j]){result[i]++;}
				else if(rank[i]>rank[j]){result[j]++;}
			}
		}
		for(int i=0; i<N; i++){
			System.out.println(result[i]);
		}
	}

}
