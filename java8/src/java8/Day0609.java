package java8;

import java.util.Scanner;

public class Day0609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ga = "����";
		String ba = "����";
		String bo = "��";
		String people = "";
		String computer = "";
		int score = 0;
		int life = 3;

		// ����Է� // ���ӽ��� ����
		while (true) {
			System.out.print("����, ����, �� �� �ϳ��� �����ϼ���.(a=����, b=����, c=��, q=���� :  ");
			people = sc.next();
			switch (people) {
			case "A":
			case "a":
				people = ga;
				break;
			case "B":
			case "b":
				people = ba;
				break;
			case "C":
			case "c":
				people = bo;
				break;
			case "Q":
			case "q":
				people = "quit";
				break;
			default:
				people = "error";
			}

			int number = (int) (Math.random() * 3);
			switch (number) {
			case 0:
				computer = ga;
				break;
			case 1:
				computer = ba;
				break;
			case 2:
				computer = bo;
				break;
			}

			if ((people.equals(bo) && computer.equals(ba)) || (people.equals(ga) && computer.equals(bo))
					|| (people.equals(bo) && computer.equals(ga))) {
				System.out.println("�����! ��� : " + people + ",��ǻ�� : " + computer);
				score += 10;
			} else if (people == computer) {
				System.out.println("�����ϴ�! ��� : " + people + ", ��ǻ�� : " + computer);
				score += 1;
			} else {
				System.out.println("��ǻ�ͽ�! ��� : " + people + ",��ǻ�� : " + computer);
				life -= 1;
			}
			System.out.println("���� ����: " + score + "���� ������: " + life);
			System.out.println();

			if (life == 0) {
				System.out.println("������ ����Ǿ����ϴ�.");
				break;
			}
			// ���ӳ�
		}
	}
}
