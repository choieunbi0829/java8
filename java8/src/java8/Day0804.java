package java8;

import java.util.Scanner;

public class Day0804 {
	public static void main(String[] args) {
		/*
		 * �� ���� ������� �Է¹޾Ƽ�
		 * @
		 * @@
		 * @@@
		 * @@@@
		 * @@@@@ ���� ���� ���·� ����ϼ���.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("�� ���� ������� ������. : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}
}
