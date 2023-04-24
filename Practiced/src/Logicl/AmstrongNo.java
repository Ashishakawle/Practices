package Logicl;

import java.util.Scanner;

public class AmstrongNo {

	public static void main(String[] args) throws InterruptedException {
	  int OrigalNo,sum,num,rem;
        @SuppressWarnings("resource")
		Scanner S=new  Scanner(System.in);
        System.out.println("Enter the Number");
         num=S.nextInt();
         OrigalNo=num;
        for(sum=0;num>0;num=num/10) {
        	rem=num%10;
        	sum=sum+rem*rem*rem;
        	Thread.sleep(2000);
        }
        if(sum==OrigalNo) {
        	System.out.println("Aemstrom Number"+sum); 	
        }	
        	else {
        		System.out.println("Not Aemstrom Number"+sum);	
       	}
	}

}
