package logicalprogram;

public class DImandproblem {

	public static void main(String[] args) {
		int k=0;
        for(int i=1;i<=5;i++) {	  // ROW	 
			if(i<=3)
				k++;
			else
				k--;	
			for(int j=1; j<=5; j++) {	  // Col	
				if(j>=4-k && j<=2+k)   
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