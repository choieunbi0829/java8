package day19;

import java.util.Hashtable;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hashtable<String, String> ha = new Hashtable<String, String>();
		
		System.out.println("공백으로 분리된 이름과 전화번호 4개를 입력하세요.");
		System.out.print("이름, 전화번호 : ");
		String name1 = sc.next();
		String num1 = sc.next();
		ha.put(name1, num1);
		System.out.print("이름, 전화번호 : ");
		String name2 = sc.next();
		String num2 = sc.next();
		ha.put(name2, num2);
		System.out.print("이름, 전화번호 : ");
		String name3 = sc.next();
		String num3 = sc.next();
		ha.put(name3, num3);
		System.out.print("이름, 전화번호 : ");
		String name4 = sc.next();
		String num4 = sc.next();
		ha.put(name4, num4);
		
		System.out.println("전화번호로 검색할 이름을 입력하세요.");
		String name = sc.next();
		
		if(name == ha.get(name1)) {
			System.out.println(name + "의 전화번호는 " + ha.get(num1));
		}else if(name == ha.get(name2)) {
			System.out.println(name + "의 전화번호는 " + ha.get(num2));
		}else if(name == ha.get(name3)) {
			System.out.println(name + "의 전화번호는 " + ha.get(num3));
		}else {
			System.out.println(name + "의 전화번호는 " + ha.get(num4));
		}
		sc.close();
	}
}
