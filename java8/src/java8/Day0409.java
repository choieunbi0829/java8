package java8;

import java.util.Scanner;

public class Day0409 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number1;
		int number2;
		
		System.out.println("이름. 학번. 토플점수를 입력하세요! : ");
		String name = sc.next();
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		
		System.out.println("나의 이름은 " + name + "입니다.");
		System.out.println("학번은 " + number1 + "입니다.");
		System.out.println("그리고 토플점수는 " + number2 + "점 입니다.");
		
		sc.close();
	}
}
