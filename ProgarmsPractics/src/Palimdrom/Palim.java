package Palimdrom;

import java.util.Scanner;

public class Palim {

	public static void main(String[] args) {
	int num,org,rem,sum;
     System.out.println("Enter Any number");
     @SuppressWarnings("resource")
	Scanner s=new Scanner(System.in);
     num=s.nextInt();
     org=num;
     for(sum=0;num>0;num=num/10) {
    	rem=num%10;
    	sum=sum*10+rem;
     }
     if(org==sum) {
    	 System.out.println("its Palimdrom number");
     }
     else
    	 System.out.println("its not Palimdrom number");
	}
}
