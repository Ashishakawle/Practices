package Nicelogic;

public class Revercharinstring {

	public static void main(String[] args) {
         String st="Hello java open";
         String []words=st.split(" ");
         String revwords="";
          
         for(String a:words) {
        	 String rev=" ";
        	 for(int i=a.length()-1;i>=0;i--) {
        	 rev=rev+a.charAt(i);
        	}
        	 revwords= rev+revwords+" ";
         }
         System.out.println(revwords);
	}
 
}
