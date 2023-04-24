package Palimdrom;

import java.util.Scanner;

public class PAlimd {

	public static void main(String[] args) {	
      int sum,num,org,rem;
      System.out.println("Enter any Numbers");
      @SuppressWarnings("resource")
	Scanner s=new Scanner(System.in);
      num=s.nextInt();
      org=num;
      for(sum=0;num>0;num=num/10) {
    	  rem=num%10;
    	  sum=sum*10+rem;
      }
      if(sum==org) 
    	  System.out.println("Its An Palimdrom Number");
      else
    	  System.out.println("Its Not A Palimdrom Number");
	}
}
