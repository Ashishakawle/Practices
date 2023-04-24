package Amstrong;

import java.util.Scanner;

public class Amsr {

	public static void main(String[] args) {
	int sum,org,num,rem;
	System.out.println("Enter the Any Number");
     @SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
     num=sc.nextInt();
     org=num;
     for(sum=0;num>0;num=num/10) {
    	 rem=num%10;
//    	 sum=sum+rem*rem*rem;
    	 sum=sum*10+rem;
     }
     if(sum==org)
    	 System.out.println("Its An Amstrong number");
     else
    	 System.out.println("Its Not Amstrong nuber");
	}
}
