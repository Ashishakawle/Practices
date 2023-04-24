package Logicl;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int num;
		System.out.println("put value");
		 @SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		       num=s.nextInt();
			//Example= 5*4*3*2*1 =120
	
				int Factorial =1;
				
				for(int i=1;i<=num;i++) {  //6*5*4*3*2*1 =720
					
					Factorial=Factorial*i;
				}
				System.out.println("Factorial of number is :"+Factorial);
			}

		}