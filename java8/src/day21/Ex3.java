package day21;


public class Ex3 extends Thread {
	private int tot = 1_000_000;

	synchronized void deposit(int money) {
		if(tot - money<0) {
			Thread.currentThread().interrupt();
		}else {
			tot -=money;
			System.out.println(money + "원을 " + Thread.currentThread().getName() + "가 인출, 남은 잔액: " + gettot());
		}
}
	public int gettot() {
		return tot;
	}
}

class Customer extends Thread {
	Ex3 ex3;

	Customer(Ex3 ex3){
			this.ex3 = ex3;
		}
	@Override
	public void run() {
		while(true) {
			ex3.deposit(9800);
			if(interrupted()) {
				break;
			}
		}
	}
	}

