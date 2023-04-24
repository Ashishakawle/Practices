package Maxnumber;

public class Maxxx {

	public static void main(String[] args) {
		int arr[]= {11,55,88,85,89,99,102,111,151};
		int max=arr[0];
		int second=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<=arr[i]) {
				second=max;
				max=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(second);
	}
}
