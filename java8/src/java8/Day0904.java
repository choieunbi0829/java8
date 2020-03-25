package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0904 {
	public static void main(String[] args) {
		/* 구구단 게임을 작성하세요 */

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
				System.out.println("정답입니다.");
			} else {
				System.out.println("틀렸습니다.");
				System.out.println("5점 감점입니다.");
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
		System.out.println("최종점수는 " + score + "입니다.");
		sc.close();
		System.exit(0);
	}

}
