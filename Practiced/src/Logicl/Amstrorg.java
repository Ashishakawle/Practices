package Logicl;
import java.util.Scanner;
public class Amstrorg {

	public static void main(String[] args) {
		
		//Example : 153 = 1+125+27  ==153
//				    122 = 1+8+8     ==17

				  int sum, Originalnumber,rem;
				 System.out.println("Enter a number");
			     @SuppressWarnings("resource")
				Scanner sc =new Scanner(System.in);// System.in is a standard input stream
				 int num=sc.nextInt();
				 Originalnumber=num;		//            153=153

				//   0    ;153>0 ;  153 =153/10 =15
				 for(sum=0;num>0;num=num/10) {
					rem=num%10;  //153 %10  = 3  5
					sum=sum+rem*rem*rem;  //27+125+1;  ==153
				//	0=0+3*3*3;  = 27			
			   //	
				 }
				 if(sum==Originalnumber) 
					 System.out.println("Armstrong number");
				 else
				System.out.println("Not armstrong number");		
			}

		}
	

