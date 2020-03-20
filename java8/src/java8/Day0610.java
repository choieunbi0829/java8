package java8;

import java.util.Scanner;

public class Day0610 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	
	/*	int year;
		System.out.println("윤년을 판별할 년도 입력! : ");
	    year = sc.nextInt();
	    
	    if(year % 4 == 0 && year % 100 ==0 && year % 400 ==0) {
	    	System.out.println(year + " 년은 윤년이다.");
	    }
	    else if(year %4 ==0 && year %100  != 0) {
	    	System.out.println(year + "년은 윤년이다.");
	    } else {
	    system.out.prinln(year + "년은 윤년이 아니다.");
	 */
		
		
		int year;
		System.out.println("윤년을 판별할 년도 입력! : ");
	    year = sc.nextInt();
	    
	    if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
	    	System.out.println(year + "년은 윤년이다.");
	    } else {
	    	System.out.println(year + "년은 윤년이 아니다.");
	    }
	    
	    sc.close();
	    
	}
}
	    
	    
	    
