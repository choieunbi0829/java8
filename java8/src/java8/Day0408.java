package java8;

import java.util.Scanner;

public class Day0408 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r;
		double pie = 3.14159;
		
		System.out.println("���� �������� ������ �Է��Ѵ�. : ");
		r = sc.nextInt();
		double res = 2 * r * pie;
		
		System.out.println("���� �������� " + r + "�̴�.");
		System.out.println("���� ���ѷ�(����)��" + res + "�̴�.");
		
		double result = 2 * Math.PI * r;
		System.out.println(result);
		
		sc.close();
		
	}
}
