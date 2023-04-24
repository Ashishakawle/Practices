package Palimdrom;

import java.util.Scanner;

public class Palimdromi {

	public static void main(String[] args) {
	  int sum,num,org,rem;
	  System.out.println("Enter Any numebr");
	  @SuppressWarnings("resource")
	Scanner s=new Scanner(System.in);
	  num=s.nextInt();
      org=num;
      for(sum=0;num>0;num=num/10) {
    	  rem=num%10;
    	  sum=sum*10+rem;
      }   
      if(sum==org) {
    	  System.out.println("It An Palimdrom number");
      }
      else
    	  System.out.println("It not Palimdrom number");
	}
}
