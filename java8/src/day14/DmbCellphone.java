package day14;

public class DmbCellphone extends Cellphone {
	int channel;
	
	DmbCellphone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("DMB�� �մϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB�� ���ϴ�.");
	}
	void setChannel(int channel) {
		this.channel = channel;
		System.out.println(channel + "���� ä���� �����մϴ�.");
	}
}
