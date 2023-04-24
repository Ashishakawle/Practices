package Program;

public class Palimdrom {

	public static void main(String[] args) {
		int sum,num,rem,org;
		num=121;
		org=num;
	for(sum=0;num>0;num=num/10) {
		rem=num%10;
		sum=sum*10+rem;
	}
	if(sum==org) {
		System.out.println("Palimdrom no");
	}
	else
		System.out.println("Not palimdrom no");
        
	}

}
