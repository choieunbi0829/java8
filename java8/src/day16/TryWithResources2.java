package day16;

import java.io.File;
import java.util.Scanner;

public class TryWithResources2 {
	public void getDate(String fileName) {
		try (Scanner sc = new Scanner(new File(fileName)); 		//여러 개의 자동 닫힘 소스를 작성할 수 잇다.
			Scanner sc2 = new Scanner(System.in);
			) {
			System.out.println(sc.nextLine());
		} catch (Exception e) {
			System.err.println("예외발생");
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
