package Program;

public class Duplicatestring {

	public static void main(String[] args) {
		
		String name="I amshsishsh kawale  awwwwesome";
		name=name.replace(" ", "");
		int count;
		char string[]=name.toCharArray();
		for(int i=0;i<string.length;i++) {
			count=1;
			for(int j=i+1;j<string.length;j++) {
				if(string[i]==string[j]&& string[i]!=' ') {
					count++;
					string[j]='0';
				}
			// I  a m  a w w w w e  s  o  m  e
			// 0 12	3 45 6 7 8 9 10 11 12 13 14
				
			}
			if(count>1&& string[i]!='0') {
				System.out.println(string[i]+":"+count);
				i+=(count-1);
			}
		}
	}

}
