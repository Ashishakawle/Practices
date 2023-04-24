package Program;

import java.util.ArrayList;

public class convergan {

	public static void main(String[] args) {
//		int num=50012;
//		int r;
//		ArrayList<Integer> arr=new ArrayList<>();
//    	  arr.add(num % 10);
//    		num /=10;
//    	while(num > 0);	
//    		
//    	 
//    	 System.out.println(num);
//      }
		int temp = 100121;
		ArrayList<Integer> array = new ArrayList<Integer>();
		do{
		    array.add(temp % 10);
		    temp /= 10;
		} while  (temp > 0);
		System.out.println(array);
	}
}
