package Duplicatenum;

import java.util.Arrays;

public class Dupli {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6,8,9,2,5,6,4,7,8,9,2,2,4,8,6};

		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			int count=1;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
			}
		}
		if(count>0) {
			System.out.println(arr[i]+"==>"+count);
			i+=(count-1);
		}
		}
	}
}
