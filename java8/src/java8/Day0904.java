package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0904 {
	public static void main(String[] args) {
		/* ������ ������ �ۼ��ϼ��� */

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int subScore = 0;
		
		long startTime=System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			int num1 = rd.nextInt(9)+1;
			int num2 = rd.nextInt(9)+1;
			int com = num1 * num2;
			
			System.out.print(num1 + " x " + num2 + " = ");
			int user = sc.nextInt();
			
			if (user == com) {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				System.out.println("5�� �����Դϴ�.");
				subScore +=5;
			}

		}
		long endTime=System.currentTimeMillis();
		long playTime = endTime-startTime/1000;
		long score =200-playTime-subScore;
		if(score>100) {
			score = 100;
		}else if(score<0) {
			score=0;
		}
		System.out.println("���������� " + score + "�Դϴ�.");
		sc.close();
		System.exit(0);
	}

}
