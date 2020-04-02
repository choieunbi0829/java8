package day14;

public class Tire {

	int maxRotation;
	int accumulatedRotation;
	String location;
	
	Tire(String location, int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire ¼ö¸í: " + (maxRotation - accumulatedRotation) + "È¸");
			return true;
		}else {
			System.out.println("***" + location + "Tire ÆãÅ© ***");
			return false;
		}
	}
}
