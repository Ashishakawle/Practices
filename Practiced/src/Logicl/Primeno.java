package Logicl;

public class Primeno {

	public static void main(String[] args) {
		int count=0;
		for(int i=2;i<=20;i++) {
		for(int j=1;j<=20;j++) {
			if(i%j==0) {
				count++;
			}}
		if(count==2) {
			System.out.print(" "+i);
		}
		count=0;
		}
		}
}
