package java8;

import java.util.Scanner;

public class Day0807 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("두 개의 정수를 입력하세요. : ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int sum=0;
		int i;
		if(!(num1>=-10_000_000 && num1<= 10_000_000)) {
			System.out.println("a값의 입력범위를 초과하였습니다.");
			System.exit(0);
		}
		if(!(num1>=-10_000_000 && num1<= 10_000_000)) {
				System.out.println("b값의 입력범위를 초과하였습니다.");
				System.exit(0);
		}
		if(num1>num2) {
			for(i=num2; i<=num1; i++) {
				sum +=i;
		}	
		} else if(num1<num2) {
			for(i=num1; i<=num2; i++) {
				sum +=i;
			}
		} else {
			sum = num1;
			
		}
		System.out.println(sum + "를 리턴합니다.");
	}
}

