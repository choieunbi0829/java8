package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0806 {
	public static void main(String[] args) {
		/* ������ ���� 10ȸ �Ϸ�� ���� �ð��� ��� */

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int num1, num2, com, user;

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			num1 = rd.nextInt(9) + 1;
			num2 = rd.nextInt(9) + 1;
			com = num1 * num2;

			System.out.print(i+1 +" : " + num1 + " x " + num2 + " = ");
			user = sc.nextInt();
			if (user == com) {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.������ �����մϴ�.");
				System.exit(0);
			}

		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime + " �� �ɷȽ��ϴ�.");
		sc.close();
	}
}
