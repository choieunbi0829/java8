package java8;

import java.util.Scanner;

public class Day0411 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� N : ");
		int n = sc.nextInt();
		System.out.print("�Է� M : ");
		int m = sc.nextInt();
		
		System.out.println("��ȯ �� : N = " + n + ", M = " + m);
		/* swap �ڵ� */
		int temp;
		
		temp = n;
		n = m;
		m = temp;
		
		System.out.println("��ȯ �� : N = " + n + ", M = " + m);
	}
}
