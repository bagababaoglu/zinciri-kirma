package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;





public class myLabel extends JLabel{

	
	
	
	 public myLabel(String msg) {

		    super(msg);

		    addMouseListener(new MouseAdapter() {
		        public void mouseClicked(MouseEvent me) {
		          if (myLabel.this.getText()=="X") {
		        	  
		        	  
		        	  myLabel.this.setText("");  	     
		        	  
		        	  
		        	  
		          }else {
		        	  
		        	  myLabel.this.setText("X");  	      
		          }
		          	
		        	
		        	
		        	
		        	
		        }
		      });
		    
	 }
	 
	 
}
