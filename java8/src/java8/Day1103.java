package java8;

import java.util.Scanner;

public class Day1103 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2, res;
		while (true) {
			System.out.print("�ΰ��� ������ �Է��ϼ��� : ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			res = num1 * num2;
			System.out.println("�ΰ��� ������ ���� " + res);
			if (res > 500) {
				break;
			}
		}
		System.out.println("2���� ������ ���� 500�� �ʰ��Ͽ����ϴ�.");
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}
}
