package java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Day1014 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int r[]=new int[10];
		int number;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수 10개를 입력하세요! : ");
		for(int i=0; i<r.length; i++) {
			r[i] =Integer.parseInt(inbr.readLine());
		}
		System.out.println("입력 데이터 값 : ");
		for(int i=0; i<r.length; i++) {
			System.out.print(r[i] + "..");
		}
		System.out.println();
		
		//오름차순 정렬(버블정렬)
//		
//		for(int i=0; i<r.length; i++) {
//			for(int j=0; j<r.length-1; j++) {
//				if(r[i]<r[j]) {
//					int temp = r[i];
//					r[i]= r[j];
//					r[j]= temp;
//				}
//			}
//		}
		Arrays.sort(r);	//Arrays 클래스에서 제공하는 정렬 메서드
		
		
		System.out.println("오름차순 데이터 값 : ");
		for(int i=0; i<r.length; i++) {
			System.out.print(r[i] + "..");
		}
		System.out.println();
		
		System.out.print("합계: ");
		int sum=0;
		for(int i=0; i<r.length; i++) {
			sum +=r[i];
		}
		System.out.println(sum);
		System.out.print("평균 : " + (sum/r.length));
	}
}
