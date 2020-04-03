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
			System.err.println("���ܹ߻�");
			System.out.println();
			e.getMessage();
			System.out.println();
			e.printStackTrace();
		}finally {	//����� ��Ʈ���� ������ �ݱ� ���ؼ� finally������ �̿�(1.6���� ������ ����� �ڵ�)
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
