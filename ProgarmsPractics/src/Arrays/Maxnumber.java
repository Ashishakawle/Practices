package Arrays;

 public class Maxnumber {
	public static void main(String[] args) {
		int []arr= {1,2,3,5,6,4,7,8,9,11,1,15};
		int max= arr[0];
         for(int i=0;i<arr.length;i++) {
        	if(arr[i]>max) {
        		max=arr[i];
        	}}
        	System.out.println("Thise number is max in array :"+max);  
	}
 }
