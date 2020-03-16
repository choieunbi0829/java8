package java8;

import java.awt.print.Printable;

public class Day0303 {
	public static void main(String[] args) {
		int number1 = 100;	//지역변수
		System.out.println(number1);
		
		{	//중괄호 블럭
			System.out.println(number1);
			int number2 = 200;	//블럭변수
			System.out.println(number2);
		
		}
		
		System.out.println(number1);
//		System.out.println(number2);	외부의 것은 내부에서 쓸수 있지만 
//										내부의 것은 외부에서 사용할 수 없다
	}
}
