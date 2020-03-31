package Day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1 {
	public static void main(String[] args) throws IOException {
		System.out.println("출력할 문자열을 입력하세요! : ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inbr = new BufferedReader(isr);
		String instr = inbr.readLine();
		StringBuffer str = new StringBuffer(instr);
		
		System.out.println("입력한 문자열 : " + str);
		str.reverse();
		System.out.println(str);
		
		}
}
