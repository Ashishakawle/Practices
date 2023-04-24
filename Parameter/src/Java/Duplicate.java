package Java;

import java.util.Arrays;

public class Duplicate {

	public static void main(String[] args) {
		int count=0;
		int Arr[]= {2, 2, 2, 4, 4, 4, 5, 5, 6, 8, 8, 9};
		Arrays.sort(Arr);
        System.out.println("Print Afrore Array:");	  
       for(int i=0;i<Arr.length;i++) {
			 count=1;
        for(int j=i+1;j<Arr.length;j++) {
        	if(Arr[i]==Arr[j]) {
        		count++;
        }
        else
        break;	     		
        }
        if(count>=1) {
         System.out.println(Arr[i]+"==>"+count);
         i+=(count-1);
        }
	}
  }
}