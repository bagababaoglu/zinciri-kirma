package saveload;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import gui.myLabel;




public class SaverAndLoader {

	
	int saveIndex;
	
	
	
	public SaverAndLoader () {
		
		this.saveIndex=0;
		
		
		
		
	}
	
	
	
	
	
	
	
	 private boolean saveGame (int temp, myLabel[] labels) {
		 if (temp ==6) {
			 saveIndex=0;
			 
		 }else {
			 
			 saveIndex=temp;
		 }
	    	
		      try {
		      
		         // open input stream test.txt for reading purpose.
		    	String current = new java.io.File( "." ).getCanonicalPath();
		        BufferedWriter bw = new BufferedWriter( new FileWriter( (current+"/saves/"+saveIndex+".txt")));
		        
	            String s = arrayToString (labels);
	            
	            bw.write(s);
		      
		        bw.close();
		        
			
			
				
		      } catch(Exception e) {
		         e.printStackTrace();
		      
		      }
		      return true;
		   }
	 
	 
	 
	 
	 private myLabel [] loadGame (int li) {
		 try {
		      
	         // open input stream test.txt for reading purpose.
			   String current = new java.io.File( "." ).getCanonicalPath();				  
			   FileInputStream f = new FileInputStream((current+"/saves/"+"saves"+li+".txt"));
			   InputStreamReader reader = new InputStreamReader(f);
			   BufferedReader br = new BufferedReader (reader);
			   
			   
			   String Line = br.readLine();
		       String[] lines =Line.split("  ");;	
		       br.close(); 
		       
		       int  [] xs =readX(lines);
		       
		       
		       
                 
                
		  	         
	         
	      } catch(IOException e ) {
	     System.out.println("Specified file does not exist");
	      }
		 
		 return null;
		 
	   }
		 
		 
		 
		 
	 

	 
	 public String arrayToString(myLabel[] a) {
			String s = "";
		
			for (int i = 0; i < a.length; i++) {
				
				if (a[i].getText()=="X") {
					
					s = s + 1 + "  ";
					
				}else {
					s = s + 0 + "  ";
					
				}
				
				
				

			}

			return s;
		}
	
	
	 private int[] readX(String [] lines) {
			
			
			myLabel [] temp = new  myLabel[365];
			
			for (int k=0; k< lines.length; k++) {
			
				
			
				
			}
				
			
			return null;
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
