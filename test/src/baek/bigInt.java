package baek;

public class bigInt {
	
	public static void sort(int[] data){
		int size = data.length;
		int min;
		int temp;
		int tempA;
		
		for(int i=0; i<size-1; i++){
			min = i;
			for(int j=i+1; j<size; j++){
				tempA=data[j];
				if((data[min]<10 && data[j]<10) || (data[min]>=10 && data[j]>=10)){
					if(data[min]>data[j]){
						min=j;
					}
				}
				else if(data[min]<10 && data[j]>=10){
					if(data[min]> data[j]/10){
						min=j;
					}
					else if((data[min]==data[j]/10)&&(data[min]>data[j]%10)){
						min=j;
					}
				}
			}
			temp = data[min];
			data[min]=data[i];
			data[i]=temp;
		}
	}

	public static void main(String[] args) {
		int[] numbers = {3,972,338,23,300};
        String answer = "";
        
        sort(numbers);
        
        for(int i=0; i<numbers.length; i++){
        	System.out.println(numbers[i]);
        }

	}

}
