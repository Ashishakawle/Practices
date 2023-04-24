package Nicelogic;

public class Separeted {
	 
	public static void main(String[] args) {
		String S="ABCDEFG123";
		Separeted D=new Separeted();
	      D.demo(0, 4, S);
	      D.demo(4, 7, S);
	      D.demo(7, 10, S);
	}
    public void demo(int startindex,int endindex,String s) {
    	char ch;
    	String temp="";
    	for(int i=startindex;i<endindex;i++) {
    		ch=s.charAt(i);
    		temp=temp+ch;
    	}
    	System.out.println(temp);
    }
}
