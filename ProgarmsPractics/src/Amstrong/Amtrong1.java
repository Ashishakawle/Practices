package Amstrong;

import java.util.Scanner;

public class Amtrong1 {

	public static void main(String[] args) {
		 int  num,rem, org,sum;
     System.out.println("Enter Any number");
     @SuppressWarnings("resource")
	Scanner S=new Scanner(System.in);
       num=S.nextInt();
       org=num;
       for(sum=0;num>0;num=num/10) {
    	  rem=num%10;
    	  sum=sum+rem*rem*rem;
       }
       if(org==sum) {
    	   System.out.println("Its An amstrong number");
       }
       else
    	   System.out.println("Its not amstrong number");
	}
}
