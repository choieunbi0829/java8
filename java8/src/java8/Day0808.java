package java8;

import java.util.Scanner;

public class Day0808 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,res1=0, res2=0;
		System.out.print("�� ���� ������ �Է����ּ���. :");
		a=sc.nextInt();
		b=sc.nextInt();
		
		for(int i=1; i<=Integer.MAX_VALUE; i++) {
			if(i%a==0 &&i%b==0) {
				res1=i;
				break;
			} 
		}
		res2=a*b /res1;
		System.out.println("�ּҰ����: " + res1 + "�ִ�����: " + res2);
		
	}
}
