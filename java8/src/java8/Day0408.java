package java8;

import java.util.Scanner;

public class Day0408 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r;
		double pie = 3.14159;
		
		System.out.println("원의 반지름을 정수로 입력한다. : ");
		r = sc.nextInt();
		double res = 2 * r * pie;
		
		System.out.println("원의 반지름은 " + r + "이다.");
		System.out.println("원의 원둘레(원주)는" + res + "이다.");
		
		double result = 2 * Math.PI * r;
		System.out.println(result);
		
		sc.close();
		
	}
}
