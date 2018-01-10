package gui;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Screen {
	JFrame frame;
	JLabel backGorund;
	
	
	
	public Screen () {
		
	this.initialize();	
	}
	
	
	
	private void initialize() {
		
		//screen size
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)screenSize.getWidth();
		int height = (int) screenSize.getHeight();
		
		
		//frame
		frame = new JFrame();
		frame.setBounds(200, 200, 1050, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(false);
		frame.setBounds(0, 0, width/2, height-30);
		
		int frameHeight=frame.getHeight();
		int frameWidth=frame.getWidth();
		
		
		//image
		
		String s = null;
		try {
			s = (new java.io.File( "." ).getCanonicalPath()) + "//img//2018-zinciri-kirma.png";
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		backGorund = new JLabel("");
		ImageIcon imageIconum = new ImageIcon(s);
		Image imageim = imageIconum.getImage(); // transform it
		Image newimgim = imageim.getScaledInstance(frameWidth - 10, frameHeight - 10, java.awt.Image.SCALE_SMOOTH);
		imageIconum = new ImageIcon(newimgim);
		backGorund.setIcon(imageIconum);
		frame.getContentPane().add(backGorund);
		backGorund.setBounds(0, 0, frameWidth, frameHeight);
		
		
		frame.setVisible(true);
		
	    
	   
	
		
		
	
}
	

}
