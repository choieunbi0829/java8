package java8;

import java.util.Scanner;

public class Day0409 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number1;
		int number2;
		
		System.out.println("�̸�. �й�. ���������� �Է��ϼ���! : ");
		String name = sc.next();
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		
		System.out.println("���� �̸��� " + name + "�Դϴ�.");
		System.out.println("�й��� " + number1 + "�Դϴ�.");
		System.out.println("�׸��� ���������� " + number2 + "�� �Դϴ�.");
		
		sc.close();
	}
}
