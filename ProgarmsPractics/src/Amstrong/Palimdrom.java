package Amstrong;

import java.util.Scanner;

public class Palimdrom {

	public static void main(String[] args) {
		int num,rem,org,sum;
		System.out.println("enter number");
       try (Scanner s = new Scanner(System.in)) {
		num=s.nextInt();
	}
         org=num;
         for(sum=0;num>0;num=num/10) {
        	rem=num%10;
        	sum=sum*10+rem;
         }
         if(sum==org) {
        	 System.out.println("Given Number is Palimdrom number");
         }
         else
        	 System.out.println("Given Number is not Palimdrom number");
	}

}