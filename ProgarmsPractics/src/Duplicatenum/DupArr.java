package Duplicatenum;

import java.util.Arrays;

public class DupArr {

	public static void main(String[] args) {
		int Arr[]= {1,3,2,1,4,5,2,8,9,1};
		Arrays.sort(Arr);
        System.out.println("Print Afrore Array:");	  
       for(int i=0;i<Arr.length;i++) {
			int count=1;
       for(int j=i+1;j<Arr.length;j++) {
        	if(Arr[i]==Arr[j]) {
        		count++;  		 
        }
           else {
        	   break;	  		
           }   
           }	
        if(count>=1) {

         System.out.println(Arr[i]+"==>"+count);
         i+=(count-1);    	
     }
	}
	}
}
