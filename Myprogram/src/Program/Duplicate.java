package Program;

public class Duplicate {

	public static void main(String[] args) {
		String S="Ashishsffffhs Kawaaale";
        char[] nm=S.toCharArray();
		int count;
		for(int i=0;i<S.length();i++) {
			count=1;
		for(int j=i+1;j<S.length();j++) {
		if(nm[i]==nm[j] && nm[j]!=' ') {
			count++;
			nm[j]='0';
		}	
	}
		if(count>1 && nm[i]!='0') {
		 System.out.println(nm[i]+"==>"+count);	
		
	}
}
		
		
		
		
	}

}
