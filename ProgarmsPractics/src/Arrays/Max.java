package Arrays;

public class Max {

	public static void main(String[] args) {
	int []arr= {1,11,12,15,14,16,18,20,22,56,71,92,88};
    int max=arr[0];
    int Smax=arr[0];
    int tmax=arr[0];
    int fmax=arr[0];
    for(int i=0;i<arr.length;i++) {
    	if(max<arr[i]) {
    		fmax=tmax;
    		tmax=Smax;
    		Smax=max;
    		max=arr[i]; 
    	}	
    }
    System.out.println(max);
    System.out.println(Smax);
    System.out.println(tmax);
    System.out.println(fmax);
	}
}
