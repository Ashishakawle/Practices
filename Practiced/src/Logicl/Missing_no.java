package Logicl;

public class Missing_no {

	public static void main(String[] args) {
		//Element should not duplicate
//		sorted.order
//		Array should be in range
	int a[]= {11,12,15,14,18,16,17,19,20};
	int sum=0;
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
	}
   System.out.println("Sum of array :"+sum);
   
   int sum1=0;
   for(int i=11;i<=20;i++) {
	   sum1=sum1+i;
   }
   System.out.println("Sum of Range element :"+sum1);
   
   System.out.println("Missing no is :"+(sum1-sum));
   
	}

}
