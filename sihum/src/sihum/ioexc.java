package sihum;

import java.util.*;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.*;
import java.lang.*;

public class ioexc {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int dividend;
		int divisor;

		int a[] = new int[5];
		try {
			a[6] = 3;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("범위 x");
		}

		System.out.print("나뉨수를 입력하시오:");
		dividend = scanner.nextInt();
		System.out.print("나눗수를 입력하시오:");
		divisor = scanner.nextInt();
		try {
			System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend / divisor + "입니다.");
		} catch (ArithmeticException e) {
			System.out.println("안돼");
		} finally {
			System.out.println("무조건 나오는 출력문");
		}
	}

}
