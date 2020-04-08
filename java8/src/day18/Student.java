package day18;

public class Student {
	private String name;
	private int englisgScore;
	private int mathScore;

	public Student(String name, int englisgScore, int mathScore) {
		this.name = name;
		this.englisgScore = englisgScore;
		this.mathScore = mathScore;
	}

	public String getName() {
		return name;
	}

	public int getEnglisghScore() {
		return englisgScore;
	}

	public int getMathScore() {
		return mathScore;
	}
}
