package logicalprogram;

public class Duplicatenumebers {

	public static void main(String[] args) {
		int Arr[]= {1,3,7,9,6,5,11,21,14,2,4,10};      
		System.out.println("print befor duplication String");
		for(int i=0;i<Arr.length-1;i++) {			
			System.out.print(Arr[i]+" ");	
		}
		for(int j=0;j<Arr.length-1;j++) {
		for(int k=0;k<Arr.length-j-1;k++) {
			if(Arr[k]>Arr[k+1]) {
			int temp=Arr[j];
			Arr[j]=Arr[j+1];
			Arr[j+1]=temp;
		}
	  }	
	}
    System.out.println();  
    System.out.println("aftersorting");   
    for(int i=0;i<Arr.length;i++) {
    	System.out.print(Arr[i]+" ");
    }
      System.out.println();
      System.out.println(Arr[Arr.length-1]);
	}    
}
