package Amstrong;

import java.util.Scanner;

public class Anm {

	public static void main(String[] args) {
     int rem,sum,num,org;
     System.out.println("Enter the Number");
     try (Scanner sc = new Scanner(System.in)) {
		num=sc.nextInt();
	}
     org=num;
     for(sum=0;num>0;num=num/10) {
    	rem=num%10;
    	sum=sum+rem*rem*rem;
     }
     if(sum==org) {
    	 System.out.println("its an Amstrong number");
     }
     else
    	 System.out.println("its not an Amstrong number");
	}
}
