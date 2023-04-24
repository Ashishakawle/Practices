package Logicl;

public class Sum_of_digit {

	public static void main(String[] args) {
		int sum,num=145639856;
		for(sum=0;num>0;num=num/10) {
			sum=sum+num%10;
		}
        System.out.println("Sum of all digit :"+sum);
	}

}
