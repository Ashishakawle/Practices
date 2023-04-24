package Practics;

public class AReverscharat {

	public static void main(String[] args) {
		int count=0;
		String Name="i Am Awwsessssomees";
         char String[]=Name.toCharArray();
         for(int i=0;i<String.length;i++) {
        	 count=1;
         for(int j=i+1;j<String.length;j++) {
        	if(String[i]==String[j]&&String[i]!=' ') {
        		count++;	
        		String[j]='0';
        	}
        }
        if(count>1&&String[i]!='0') {
        	System.out.println(String[i]+" "+count);
        }
         }  
         
         String name="I am awwwwesome";
 		//name=name.replace(" ", "");
 		int counot;
 		char string[]=name.toCharArray();
 		for(int i=0;i<string.length;i++) {
 			counot=1;
 			for(int j=i+1;j<string.length;j++) {
 				if(string[i]==string[j]&& string[i]!=' ') {
 					counot++;
 					string[j]='0';
 				}
 			// I  a m  a w w w w e  s  o  m  e
 			// 0 12	3 45 6 7 8 9 10 11 12 13 14
 				
 			}
 			if(count>1&& string[i]!='0') {
 				System.out.println(string[i]+" "+counot);
 			}
 		}
	}
}
