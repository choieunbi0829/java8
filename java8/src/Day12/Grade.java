package Day12;

public class Grade {

	int kor;
	int eng;
	int mat;

	Grade(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	double avg() {
		int sum=kor + eng + mat;
		return sum/3.0;
	}
}
