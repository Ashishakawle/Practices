package Revers;

public class reves1 {

	public static void main(String[] args) {
		String str="Ashish Ashokrao kawale";
		    char ch[]=str.toCharArray();  
		    String rev="";  
		    for(int i=ch.length-1;i>=0;i--){  
		        rev+=ch[i];  
		    }   
		    System.out.println(rev);
		}
	
}
