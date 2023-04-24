package StringLogic;

import java.util.Scanner;

public class NewAmstrong {

	public static void main(String[] args) {
	 int sum,rem,num,org;
	 System.out.println("Enter value");
	@SuppressWarnings("resource")
	Scanner S=new Scanner(System.in);
     num=S.nextInt();
     org=num;
     for(sum=0;num>0;num=num/10) {
      rem=num%10;
      sum=sum+rem*rem*rem;
     }
     if(sum==org) {
    	System.out.println("Amtrong Number");
     }
     else {
    	 System.out.println("Not Amstrong number");
     }
	}

}
