package java8;

import java.util.Scanner;

public class Day1101 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("1���� ������ �Է��� �ּ���. : ");
		int num1=sc.nextInt();
		
		System.out.println(num1 + "�� �Է��ϼ̽��ϴ�.");
		
		int num2 = 0;
		int sum=0;
		
		for(int i=1; i<=num1; i++) {
			if(i%5==0){
				num2++;
			sum +=i;
			}
		}
		System.out.println("5�� ����� ���� : " + num2 );
		System.out.println("5�� ����� �� : " + sum);
		sc.close();
	}
}
