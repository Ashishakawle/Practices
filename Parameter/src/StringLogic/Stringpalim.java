package StringLogic;

import java.util.Scanner;

public class Stringpalim { 
	public static void main(String [] args) {
	String nm=" ";
	 System.out.println("Enter value");
	 @SuppressWarnings("resource")
	Scanner S=new Scanner(System.in);
	nm=S.next();
	for(int i=nm.length()-1;i>=0;i--){
	String rev="";
	rev=rev+nm.charAt(i);
	System.out.println(rev);
	
	if(rev.equals(nm)){
	System.out.println(" It's palimdrom string");
	}
	else{
	System.out.println(" It's not palimdrom string");
	}
   }
  }
}
