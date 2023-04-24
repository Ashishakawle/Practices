package Maxnumber;

public class maxNUM {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,14,77,88,11,99,102,44};
         int max=arr[0];
      for(int i=0;i<arr.length;i++) {
    	 if(max<arr[i]) {
    		 max=arr[i];
    	 }}
      System.out.println(max);
	}

}
