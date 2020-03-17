package java8;

import java.util.Scanner;

public class Day0412 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.print("입력a : ");
		a = sc.nextInt();
		System.out.print("입력b : ");
		b = sc.nextInt();
		
		System.out.println("입력 : a(" + a + ") , b(" + b +") ");
		
		int max;
		String str;
		str = a > b? "a" : "b";
		max = a > b? a:b;
		System.out.println("결과: " + str + "(" + max + ")" );
		
		String stra = "a(" + a + ")";
		String strb = "b(" + b + ")";
		System.out.println("입력 : " + stra + " , " + strb );
		
		String result = a >= b? stra :strb;
		System.out.println("결과 : " + result);
		
	}

}
