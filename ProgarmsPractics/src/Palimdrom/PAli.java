package Palimdrom;

import java.util.Scanner;

public class PAli {

	public static void main(String[] args) {
		int sum,num,rem,org;
		System.out.println("Eter any number");
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
         org=num;
         for(sum=0;num>0;num=num/10) {
        	 rem=num%10;
        	 sum=sum*10+rem;
         }
        	 if(sum==org) {
        		 System.out.println("It's A Palimdrom number");
        	 }
        	 else
        		 System.err.println("It's Not A Palimdrom number");
	}

}
