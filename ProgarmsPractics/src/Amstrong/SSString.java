package Amstrong;
public class SSString {

	public static void main(String[] args) {
	String s="Ashish Ashokrao Kawale 1992";
    int count=0;
    int count1=0;
    int count2=0;
	for(int i=0;i<s.length();i++) {
		
	if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
		count++;
	}
	if(s.charAt(i)>='a' && s.charAt(i)<='z') {
		count1++;
	}
	if(s.charAt(i)>='0' && s.charAt(i)<='9') {
		count2++;
	}
	}
	 System.out.println(" count of uperrcase"+"==>"+count);
	 System.out.println(" count of lowerrcase"+"==>"+count1);
	 System.out.println(" count of Number"+"==>"+count2);
	}
}
