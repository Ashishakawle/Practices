package Logicl;

public class EachWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String st="Welcome to java and Selenium world";
           String[] words=st.split(" ");
           String Revst="";
           
           for(String w:words) {
        	   String Revrsword=" ";
        	   
        	   for(int i=w.length()-1;i>=0;i--) {
        		   Revrsword=Revrsword+w.charAt(i);
        	   }
        	 Revst=Revst+Revrsword+"";
           }
           System.out.println(Revst);
	}

}
