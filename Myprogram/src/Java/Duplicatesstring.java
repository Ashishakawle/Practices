package Java;

import java.util.Arrays;

public class Duplicatesstring {

	public static void main(String[] args) {
		String s="Assgijkghgf ktawawelre";
        char[]arr=s.toCharArray();
           Arrays.sort(arr);
            int count;
        for(int i=0;i<arr.length;i++) {
             count=1;
        for(int j=i+1;j<arr.length;j++) {
        	if(arr[i]==arr[j]) {
        		count++;
        	}}
        	if(count>=1&& arr[i]!=' ') {
        		System.out.println(arr[i]+":"+count);
        		i+=(count-1);	
        }
        }
        
	}

}
