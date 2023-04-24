package Amstrong;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		int num,rem,org,sum;
		System.out.println("enter number");
       try (Scanner s = new Scanner(System.in)) {
		num=s.nextInt();
	}
         org=num;
         for(sum=0;num>0;num=num/10) {
        	rem=num%10;
        	sum=sum+rem*rem*rem;
         }
         if(sum==org) {
        	 System.out.println("Given Number is Amstrong number");
         }
         else
        	 System.out.println("Given Number is not Amstrong number");
	}

}
