package java8;

import java.util.Scanner;

public class Day1102 {
	public static void main(String[] args) {
			/*�� ���� ������ �Է¹޾Ƽ� ū���� ���� ���� ���
			 * �ݵ�� if~else�� ����ϼ���*/
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�ΰ��� ������ �Է��� �ּ���. : ");
		
		int[] arr=new int[2];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		if(arr[0]>arr[1]) {
			int temp = arr[0];
			arr[0]=arr[1];
			arr[1]=temp;
		}
		
		System.out.println("������: " + arr[0] + ", ū��: " + arr[1]);
		
		
		int num1=sc.nextInt();
		int num2= sc.nextInt();
		
		int max,min;
		
		if(num1>num2) {
			max=num1;
			min=num2;
		}else {
			max=num2;
			min=num1;
		}
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		sc.close();
	}
}

