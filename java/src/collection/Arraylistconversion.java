package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylistconversion{


	public static void main(String[] args) {
		
		int [] arr= {1,2,3,4,5};
		
		for(int value:arr) {
			System.out.println(value);
		}
	
		//Convert array into arraylist
		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList<Integer> AL=new ArrayList(Arrays.asList(arr));
		System.out.println(AL);
	
	}
	}

