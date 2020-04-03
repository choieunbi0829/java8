package day16;

import java.io.File;
import java.util.Scanner;

public class TryWithResources2 {
	public void getDate(String fileName) {
		try (Scanner sc = new Scanner(new File(fileName)); 		//���� ���� �ڵ� ���� �ҽ��� �ۼ��� �� �մ�.
			Scanner sc2 = new Scanner(System.in);
			) {
			System.out.println(sc.nextLine());
		} catch (Exception e) {
			System.err.println("���ܹ߻�");
			System.out.println();
			e.getMessage();
			System.out.println();
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TryWithResources2 twr = new TryWithResources2();
		twr.getDate("test.txt");
	}
}
