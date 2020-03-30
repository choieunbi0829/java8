package java8;

import java.util.Scanner;

public class Day1102 {
	public static void main(String[] args) {
			/*두 개의 정수를 입력받아서 큰값과 작은 값을 출력
			 * 반드시 if~else를 사용하세요*/
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("두개의 정수를 입력해 주세요. : ");
		
		int[] arr=new int[2];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		if(arr[0]>arr[1]) {
			int temp = arr[0];
			arr[0]=arr[1];
			arr[1]=temp;
		}
		
		System.out.println("작은값: " + arr[0] + ", 큰값: " + arr[1]);
		
		
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
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		sc.close();
	}
}

