package Program;

public class Dupp {

 public static void main(String[] args) {
		int arr[]= {2,2,2,8,8,8,4,4,5,6,9,9,9,5,1};
//		int arr[]= {1,2,89,6,32,4,89,6,32,5,4,89,6,5,2};
        int count=0;
        for(int i=0;i<arr.length;i++) {
         count=1;
        for(int j=i+1;j<arr.length;j++) {
        if(arr[i]==arr[j]&& arr[i]!=0) {
        	 count++;
        }
       }
       if(count>=1) {
    	 System.out.println(" "+arr[i]+":"+count);  
    	 i+=(count-1);
       }	}
 }
}
