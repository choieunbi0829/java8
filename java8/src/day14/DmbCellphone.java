package day14;

public class DmbCellphone extends Cellphone {
	int channel;
	
	DmbCellphone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("DMB를 켭니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB를 끕니다.");
	}
	void setChannel(int channel) {
		this.channel = channel;
		System.out.println(channel + "으로 채널은 변경합니다.");
	}
}
