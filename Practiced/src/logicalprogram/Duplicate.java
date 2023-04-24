package logicalprogram;

 public class Duplicate {
	public static void main(String[] args) {
		int a[]={2,5,3,7,6,9,11,20,30};
         int flag=0;
		for(int j=0;j<a.length;j++) {
		 if(a[j]==0 || a[j]==1){
			 flag=1;
		 }
		 for(int i1=2;i1<a[j];i1++) {
			 if(a[j]%i1==0) {
				 flag=1;	
	 }
	}
	if(flag==1) {
		System.out.println(a[j]+"is not prime number");
		flag=0;
	}
	else {
		System.out.println(a[j]+"prime number");
	}
  }
 }
}