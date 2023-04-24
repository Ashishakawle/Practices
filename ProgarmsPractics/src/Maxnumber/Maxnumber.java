package Maxnumber;

public class Maxnumber {
	
    public static void main(String[] args) {
		int arr[]= {1,2,5,6,4,8,9,45,78,18,99};
		int max=arr[0];
	for(int i=0;i<arr.length;i++) {
	 if(max<arr[i]) {
		 max=arr[i];
	 }}
	System.out.println(max);
	}
}  
