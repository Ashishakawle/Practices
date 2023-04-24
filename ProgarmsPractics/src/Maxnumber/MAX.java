package Maxnumber;

public class MAX {

	public static void main(String[] args) {
		int[] arr= {12,78,55,9,45,56,22,99,111,101};
         int max=arr[0];
         int Secondmax=arr[0];
         for(int i=0;i<arr.length;i++) {
        	 if(arr[i]>max) {
        		 Secondmax=max;
        		 max=arr[i];       		 
        	 }}
        	 System.out.println(max);
        	 System.out.println(Secondmax);
        }}

