package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day0405 {
	public static void main(String[] args) throws IOException {
		int intnum;
		double ablnum;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������ �Ǽ��� �Է��ϼ���! : ");
		intnum = Integer.parseInt(inbr.readLine());
		ablnum = Double.parseDouble(inbr.readLine());
		System.out.println("�Է��� ������ " + intnum + "�Դϴ�.");
		System.out.println("�Է��� �Ǽ��� " + ablnum + "�Դϴ�.");
		
	}

}
