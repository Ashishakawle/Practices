package Logicl;

import java.util.Scanner;

public class Palindronnumber {

	public static void main(String[] args) {
		int sum, originalno,rem;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
        int num=sc.nextInt();
		originalno=num;
		for(sum=0;num>0;num=num/10) {
			rem=num%10;
			sum=sum*10+rem;
		}
		if(originalno==sum)
			System.out.println(originalno+":It's palindrom No");
		else
			System.out.println(originalno+":It's not a palindrom no");
	
	}

}
