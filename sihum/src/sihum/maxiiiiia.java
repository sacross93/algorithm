package sihum;

import java.util.Scanner;

public class maxiiiiia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print(" 3개 숫자 ㄱ  ");
		
		double no1 = input.nextDouble();
		double no2 = input.nextDouble();
		double no3 = input.nextDouble();
		
		double result = maximum(no1 , no2 , no3);
		
		System.out.println("최대값은 " + result);
		
	}
	
	static double maximum (double x, double y, double z ) 
	{
		return Math.max(x, Math.max(y, z));
	}
}
