package LogicProPra;

import java.util.Scanner;

public class Palimdrom {

	public static void main(String[] args) {
		System.out.println("Enter number");
		int sum,num,rem,org;
		try (Scanner s = new Scanner(System.in)) {
			num=s.nextInt();
		}
          org=num;
       for(sum=0;num>0;num=num/10) {
    	  rem=num%10;
    	  sum=sum*10+rem;
       }
     if(sum==org) {
   	  System.out.println("Its Palimdrom Number: "+sum);
     }
     else {
   	  System.out.println("Its Palimdrom Number: "+sum);
     }
	}

}
