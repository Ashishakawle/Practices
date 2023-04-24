package Practics;

public class Repitedchar {
    
	public static void main(String[] args) {
		String S="ashish ashokrao kawale";
		@SuppressWarnings("unused")
		String A="";
		for(int i=0;i<S.length();i++) {
			int count=1+S.charAt(i);
		for(int j=i+1;j<S.length();j++) {
		 if(i==j) {
			 count ++; 
		 }
		 else break;
		}	
		if(count>1) {
			System.out.println(i+"==>"+count);
                  i+=(count-1);		
		}
	   }
  }	
}
