package Day12;

public class CarReturn {
	//�ʵ�
	int gas;
	
	//������ - �����Ǹ� �⺻ ������ ����
	
	//�޼ҵ�
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;	//false�� ����
		}
		System.out.println("gas�� �ֽ�����.");
		return true;	//true�� ����
	}
	
	void run() {
		while (true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�. (gas�ܷ�: " + gas + ")");
				gas -=1;
			}else {
				System.out.println("����ϴ�. (gas�ܷ�: " + gas + ")");
				System.out.println("�ӽ����");
				return;		//return�� ������ �޼ҵ�� �����ϰ� ��, ���� �Ʒ��ʿ��� �ڵ尡 ��������
			//	System.out.println("���� �� ���");
			}
		}
	}
}