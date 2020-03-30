package java8;

import java.util.Scanner;

public class Day1105 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2,pay;
		
		System.out.print("상품단가를 입력해주세요: ");
		num1=sc.nextInt();
		System.out.print("수량을 입력해주세요: ");
		num2=sc.nextInt();
		
		pay= num1*num2;
		
		System.out.println("금액이" + pay + "원이기때문에");
		if(pay>=1000000) {
			num1 *=0.6;
			System.out.println("100만원 이상 40%할인이 들어갑니다.");
		}
		if(pay>=500000 && pay<1000000) {
			num1*=0.7;
			System.out.println("50만원 이상 30%할인이 들어갑니다.");
		}
		
		System.out.println("실제 지불하실 금액은 " + (num1*num2) +"원 입니다.");
	}
}
