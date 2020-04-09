package day20;

public class StatePrintThread extends Thread{
	private Thread targetThread;
	
	public StatePrintThread(Thread tarhetThread) {
		this.targetThread = tarhetThread;
	}
	
	public void run() {
		while(true) {		//������ ���¸� 0.5�ʿ� �ѹ��� ���
				Thread.State state = targetThread.getState();
				System.out.println("Ÿ�� ������ ����: " + state);
				if(state == Thread.State.NEW) {
					targetThread.start();
				}
				if(state == Thread.State.TERMINATED) {
					break;
				}
				try {
					Thread.sleep(500);		//0.5�ʰ� �Ͻ�����
				} catch(Exception e) {}
		}
	}
	
}
