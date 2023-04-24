package Nicelogic;

public class Swapingstring {

	public static void main(String[] args) {
		String a="ashish kawale";
		String b="mahesh chaudhari";
		System.out.println("Without swaping :"+a);
		System.out.println("Without swaping :"+b);
		System.out.println();

        System.out.println("swaping a:"+b.replaceFirst(a, b));
		System.out.println("swaping b:"+a.replaceFirst(b, a));
			
	}

}
