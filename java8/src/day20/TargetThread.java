package day20;

public class TargetThread extends Thread{
	public void run() {
		String sum = "";
		for(long i = 0; i<30_000; i++) {
		}
		
		try {
			//1.5초간 일시정지
			Thread.sleep(1500);
		} catch (InterruptedException e) {
		}
		
		for(long i =0; i<30_000; i++) {
			sum += i; 
			
		}
	}
	
	public static void main(String[] args) {
		StatePrintThread spt = new StatePrintThread(new TargetThread());
		spt.start();
	}
}
