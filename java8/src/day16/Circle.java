package day16;

public class Circle {
	static final double PI =3.14;	//�������
	int r;
	
	
	double area(int r) {
		this.r = r;
		return PI*r*r;
		
	}
	
	String showCircle(){
		return "Radius: " + r;
	}
}
