package day14;

public class CellphoneEx {
	public static void main(String[] args) {
		DmbCellphone dcp = new DmbCellphone("������S20", "����", 10);
		
		dcp.powerOn();								//�θ��� �޼���
		dcp.bell();									//�θ��� �޼���
		dcp.sendVoice("��������.");					//�θ��� �޼���
		dcp.receiveVoice("�ù��Դϴ�.");			//�θ��� �޼���
		dcp.sendVoice("�� �տ� �����ּ���.");		//�θ��� �޼���
		dcp.receiveVoice("�˰ڽ��ϴ�.");			//�θ��� �޼���
		dcp.hangUp();								//�θ��� �޼���
		dcp.turnOnDmb();							//�ڽ��� �޼���
		dcp.setChannel(100);						//�ڽ��� �޼���
		dcp.turnOffDmb();							//�ڽ��� �޼���
		dcp.powerOff();								//�θ��� �޼���
		
		
		Cellphone cp = new Cellphone();
		cp.powerOn();
//		cp.turnOnDmb();				//�θ��� ��ü�� �ڽ��� �ν��Ͻ� ����� ȣ�� �� �� ����.
		cp.powerOff();
		
	}
}
