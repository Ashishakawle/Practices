package Arrays;

public class Max01 {

	public static void main(String[] args) {
		int[] Arr= {1,12,1,415,14,88,99,864,789,25,999};

		int max=Arr[0];
		int Semax=Arr[0];
		for(int i=0;i<Arr.length;i++) {
         if(max<Arr[i]) {
        	 Semax=max;
			max=Arr[i];
		}
         }
		System.out.println(max);
		System.out.println(Semax);
	}
}
