package Amstrong;

import java.util.Scanner;

public class Amsto {

	public static void main(String[] args) {
		System.out.println("Enter Any number");
		int num,sum,rem,org;
         @SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
         num=s.nextInt();
         org=num;
         for(sum=0;num>0;num=num/10) {
        	 rem=num%10;
        	 sum=sum+rem*rem*rem;
         }
         if(sum==org) {
        	 System.out.println("It's a Amstrong Number");
         }
         else
        	System.out.println("It's Not a Amstrong Number"); 
	}
}
