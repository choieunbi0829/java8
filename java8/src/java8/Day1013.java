package java8;

import java.util.Scanner;

public class Day1013 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int[] number = new int[5];
		int Max = 0;
		System.out.print("5���� ������ �Է����ּ���. : ");
		for(int i=0; i<number.length; i++) {
			number[i]=sc.nextInt();
		}
		Max= number[0];
		
		for(int i=1; i<number.length; i++) {
			if(Max<=number[i]) {
				Max=number[i];
			}
			
		}
		System.out.println(Max);
		System.out.println();
		
		System.out.println("5���� ������ �Է¹޾� �ִ밪�� ���ϴ� ���α׷�");
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			System.out.println(i +1 + "��° ������ �Է��ϼ���");
			arr[i] =sc.nextInt();
		} 
		int max = Integer.MIN_VALUE;
		for(int num : arr) {
			if(max<num) {
				max=num;
			}
		}
		System.out.println("�ִ밪: " + max);
	
	}
}
