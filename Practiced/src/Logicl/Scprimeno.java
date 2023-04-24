package Logicl;

import java.util.Scanner;

public class Scprimeno {

	public static void main(String[] args) {
		int count=0;
		System.out.println("put value");
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
       for(int i=2;i<=num;i++) {
    	   for(int j=1;j<=num;j++) {
    		  if(i%j==0) {
    			  count++;
    		  }
    	   }
    	   if(count==2) {
    		   System.out.println(i);
    	   }
    	   count=0;
       }
	}
}
