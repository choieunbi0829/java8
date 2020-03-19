package java8;

import java.util.Random;
import java.util.Scanner;

public class Day0510 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ga ="가위";
		String ba = "바위";
		String bo = "보";
		String people = "";
		String computer = "";
		
		System.out.print("가위, 바위, 보 중 하나를 선택하세요. :  ");
		people = sc.next();
		switch(people) {
			case "A":
			case "a":
				people = ga;
				break;
			case "B":
			case "b":
				people = ba;
				break;
			case "C":
			case "c":
				people = bo;
				break;
		}
		
		int number = (int)(Math.random() * 3);
		switch(number) {
			case 0 :
				computer = ga;
				break;
			case 1 :
				computer = ba;
				break;
			case 2 :
				computer = bo;
				break;
		}
		
		if((people == bo && computer == ba) ||(people == ga && computer == bo) || (people == bo && computer == ga)) {
			System.out.println("사람승! 사람 : " + people + ",컴퓨터 : " + computer);
		} else if(people == computer) {
			System.out.println("비겼습니다! 사람 : " + people + ", 컴퓨터 : " + computer);
		} else {
			System.out.println("컴퓨터승! 사람 : " + people + ",컴퓨터 : " + computer);
		}
	}
}
