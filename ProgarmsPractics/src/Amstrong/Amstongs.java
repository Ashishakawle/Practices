package Amstrong;

import java.util.Scanner;

public class Amstongs {

	public static void main(String[] args) {
		System.out.println("Enther the Number");
         int sum,num,org,rem;
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
         num=s.nextInt();
         org=num;
       for(sum=0;num>0;num=num/10) {
    	 rem=num%10;
    	 sum=sum+rem*rem*rem;
//    	 sum=sum*10+rem;
       }
	if(sum==org) {
		System.out.println("This Number is a Amstrong");
	}
	else
		System.out.println("This Number is not a Amstrong");	
}
}