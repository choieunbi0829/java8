package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0716 {
	public static void main(String[] args) {
		/* ���������� */

		Scanner sc = new Scanner(System.in);
		String com = "";
		String peo = "";
		final String ga = "����";
		final String ba = "����";
		final String bo = "��";
		int life = 3;
		int score = 0;
		/* ������ ���� */
		while (true) {
			do {
				System.out.print("���� :1, ����:2, ��:3, ����:4 " + "\t" + ">");
				int temp = sc.nextInt();
				switch (temp) {
				case 1:
					peo = ga;
					break;
				case 2:
					peo = ba;
					break;
				case 3:
					peo = bo;
					break;
				case 4:
					System.out.println("4���� �����Ͽ� ���α׷��� �����մϴ�.");
					System.out.println("score: " + score + ",life: " + life);
					System.exit(0);
					break;
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
			} while (peo.equals(""));

			/* ��ǻ�� ���� */
			Random rd = new Random();
			int temp = rd.nextInt(3);

			switch (temp) {
			case 0:
				com = ga;
				break;
			case 1:
				com = ba;
				break;
			case 2:
				com = bo;
				break;
			}
			/* ���� ��ǻ�� �� */

			if ((peo.equals(bo) && com.equals(ba)) || (peo.equals(ba) && com.equals(ga))
					|| (peo.equals(ga) && com.equals(bo))) {
				score += 100;
				System.out.println("�����¸�! ����: " + peo + ", ��ǻ��: " + com);
			} else if (peo == com) {
				score += 10;
				System.out.println("�����ϴ�. ����: " + peo + ", ��ǻ��: " + com);
			} else {
				life -= 1;
				System.out.println("��ǻ�� ��! ����: " + peo + ", ��ǻ��: " + com);
			}
			if (life == 0) {
				System.out.println("������ �����մϴ�.");
				System.out.println("������ " + score + "���Դϴ�.");
				System.exit(0);
			}
			System.out.println("score: " + score + ",life: " + life);
		}
	}

}
