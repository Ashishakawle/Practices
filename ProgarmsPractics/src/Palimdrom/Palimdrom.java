package Palimdrom;

import java.util.Scanner;

public class Palimdrom {

	public static void main(String[] args) {
	int num,sum,org,rem;
	System.out.println("Enter any number");
     @SuppressWarnings("resource")
	Scanner s=new Scanner(System.in);
     num=s.nextInt();
     org=num;
     for(sum=0;num>0;num=num/10) {
    rem=num%10;
    sum=sum*10+rem;
     }
     if(org==sum) {
      System.out.println("its and palimdrom number"+sum);	 
     }
     else
    	 System.out.println("its not palimdrom number"+","+sum);
	}
}
