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
				cust[i].join();			//10���� �����带 ��ٸ��� ������ �ϴ� ��
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("�Ѿ��� : " + acc.gettot());
			
	}
}
