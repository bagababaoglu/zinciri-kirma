package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;



public class Screen extends JFrame{
	JPanel contentPane;
	JLabel backGorund;
	myLabel [] xlabels=null; 
	Font f=new Font ("Arial", Font.PLAIN, 45);
    	
	public Screen () {
		
	this.initialize();	
	}
	
	
	
	private void initialize() {
		
		//screen size
		

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)screenSize.getWidth();
		int height = (int) screenSize.getHeight();
		int frameHeight=height-80;
		int frameWidth=width/2;
				
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 1050, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setBounds(width/2-(frameWidth/2), 0,frameWidth ,frameHeight );
		
	
		
		
		//image
		

		Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath().toString() +"//img//2018-zinciri-kirma.png";
		backGorund = new JLabel("");
		ImageIcon imageIconum = new ImageIcon(s);
		Image imageim = imageIconum.getImage(); // transform it
		Image newimgim = imageim.getScaledInstance(frameWidth - 20, frameHeight - 10, java.awt.Image.SCALE_SMOOTH);
		imageIconum = new ImageIcon(newimgim);
		backGorund.setIcon(imageIconum);
		contentPane.add(backGorund);
		backGorund.setBounds(0, 0, frameWidth, frameHeight);
	
		initializeLabels ();
		
	
		
			
		}
	
	
	
	
	
      
		
		
    private void initializeLabels () {
    	xlabels=new myLabel [365]; 
    	int x=97;
		int y =175;
		

		int tempx=x;
		
		int xshift=61;
		int yshift =29;
		
		int widthlb=40;
		int heightlb=40;

        for (int i=0; i< 365; i++) {
			
			
			if (i==0) {
				
				xlabels [i]= new myLabel("");
				xlabels[i].setBounds(x, y, widthlb, heightlb);
				xlabels[i].setFont(f);
				xlabels[i].setAlignmentY(SwingConstants.CENTER);
				xlabels[i].setAlignmentX(SwingConstants.CENTER);
				xlabels[i].setForeground(Color.RED);
				contentPane.add(xlabels[i]);
			
				
				
			}else if ((i%14)!=0 ) {
				    tempx=tempx+xshift;
					xlabels [i]= new myLabel("");
					xlabels[i].setBounds(tempx, y, widthlb, heightlb);
					xlabels[i].setFont(f);
					xlabels[i].setAlignmentY(SwingConstants.CENTER);
					xlabels[i].setAlignmentX(SwingConstants.CENTER);
					xlabels[i].setForeground(Color.RED);
					contentPane.add(xlabels[i]);
				
				
				
				
				
			}else {
              tempx=x;
              y=y+yshift;
              xlabels [i]= new myLabel("");
			  xlabels[i].setBounds(tempx, y, widthlb, heightlb);
			  xlabels[i].setFont(f);
			  xlabels[i].setAlignmentY(SwingConstants.CENTER);
			  xlabels[i].setAlignmentX(SwingConstants.CENTER);
			  xlabels[i].setForeground(Color.RED);
			  contentPane.add(xlabels[i]);
			
				
				
			}
    	
    	
    	
    	
    	
    	
    	
    }

		
		
	
		
		setVisible(true);
		
	    
	   
	
		
		
	
}
	

}
