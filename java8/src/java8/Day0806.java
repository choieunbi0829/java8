package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0806 {
	public static void main(String[] args) {
		/* 구구단 게임 10회 완료시 실행 시간을 출력 */

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
				System.out.println("정답입니다.");
			} else {
				System.out.println("틀렸습니다.게임을 종료합니다.");
				System.exit(0);
			}

		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime + " 초 걸렸습니다.");
		sc.close();
	}
}
