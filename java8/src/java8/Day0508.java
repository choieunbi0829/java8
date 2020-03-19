package java8;

import java.util.Scanner;

public class Day0508 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 등급을 입력해주세요: ");
		String grape = sc.next();
		
		switch(grape) {
			case "S":
			case "s":
				System.out.println("당신은 VIP입니다.");
				break;
			case "A":
			case "a":
				System.out.println("당신은 우대 고객입니다.");
				break;
			case "B":
			case "b":
				System.out.println("당신은 우수 고객입니다.");
				break;
			default:
				System.out.println("당신은 일반 고객입니다.");
			}
	}
}
