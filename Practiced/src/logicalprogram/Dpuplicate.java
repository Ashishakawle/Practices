package logicalprogram;

import java.util.Arrays;

public class Dpuplicate {
    public static void main(String[] args) {
	int arr[]= {1,2,3,1,3,5,11,2,4,5,5,5,6,6,8,9,7,11,11,};
	for(int k=0;k>arr.length;k++) {
		System.out.println(k);
	}
	 Duplicateelement(arr); 
  }
    public static void Duplicateelement(int a[]) {
    
    	Arrays.sort(a);
     for(int i=0;i<a.length;i++) {
    	 int count=1;
    	 for(int j=i+1;j<a.length;j++) {
    		 if(a[i]==a[j]) {
    			 count++;
    		 }
    		 else
    		 break;
    	 }
    	 if(count>=1) {
    		 System.out.println(a[i]+"==>"+count);
    		  i+=(count-1);
        }
     }
   }
}
