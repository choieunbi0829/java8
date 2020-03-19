package java8;

import java.util.Scanner;

public class Day0509 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("키보드로 한 개의 문자를 입력하세요 : ");
		
		String coffee = sc.next();
		
		switch(coffee) {
			case "A":
			case "a":
				System.out.println("아메리카노");
					break;
			case "C":
			case "c":
				System.out.println("카푸치노");
				break;
			case "I":
			case "i":
				System.out.println("카페라떼");
				break;
			case "M":
			case "m":
				System.out.println("카페모카");	
		}
		sc.close();
	}
}
