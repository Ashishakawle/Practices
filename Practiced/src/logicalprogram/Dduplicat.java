package logicalprogram;

import java.util.Arrays;

public class Dduplicat {

	public static void main(String[] args) {
		int Arr[]= {1,2,5,3,6,5,6,9,8,7,0,8,9,4,5};
		Arrays.sort(Arr);
        System.out.println("Print Afrore Array:");	  
       for(int i=0;i<Arr.length;i++) {
			int count=1;
       for(int j=i+1;j<Arr.length;j++) {
        	if(Arr[i]==Arr[j]) {
        		count++;  		 
        }
           else
        	break;	  		
        }
        if(count>=1&& Arr[i]!='0') {
         System.out.println(Arr[i]+"==>"+count);
         i+=(count-1);
        }
	}
  }
}
