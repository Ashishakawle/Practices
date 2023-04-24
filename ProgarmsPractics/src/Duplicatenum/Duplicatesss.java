package Duplicatenum;

import java.util.Arrays;

public class Duplicatesss {

	public static void main(String[] args) {
	 int arr[]= {1,2,5,4,8,9,3,4,5,8,9,4,5,1};
		Arrays.sort(arr);
		int count=0;
     for(int i=0;i<arr.length;i++) {
    	 count=0;
     for(int j=i+1;j<arr.length;j++) {
      if (arr[i]==arr[j]) {	
    	  count++;
     }
     }
     if(count>1)
     System.out.println(arr[i]+"==>"+count);
     i+=(count-1);
	}
}}
