package StringLogic;

import java.util.Scanner;

public class NewPalindrom {

	public static void main(String[] args) {
		int sum,num,rem,org; 
		System.out.println("Enter value");
		@SuppressWarnings("resource")
		Scanner S=new Scanner(System.in);
		 num=S.nextInt();
		 org=num;
		for(sum=0;num>0;num=num/10) {
			rem=num%10;
		sum=sum*10+rem;
		}
       if(sum==org) {
    	   System.out.println(" palimdron number");
       }
       else {
    	   System.out.println("Not palimdrom number");
       }
	}

}
