package day15;

import java.util.Scanner;

public class Hangman {
	private String hiddenString; // ������ ���ڿ�(����)
	private StringBuffer outputString; // �÷��̾��� �Է¿� ���� ����� ������ ���ڿ�
	private StringBuffer inputString; // �÷��̾ �Է��� ���ڵ��� ����
	private int remainder; // ���� ���ڿ�(�� ������ �����ִ� ������ ��)
	private int failed; // ������ Ƚ��
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
		System.out.println("��� ������ �����մϴ�.");
		do {
			show();
			do {
				setInputDate();
			} while (checkChar(inputDate));
			processGame();
		} while (failed < 6 && remainder>0);

		System.out.println("��� ������ �����մϴ�.");
	}

	private void show() {
		System.out.println("Ʋ��Ƚ��: " + failed + "/6");
		System.out.println(outputString);
	}

	private void setInputDate() {
		System.out.println("���ڸ� �Է��� �ּ���: ");
		this.inputDate = sc.next().substring(0, 1);
	}

	private boolean checkChar(String inputDate) {
		if (inputString.indexOf(inputDate) == -1) {
			inputString.append(inputDate);
			return false;
		}
		System.out.println("�̹� �Է��� �����Դϴ�.");
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
 * inputString = new StringBuffer(); failed = 0; } System.out.println("����(" +
 * hiddenString.length() + ") => " + outputString );
 * 
 * do { Scanner sc = new Scanner(System.in); System.out.print("���ڸ� �Է����ּ���>> ");
 * char answer = sc.next().charAt(0); boolean hit = false;
 * 
 * for(int i=0; i<hiddenString.length(); i++) { if(answer ==
 * hiddenString.charAt(i)) { outputString.setCharAt(i, answer);
 * System.out.println("�����̽��ϴ�. ����:" + answer); System.out.println(outputString);
 * } if(answer != hiddenString.charAt(i)){ failed++; System.out.println("��ȸ => "
 * + failed); }
 * 
 * } }while(failed<=6); }
 */
