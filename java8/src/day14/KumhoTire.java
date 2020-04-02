package day14;

public class KumhoTire  extends Tire{
	KumhoTire(String location, int maxRotation){
		super(location, maxRotation);
	}
	
	@Override
	boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire ����: " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		}else {
			System.out.println("***" + location + "KumhoTire ��ũ ***");
			return false;
		}
	}
}
