package Logicl;

import java.util.Scanner;

public class Primenumbers {
	
	public static void main(String[] args) {
		System.out.println("enter number");
		@SuppressWarnings("resource")
		Scanner s =new Scanner(System.in);
		int count=0,num;
		  num=s.nextInt();
		for(int i=2;i<=num;i++) {
		for(int j=1;j<=num;j++){
			if(i%j==0) {
			 count++;
			}	
			}
			if(count==2) {
				System.out.println(" Prime no : "+i);
			}
	        count=0;
		}

	}

}
