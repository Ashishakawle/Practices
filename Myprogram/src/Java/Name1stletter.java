package Java;

public class Name1stletter {

	public static void main(String[] args) {
//	    String s="Ashish Ashokrao Kawale";
//	    String[] words=s.split(" ");
//	    String temp="";
//        for(int i=0;i<words.length;i++) {
//          char ch=words[i].charAt(0);
//	    temp=temp+ch+".";
//	}
//    	System.out.println(temp);
	
		String A="Ashish Ashokrao kawale";
		String[] Cst=A.split(" ");
		String Firstletter=" ";
		for(int i=0;i<Cst.length;i++) {
			char ch=Cst[i].charAt(0);
		  Firstletter=Firstletter+ch+".";
		}
		System.out.println(Firstletter);
    }
    	
}
