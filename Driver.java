import java.awt.Graphics;

import javax.swing.JFrame;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame myFrame = new JFrame();
		myFrame.setSize(1000,800);
		
		Graphic red = new Graphic();
		myFrame.add(red);
		myFrame.setVisible(true);
	}

}
