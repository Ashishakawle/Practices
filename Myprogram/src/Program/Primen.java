package Program;

import java.util.Scanner;

public class Primen {

	public static void main(String[] args) {
		int count=0;
		System.out.println("enter num");
		try (Scanner s = new Scanner(System.in)) {
			@SuppressWarnings("unused")
			int	num=s.nextInt();
		}
	for(int i=2;i<=10;i++) {
		for(int j=1;j<=10;j++) {
		 if(i%j==0) {
			 count++;
	 }}
		 if(count==2) {
			 System.out.print(" "+i);
		 }
		 count=0;
	}
	}
//	public static void main(String[] args) {
//		int num=29;
//		boolean Pnum=false;
//		for(int i=2;i<=num/2;i++) {
//			if(num%i==0) {
//		    Pnum=true;
//		    break;
//			}}
//			if(!Pnum) 
//				 System.out.println(num + " is a prime number.");
//			
//			else
//				 System.out.println(num + " is Not a prime number.");
//	}
}