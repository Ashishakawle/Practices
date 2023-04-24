package Program;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		System.out.println("Enter no");
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int count=0;
		for(int i=2;i<=num;i++) {
		for(int j=1;j<=num;j++) {
		 if(i%j==0) {
			 count++;
		 } }
		 if(count==2) {
			 System.out.print(" "+i);
		 }
		 count=0;
		}
		}

	}


