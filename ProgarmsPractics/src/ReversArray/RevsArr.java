package ReversArray;

public class RevsArr {

	public static void main(String[] args) {
	  int []arr={1,5,9,8,2,6,4,55,60,45,86,78,4,96,101};
	         System.out.println("Given array");
          for(int i=0;i<arr.length;i++) 
        	 System.out.print(arr[i]+" ");  
               System.out.println();
             System.out.println("After Rever Array");
          for(int i=arr.length-1;i>0;i--)
             System.out.print(arr[i]+" ");
	}
}
