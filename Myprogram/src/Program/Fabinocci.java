package Program;

public class Fabinocci {

	public static void main(String[] args) {
	int a=0, b=1, c;
	int num=10;
       for(int i=1;i<=num;i++) {
    	 c=a+b;
         System.out.print(" "+c);
    	 a=b;
    	 b=c;
       }
	}

}
