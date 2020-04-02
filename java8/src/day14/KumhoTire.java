package day14;

public class KumhoTire  extends Tire{
	KumhoTire(String location, int maxRotation){
		super(location, maxRotation);
	}
	
	@Override
	boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire ¼ö¸í: " + (maxRotation - accumulatedRotation) + "È¸");
			return true;
		}else {
			System.out.println("***" + location + "KumhoTire ÆãÅ© ***");
			return false;
		}
	}
}
