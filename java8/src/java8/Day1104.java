package java8;

import java.util.Scanner;

public class Day1104 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char score;
		int num1,num2,num3,num4;
		do {
			System.out.print("출석점수를 입력하세요 : ");
			num1 = sc.nextInt();
			if (num1 > 20) {
				System.out.println("잘못입력하셨습니다. 최대점수는 20점입니다.");
			}
		} while (num1 > 20);
		do {
		System.out.print("과제점수를 입력하세요 : ");
		num2 = sc.nextInt();
		if (num2 > 20) {
			System.out.println("잘못입력하셨습니다. 최대점수는 20점입니다.");
		}
		} while (num2 > 20);
		do {
		System.out.print("중간고사점수를 입력하세요 : ");
		num3 = sc.nextInt();
		if (num3 > 30) {
			System.out.println("잘못입력하셨습니다. 최대점수는 30점입니다.");
		}
		} while (num3 > 30);
		do {
		System.out.print("기말고사점수를 입력하세요 : ");
		num4 = sc.nextInt();
		if (num4 > 30) {
			System.out.println("잘못입력하셨습니다. 최대점수는 30점입니다.");
		}
		} while (num4 > 30);
		int sum = num1 + num2 + num3 + num4;
		System.out.println("총점은 " + sum + "입니다.");
		
		if (90 <= sum) {
			score = 'A';
		} else if (sum >= 80) {
			score = 'B';
		} else if (sum >= 70) {
			score = 'C';
		} else if (sum >= 60) {
			score = 'D';
		} else {
			score = 'F';
		}
		System.out.println("학점은 " + score + "입니다.");
		}
}
