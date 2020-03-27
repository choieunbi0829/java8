package java8;

import java.util.Random;
import java.util.Scanner;

public class Day1016 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int com[] = new int[3];
		int user[] = new int[3];
		int x, y, z;
		int strike=0, ball=0;

		x = rd.nextInt(9) + 1;

		do {
			y = rd.nextInt(9) + 1;
		} while (x == y);

		do {
			z = rd.nextInt(9) + 1;
		} while (y == z || x == z);
		
		com[0]=x;
		com[1]=y;
		com[2]=z;
		
		/*System.out.println("1~9까지 숫자 세 개를 입력합니다.");
		for(i=0; i<user.length; i++) {
			do {
			System.out.print(i+1 + "번째 숫자 : ");
			user[i]=sc.nextInt();
			 if(user[i]==0) {
				 System.out.println("0을 입력하셨습니다. 다시 입력해 주세요");
			 }
			 if(user[i]>9) {
				 System.out.println("숫자를 초과하셨습니다. 다시 입력해 주세요");
			 }
			 
		}while(user[i]==0 || user[i]>9 );
			
		}
		
		System.out.println("게임을 종료합니다.");
		System.exit(0);
		*/
		for(int j=0; j<11; j++) {
		System.out.println("첫 번째 값을 입력해 주세요. : ");
		do {
			if(user[0] != 0) {
				System.out.println("입력범위를 초과하였습니다. 다시 입력해 주세요.");
			}
			user[0]=sc.nextInt();
		}while(user[0]<1 ||user[0]>9);
		do {
			if(user[0]==user[1]) {
				System.out.println("동일한 숫자는 사용할 수 없습니다. 다시 입력해 주세요.");
			}
		System.out.println("두 번째 값을 입력해 주세요. : ");
		do {
			if(user[1] != 0) {
				System.out.println("입력범위를 초과하였습니다. 다시 입력해 주세요.");
			}
			user[1]=sc.nextInt();
		}while(user[1]<1 ||user[1]>9);
		}while(user[0]==user[1]);
		
		do {
			if(user[0] ==user[1] || user[1]==user[2]) {
				System.out.println("동일한 숫자는 사용할 수 없습니다. 다시 입력해 주세요.");
			}
		System.out.println("세 번째 값을 입력해 주세요. : ");
		do {
			if(user[2] != 0) {
				System.out.println("입력범위를 초과하였습니다. 다시 입력해 주세요.");
			}
			user[2]=sc.nextInt();
		}while(user[2]<1 ||user[2]>9);
		}while(user[0]==user[2] || user[1]==user[2]);
		
		for(int i=0; i<3; i++) {
			if(com[i]==user[i]) {
				strike++;
			}
		}
		
		if(com[0]==user[1] ||com[0]==user[2]) {
			ball++;
		}
		if(com[1]==user[0] ||com[1]==user[2]) {
			ball++;
		}
		if(com[2]==user[0] ||com[2]==user[1]) {
			ball++;
		}
		System.out.println(strike + "스트라이크, " + ball + "볼");
		if(strike==3) {
			System.out.println("정답입니다. 게임을 종료합니다.");
			System.exit(0);
		}
		strike = ball = 0;
	}
	}
}
