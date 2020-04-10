package day21;

public class Ex3ex extends Thread{
	public static void main(String[] args) {
		Ex3 ex3 = new Ex3();
		Customer cust[] = new Customer[4];
		for(int i=0; i<4; i++) {
			cust[i] = new Customer(ex3);
			cust[i].start();
		}
		for(int i =0; i<4; i++) {
			try {
				cust[i].join();
			}catch(InterruptedException e) {
			}
		}
		System.out.println("ÀÜ¾×Àº : " + ex3.gettot());
	}
}

