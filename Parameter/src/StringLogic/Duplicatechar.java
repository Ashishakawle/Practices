package StringLogic;

public class Duplicatechar {
	
	public static void main(String[] args) {
	String nm="ashish ashokrao kawale ";
	char []snm=nm.toCharArray();
	int count;
	for(int i=0;i<nm.length();i++) {
	  count=1;
	 for(int j=i+1;j<nm.length();j++) {
	  if(snm[i]==snm[j] && snm[j]!=' ') {
		  count++;
		  snm[j]='0';
    }
   }
	if(count>1 && snm[i]!='0') {
	  System.out.println(snm[i]+"==>"+count);
		
   }
  }
 }
}
