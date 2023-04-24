package LogicProPra;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		System.out.println("Enter number");
		int sum,num,org,rem;
try (//		num=153;
		Scanner s = new Scanner(System.in)) {
			num=s.nextInt();
		}
          org=num;
      for(sum=0;num>0;num=num/10) {
    	  rem=num%10;
    	  sum=sum+rem*rem*rem;
      }
      if(sum==org) {
    	  System.out.println("Its Amstrong Number: "+sum);
      }
      else {
    	  System.out.println("Its NotAmstrong Number: "+sum);
      }
	}

}
