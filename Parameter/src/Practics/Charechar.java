package Practics;

public class Charechar {

	public static void main(String[] args) {
		for(int i=65;i<=90;i++) {
			System.out.print(" "+(char)i);
		}
		System.out.println();
		for(int i=66;i<=90;i=i+2) {

         System.out.println((char)i+" = "+(char)(i-1));
	}		
  }
}
