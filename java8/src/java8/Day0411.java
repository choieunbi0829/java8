package java8;

import java.util.Scanner;

public class Day0411 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 N : ");
		int n = sc.nextInt();
		System.out.print("입력 M : ");
		int m = sc.nextInt();
		
		System.out.println("교환 전 : N = " + n + ", M = " + m);
		/* swap 코드 */
		int temp;
		
		temp = n;
		n = m;
		m = temp;
		
		System.out.println("교환 후 : N = " + n + ", M = " + m);
	}
}
