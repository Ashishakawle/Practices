package Arrays;

public class AMaxnumber123 {

	public static void main(String[] args) {
	int[] arr= {1,22,4,5,55,56,16,78,24,89,19,66};
     int Max=arr[0];
     int max2nd=arr[0];
     int max3=arr[0];
     for(int i=0;i<arr.length;i++) {
    	if(arr[i]>Max) { 
    		max3=max2nd;
    		max2nd=Max;
    		Max=arr[i];
    	
		
    	}}
    	System.out.println(Max);
    	System.out.println(max2nd);
    	System.out.println(max3);
	}
}
