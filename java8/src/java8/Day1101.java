package java8;

import java.util.Scanner;

public class Day1101 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("1개의 정수를 입력해 주세요. : ");
		int num1=sc.nextInt();
		
		System.out.println(num1 + "을 입력하셨습니다.");
		
		int num2 = 0;
		int sum=0;
		
		for(int i=1; i<=num1; i++) {
			if(i%5==0){
				num2++;
			sum +=i;
			}
		}
		System.out.println("5의 배수의 개수 : " + num2 );
		System.out.println("5의 배수의 합 : " + sum);
		sc.close();
	}
}
