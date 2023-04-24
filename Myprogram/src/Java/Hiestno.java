package Java;

public class Hiestno {

	public static void main(String[] args) {
		int Arr[]={11,55,11,2,3,4,8,9,4,8,99,9,40,105,222};
		int thid=0;
         int sec=0;
          int max=0;
        for(int i=0;i<Arr.length;i++)  {
         
        	if(Arr[i]>max) {
        		thid=sec;
        		sec=max;
           max=Arr[i];
           
        	}
          else if (Arr[i]>sec) {
        	  sec=Arr[i];  
          }
          else if(Arr[i]>thid){
        	  thid=Arr[i];
          }
        }
      
        System.out.println(max);
        System.out.println(sec);
        System.out.println(thid);
}
}
