package day20;

public class JoinEx {
	public static void main(String[] args) {
		SumThread t = new SumThread();
		t.start();
		try {
		Thread.sleep(10);
			t.join();		//t������ ���������� ���� �ڵ尡 �����Ҽ� �ֵ��� �Ѵ�.
		}catch(InterruptedException e) {
		}
		System.out.println(t.getSum());
	}
}	

