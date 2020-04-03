package day16;

import java.io.File;
import java.util.Scanner;

public class TryWithResources {
	public void getDate(String fileName) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File(fileName));
			System.out.println(sc.nextLine());
		}catch(Exception e) {
			System.err.println("예외발생");
			System.out.println();
			e.getMessage();
			System.out.println();
			e.printStackTrace();
		}finally {	//입출력 스트림을 강제로 닫기 위해서 finally구간을 이용(1.6버전 이전에 사용한 코드)
			if(sc !=null) {
				sc.close();
			}
		}
	}
	public static void main(String[] args) {
		TryWithResources twr = new TryWithResources();
		twr.getDate("test.txt");
	}
}
