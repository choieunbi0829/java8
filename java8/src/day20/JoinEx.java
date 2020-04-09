package day20;

public class JoinEx {
	public static void main(String[] args) {
		SumThread t = new SumThread();
		t.start();
		try {
		Thread.sleep(10);
			t.join();		//t연산이 끝나야지만 다음 코드가 실행할수 있도록 한다.
		}catch(InterruptedException e) {
		}
		System.out.println(t.getSum());
	}
}	

