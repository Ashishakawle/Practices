package logicalprogram;

public class Strarpattern {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {//row
			for(int j=1;j<=9;j++) {//coloum
				if(j<=i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
