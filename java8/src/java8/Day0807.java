package java8;

import java.util.Scanner;

public class Day0807 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�� ���� ������ �Է��ϼ���. : ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int sum=0;
		int i;
		if(!(num1>=-10_000_000 && num1<= 10_000_000)) {
			System.out.println("a���� �Է¹����� �ʰ��Ͽ����ϴ�.");
			System.exit(0);
		}
		if(!(num1>=-10_000_000 && num1<= 10_000_000)) {
				System.out.println("b���� �Է¹����� �ʰ��Ͽ����ϴ�.");
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
		System.out.println(sum + "�� �����մϴ�.");
	}
}

