package java8;

import java.util.Scanner;

public class Day1015 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int kimbab=2000;
		final int dduk=2000;
		final int oden=500;
		final int sumdae=2000;
		int a,b,c,d;
		
		System.out.println("김밥 1줄 : 2000원, 떡볶이 1인분 : 2000원, 오뎅 1개 : 500원, 순대 1인분 : 2000원");
		System.out.println("김밥은 몇 줄 구매하시겠습니까? : ");
		a=sc.nextInt();
		System.out.println();
		System.out.println("떡볶이는 몇 인분 구매하시겠습니까? : ");
		b=sc.nextInt();
		System.out.println();
		System.out.println("오뎅은 몇 개 구매하시겠습니까? : ");
		c=sc.nextInt();
		System.out.println();
		System.out.println("순대는 몇 인분 구매하시겠습니까? : ");
		d=sc.nextInt();
		System.out.println();
		
		System.out.println("김밥은 " + a +"줄 주문하셨습니다.");
		System.out.println("김밥 : " + kimbab * a);
		System.out.println();
		System.out.println("떡볶이는 " + b +"인분 주문하셨습니다.");
		System.out.println("김밥 : " + dduk * b);
		System.out.println();
		System.out.println("오뎅은 " + c +"개 주문하셨습니다.");
		System.out.println("김밥 : " + oden * c);
		System.out.println();
		System.out.println("순대은 " + d +"인분 주문하셨습니다.");
		System.out.println("김밥 : " + sumdae * d);
		System.out.println();
		
		System.out.println("총 금액: " + (kimbab * a + dduk * b + oden * c + sumdae * d));
		sc.close();
	}
}
