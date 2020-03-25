package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0901 {
	public static void main(String[] args) {
		/*
		 * 1~100 중에 랜덤하게 정답을 설정한다. 입력한 값이 정답보다 크면 "up" 입력한 값이 정답보다 작으면 "DOWN" 최대 회수는
		 * 10회로 설정합니다. 게임적 요소를 위해 점수를 출력합니다.
		 */
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int com = rd.nextInt(100) + 1;
		int a = com;
		int user;
		int cnt=0;
		while (true) {

			System.out.print("정수를 입력해주세요.(1~100) : ");
			user = sc.nextInt();
			 cnt++;
			if (user < a) {
				System.out.println("입력된 숫자보다 높습니다."+ cnt + "회 입력하였습니다.");

			} else if (user == a) {
				System.out.println("제시된 숫자가 같습니다. 정답입니다."+ cnt + "회 입력하였습니다.");
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			} else {
				System.out.println("입력된 숫자보다 낮습니다."+ cnt + "회 입력하였습니다.");

			}
		}
		
		
		/*int cnt;
		long startTime = System.currentTimeMillis();
		
		while (true) {
			do {
				if(user !=0) {
					System.out.println("잘못입력하셨습니다.");
				}
				System.out.println("숫자를 입력해주세요. (1~100) : ");
				user = sc.nextInt();
			}while(user<1||user>100);
			cnt++;
			if(user==com) {
				System.out.println("정답입니다. " + cnt + "회 입력하였습니다.");
			}else if(com>user) {
			System.out.println("UP!!" + cnt + "회 입력하였습니다.");
			} else { 
				System.out.println("Down!" + cnt +"회 입력하였습니다.");
			}
			if(cnt==10) {
				System.out.println("최종점수는 0점입니다. 게임을 종료합니다.");
				System.exit(0);
			}
		}
		
		long endTime=System.currentTimeMillis();
		long playTime = (endTime-startTime)/1000;
		long score = (long)((60-playTime)/0.6);
		System.out.println("최종점수는" + score + "점입니다. 게임을 종료합니다.");
		*/
	}
}
