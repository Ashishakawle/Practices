package Nicelogic;

import java.util.Scanner;

public class Palimdron {

	public static void main(String[] args) {
      int sum,num,org,rem;
      System.out.println("put value");
      @SuppressWarnings("resource")
	Scanner s=new  Scanner(System.in);
      num=s.nextInt();
      org=num;
      for(sum=0;num>0;num=num/10){
    	  rem=num%10;
    	  sum=sum*10+rem;
      }
       if(org==sum) {
    	   System.out.println("It's palimdron number");
       }
       else {
    	   System.out.println("It's not palimdron number");
     }
 }
}