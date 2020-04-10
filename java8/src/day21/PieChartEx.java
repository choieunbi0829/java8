package day21;

import java.awt.Color;

import javax.swing.JFrame;

public class PieChartEx {
	public static void main(String[] args) {
		JFrame f =new JFrame("파이차트");
		PieChart P = new PieChart();
		
		f.add(P);
		f.setSize(500,500);
		f.setBackground(Color.LIGHT_GRAY);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setVisible(true);
		
	}
}
