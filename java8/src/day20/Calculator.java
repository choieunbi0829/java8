package day20;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {		//쓰레드 동기화블록 설정 synchronized
		this.memory = memory;
		try {
			Thread.sleep(2000);		//2초
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}
