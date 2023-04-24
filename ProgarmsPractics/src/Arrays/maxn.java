package Arrays;

public class maxn {

	public static void main(String[] args) {
	  int []arr= {1,11,12,15,14,16,18,20,22,56,71,92,88};
      int max=arr[0];
      for(int i=0;i<arr.length;i++) {
    	 if(max<arr[i]) {
    		 max=arr[i];
    	 }
      }
      System.out.println("Thise number is max in array :"+max);
	}
}
