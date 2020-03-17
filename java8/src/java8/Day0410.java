package java8;

import java.util.Scanner;

public class Day0410 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int w;
		int h;
		
		System.out.println("직사각형의 가로와 세로을 쓰시오 : ");
		w = sc.nextInt();
		h = sc.nextInt();
		
		double res1 = (double)w *h;
		double res2 = (double)2 * ( w + h );
		System.out.println("직사각형의 넓이 : " + res1);
		System.out.println("사각형의 둘레 : " + res2);
		
		sc.close();
	}
}
