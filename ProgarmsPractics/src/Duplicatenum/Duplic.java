package Duplicatenum;

import java.util.Arrays;

public class Duplic {

	public static void main(String[] args) {
		int arr[]= {1,2,4,5,9,8,7,5,6,4,5,3,2,1,2,5,8,4,8};
       Arrays.sort(arr); 
       for(int i=0;i<arr.length;i++) {
    	   int count=1;
       for(int j=i+1;j<arr.length;j++) {
    	 if(arr[i]==arr[j]) {
    		 count++;
    	 }
       }
       if(count>0) {
    	   System.out.println(arr[i]+"==>"+count);
    	 i+=(count-1);  
       }
       }}
}
