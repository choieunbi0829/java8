package day20;

public class StatePrintThread extends Thread{
	private Thread targetThread;
	
	public StatePrintThread(Thread tarhetThread) {
		this.targetThread = tarhetThread;
	}
	
	public void run() {
		while(true) {		//스레드 상태를 0.5초에 한번씩 출력
				Thread.State state = targetThread.getState();
				System.out.println("타겟 스레드 상태: " + state);
				if(state == Thread.State.NEW) {
					targetThread.start();
				}
				if(state == Thread.State.TERMINATED) {
					break;
				}
				try {
					Thread.sleep(500);		//0.5초간 일시정지
				} catch(Exception e) {}
		}
	}
	
}
