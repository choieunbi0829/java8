package java8;

import java.util.Scanner;

public class Day0310 {

	public static void main(String[] args) {
		//키보드 입력을 위한 객체
		Scanner sc= new Scanner(System.in);
		
		int num1, num2, num3;
		System.out.print("수도입니까?(수도 : 1, 수도아님 : 0) - ");
		num1 = sc.nextInt();		//int capital = sc.nextInt();
									//boolean isCapital = capital == 0? false :true;
		//키보드로 값을 입력
		System.out.print("인구(단위 : 만) - ");
		num2 = sc.nextInt();		//int citizens = sc.textInt();
		
		//키보드로 값을 입력
		System.out.print("부자의 수(단위 : 만) - ");
		//키보드로 값을 입력
		num3 = sc.nextInt();		//int riches = sc. nextInt();
		
		//판단 메트로폴리스 여부(논리연산자)
		//1. 한 나라의 수도이고 인구가 100만 이상이어야 한다.(관계연산자)
			//boolean isMetrol1 = isCapital && citizens >= 100;
		
		//2. 연 소득이 1억 이상인 인구가 50만 이상이여야 한다.(관계연산자)
			//boolean isMetro1 = riches >=50;
			//isMetro = isMetro1 || isMetro2;
		System.out.println("메트로폴리스 여부 :");		// + isMetro
		System.out.println(((num1==1) && (num2 >=100)) || (num3>=50));
		
	}

}
