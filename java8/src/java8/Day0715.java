package java8;

import java.util.Scanner;

public class Day0715 {
	public static void main(String[] args) {
		/* �������� 2�ܺ��� 9�ܱ��� ��� */

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "x" + j + "=" + (i * j) + "\t");
			}

			System.out.println();
		}
		/*�� ���� ������� �Է¹޾Ƽ� ����� �ּ���*/
		Scanner sc=new Scanner(System.in);
		System.out.print("�� ���� ������� �Է��� �ּ��� : ");
		int num = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.print(num + "x" + i + "=" + (num*i) + "\t");
		}
		System.out.println();
	}
}
