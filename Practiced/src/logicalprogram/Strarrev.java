package logicalprogram;

public class Strarrev {

	public static void main(String[] args) {
	for(int i=1;i<=5;i++) {	  // ROW	 
			
			for(int j=1; j<=9; j++) {	  // Col	
		       if(j>=i && j<=10-i) 
		    	   if(j>=6-i && j<=4+i) 
			       {		
			    	   System.out.print("*");               	                           
		       }
		       else {
		    	   System.out.print(" ");
		       }	
			}
			System.out.println();
		}

	}
}
