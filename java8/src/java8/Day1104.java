package java8;

import java.util.Scanner;

public class Day1104 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char score;
		int num1,num2,num3,num4;
		do {
			System.out.print("�⼮������ �Է��ϼ��� : ");
			num1 = sc.nextInt();
			if (num1 > 20) {
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ִ������� 20���Դϴ�.");
			}
		} while (num1 > 20);
		do {
		System.out.print("���������� �Է��ϼ��� : ");
		num2 = sc.nextInt();
		if (num2 > 20) {
			System.out.println("�߸��Է��ϼ̽��ϴ�. �ִ������� 20���Դϴ�.");
		}
		} while (num2 > 20);
		do {
		System.out.print("�߰���������� �Է��ϼ��� : ");
		num3 = sc.nextInt();
		if (num3 > 30) {
			System.out.println("�߸��Է��ϼ̽��ϴ�. �ִ������� 30���Դϴ�.");
		}
		} while (num3 > 30);
		do {
		System.out.print("�⸻��������� �Է��ϼ��� : ");
		num4 = sc.nextInt();
		if (num4 > 30) {
			System.out.println("�߸��Է��ϼ̽��ϴ�. �ִ������� 30���Դϴ�.");
		}
		} while (num4 > 30);
		int sum = num1 + num2 + num3 + num4;
		System.out.println("������ " + sum + "�Դϴ�.");
		
		if (90 <= sum) {
			score = 'A';
		} else if (sum >= 80) {
			score = 'B';
		} else if (sum >= 70) {
			score = 'C';
		} else if (sum >= 60) {
			score = 'D';
		} else {
			score = 'F';
		}
		System.out.println("������ " + score + "�Դϴ�.");
		}
}
