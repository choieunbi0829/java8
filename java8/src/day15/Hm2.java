package day15;

public class Hm2 extends Hangman{
	
	static String[] arr = {"hello","happy","sad","cold","hot"};
	static String str = arr[(int)Math.random()*arr.length];
	
	public Hm2() {
		super(str);
				
	}
}
