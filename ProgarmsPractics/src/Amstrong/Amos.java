package Amstrong;

import java.util.Scanner;

public class Amos {

	public static void main(String[] args) {
		int org,sum,rem,num;
		System.out.println("Enter the value");
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		org=num;
		for(sum=0;num>0;num=num/10) {
			rem=num%10;
			sum=sum+rem*rem*rem;
		}
		if(sum==org) {
			System.out.println("Its An Amstrong NO.");
		}
		else
			System.out.println("Its Not Amstrong No");
	}
}
