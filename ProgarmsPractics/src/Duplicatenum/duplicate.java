package Duplicatenum;

import java.util.Arrays;

public class duplicate {

	public static void main(String[] args) {
		int []arr= {1,8,7,9,5,4,6,2,1,5,6,4,4,8,7,5};
		Arrays.sort(arr);
	
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>=0) {
				System.out.println(arr[i]+"==>"+count);
				i+=(count-1);
			}
		}
	}

}
