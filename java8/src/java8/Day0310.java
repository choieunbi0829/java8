package java8;

import java.util.Scanner;

public class Day0310 {

	public static void main(String[] args) {
		//Ű���� �Է��� ���� ��ü
		Scanner sc= new Scanner(System.in);
		
		int num1, num2, num3;
		System.out.print("�����Դϱ�?(���� : 1, �����ƴ� : 0) - ");
		num1 = sc.nextInt();		//int capital = sc.nextInt();
									//boolean isCapital = capital == 0? false :true;
		//Ű����� ���� �Է�
		System.out.print("�α�(���� : ��) - ");
		num2 = sc.nextInt();		//int citizens = sc.textInt();
		
		//Ű����� ���� �Է�
		System.out.print("������ ��(���� : ��) - ");
		//Ű����� ���� �Է�
		num3 = sc.nextInt();		//int riches = sc. nextInt();
		
		//�Ǵ� ��Ʈ�������� ����(��������)
		//1. �� ������ �����̰� �α��� 100�� �̻��̾�� �Ѵ�.(���迬����)
			//boolean isMetrol1 = isCapital && citizens >= 100;
		
		//2. �� �ҵ��� 1�� �̻��� �α��� 50�� �̻��̿��� �Ѵ�.(���迬����)
			//boolean isMetro1 = riches >=50;
			//isMetro = isMetro1 || isMetro2;
		System.out.println("��Ʈ�������� ���� :");		// + isMetro
		System.out.println(((num1==1) && (num2 >=100)) || (num3>=50));
		
	}

}
