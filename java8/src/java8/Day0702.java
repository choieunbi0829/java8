package java8;

import java.util.Scanner;

public class Day0702 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� 1���� �Է��ϼ���. : ");
		int num1 = sc.nextInt();

		if((num1 % 2) == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
		sc.close();
	}
}