package Nicelogic;

import java.util.Scanner;

public class Fabinaccisere {

	public static void main(String[] args) {
		int num=0, org=1,c;
		System.out.println("print value");
    	@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
			num=s.nextInt();
		     org=num;
      for(int i=1;i<=10;i++) {
    	  c=num+org;
    	  System.out.println(""+c);
    	  num=org;
    	  org=c;
      }
	}

}
