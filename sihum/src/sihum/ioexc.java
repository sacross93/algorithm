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
			System.out.println("���� x");
		}

		System.out.print("�������� �Է��Ͻÿ�:");
		dividend = scanner.nextInt();
		System.out.print("�������� �Է��Ͻÿ�:");
		divisor = scanner.nextInt();
		try {
			System.out.println(dividend + "�� " + divisor + "�� ������ ���� " + dividend / divisor + "�Դϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("�ȵ�");
		} finally {
			System.out.println("������ ������ ��¹�");
		}
	}

}
