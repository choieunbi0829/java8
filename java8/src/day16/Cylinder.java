package day16;

public class Cylinder extends Circle {
	int height;

	Cylinder(int r, int h){
		super();
		this.height = h;
	}

	double volume(int r) {
		int area = 0;
		return area*height;	
	}

	String showCylinder() {
		return showCircle() + ", Height = " + height;
	}
}
