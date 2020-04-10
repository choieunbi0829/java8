package day21;


public class Ex2 extends Thread{
	int delay;
	Ex2(String name, int delay){
		super(name);
		this.delay = delay;
	}
	
	public void run() {
		try {
			for(int i=0; i<5; i++) {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(delay);
			}
			
		}catch(Exception e) {
			System.out.println("error");
			return;
		}
		
	}
	public static void main(String[] args) {
		Ex2 ex1 = new Ex2("쓰레드 1",300);
		Ex2 ex2 = new Ex2("쓰레드 2",800);
		Ex2 ex3 = new Ex2("쓰레드 3",400);
		
		ex1.start();
		ex2.start();
		ex3.start();
	}
}
