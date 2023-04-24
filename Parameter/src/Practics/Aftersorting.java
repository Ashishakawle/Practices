package Practics;

public class Aftersorting {

	public static void main(String[] args) {
		int arr[]= {10,9,8,7,6,11,5,2,1};
		System.out.println("Before Sorting");
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("After Sorting");
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		System.out.println();
	   System.out.println(arr[arr.length-1]);
	}

}
