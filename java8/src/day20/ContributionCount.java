package day20;

public class ContributionCount {
	public static void main(String[] args) {
		Account acc = new Account();
		Customer cust[] = new Customer[10];
		for(int i=0; i<10; i++) {
			cust[i] = new Customer(acc);
			cust[i].start();
		}
		for(int i=0; i<10; i++) {
			try {
				cust[i].join();			//10개의 스레드를 기다리게 메인이 하는 것
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("총액은 : " + acc.gettot());
			
	}
}
