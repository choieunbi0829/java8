package day15;

import java.util.Scanner;

public class Hangman {
	private String hiddenString; // 숨겨진 문자열(문제)
	private StringBuffer outputString; // 플레이어의 입력에 따른 결과로 보여줄 문자열
	private StringBuffer inputString; // 플레이어가 입력한 문자들의 모임
	private int remainder; // 맞힐 문자열(못 맞히고 남아있는 문자의 수)
	private int failed; // 실패한 횟수
	private Scanner sc;
	private String inputDate;

	public Hangman() {
		hiddenString = "hello";
		outputString = new StringBuffer();
		inputString = new StringBuffer();
		remainder = hiddenString.length();
		failed = 0;
		sc = new Scanner(System.in);
		inputDate = "";
		for (int i = 0; i < remainder; i++) {
			outputString.append("_");
		}
	}

	public Hangman(String solution) {
		hiddenString = "hello";
		outputString = new StringBuffer();
		inputString = new StringBuffer();
		remainder = hiddenString.length();
		failed = 0;
		sc = new Scanner(System.in);
		inputDate = "";
		for (int i = 0; i < remainder; i++) {
			outputString.append("_");
		}
	}

	public void playGame() {
		System.out.println("행맨 게임을 시작합니다.");
		do {
			show();
			do {
				setInputDate();
			} while (checkChar(inputDate));
			processGame();
		} while (failed < 6 && remainder>0);

		System.out.println("행맨 게임을 종료합니다.");
	}

	private void show() {
		System.out.println("틀린횟수: " + failed + "/6");
		System.out.println(outputString);
	}

	private void setInputDate() {
		System.out.println("문자를 입력해 주세요: ");
		this.inputDate = sc.next().substring(0, 1);
	}

	private boolean checkChar(String inputDate) {
		if (inputString.indexOf(inputDate) == -1) {
			inputString.append(inputDate);
			return false;
		}
		System.out.println("이미 입력한 문자입니다.");
		return true;

	}

	private void processGame() {
		if (hiddenString.indexOf(inputDate) == -1) {
			failed++;
		} else {
			int index = hiddenString.indexOf(inputDate);
			do {
				outputString.setCharAt(index, inputDate.charAt(0));
				remainder--;
				index = hiddenString.indexOf(inputDate, index + 1);
			} while (index != -1);
		}

	}

}
/*
 * public Hangman(){ hiddenString = "hello"; outputString = new StringBuffer();
 * 
 * 
 * } void playGame() { remainder=hiddenString.length(); for(int i=0;
 * i<remainder; i++) { outputString.append("_");
 * 
 * inputString = new StringBuffer(); failed = 0; } System.out.println("글자(" +
 * hiddenString.length() + ") => " + outputString );
 * 
 * do { Scanner sc = new Scanner(System.in); System.out.print("문자를 입력해주세요>> ");
 * char answer = sc.next().charAt(0); boolean hit = false;
 * 
 * for(int i=0; i<hiddenString.length(); i++) { if(answer ==
 * hiddenString.charAt(i)) { outputString.setCharAt(i, answer);
 * System.out.println("맞히셨습니다. 문자:" + answer); System.out.println(outputString);
 * } if(answer != hiddenString.charAt(i)){ failed++; System.out.println("기회 => "
 * + failed); }
 * 
 * } }while(failed<=6); }
 */
