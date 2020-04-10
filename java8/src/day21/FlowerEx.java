package day21;

import java.awt.Color;

import javax.swing.JFrame;

public class FlowerEx {
	public static void main(String[] args) {
		JFrame f =new JFrame("²É±×¸®±â");
		Flower F = new Flower();
		
		f.add(F);
		f.setSize(500,500);
		f.setBackground(Color.LIGHT_GRAY);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setVisible(true);

	}
}
