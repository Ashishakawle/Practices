package Java;

import java.util.Arrays;

public class Snippet {
	public static void main(String[] args) {
//		int []Array= {1,2,89,6,32,4,89,6,32,5,4,89,6,5,2};
//        int count=0;
//        for(int i=0;i<Array.length;i++) {
//        	count=1;
//        for(int j=i+1;j<Array.length;j++) {
//         if(Array[i]==Array[j]&&Array[i]!=0) {
//        	 count++;
//         }
//        }
//        if(count>=1) {
//        	System.out.println(" "+Array[i]+"==>"+count);
//        i+=(count-1);	
//        }
//        }
//String s="ashish Ashokrao kawale";	
String s="Assgiashish komal mayuri ktawawelre";
char []snm=s.toCharArray();	
Arrays.sort(snm);
  int count;		
 for(int i=0;i<snm.length;i++) {
	 count=1;
 for(int j=i+1;j<snm.length;j++) {
 if(snm[i]==snm[j]) {
	 count++;
 }
 }
 if(count>=1) {
	 System.out.println(snm[i]+"==>"+count);
	i+=(count-1); 
 }
  }
   }
}

