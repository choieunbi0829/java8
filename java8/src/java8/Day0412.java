package java8;

import java.util.Scanner;

public class Day0412 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.print("�Է�a : ");
		a = sc.nextInt();
		System.out.print("�Է�b : ");
		b = sc.nextInt();
		
		System.out.println("�Է� : a(" + a + ") , b(" + b +") ");
		
		int max;
		String str;
		str = a > b? "a" : "b";
		max = a > b? a:b;
		System.out.println("���: " + str + "(" + max + ")" );
		
		String stra = "a(" + a + ")";
		String strb = "b(" + b + ")";
		System.out.println("�Է� : " + stra + " , " + strb );
		
		String result = a >= b? stra :strb;
		System.out.println("��� : " + result);
		
	}

}
