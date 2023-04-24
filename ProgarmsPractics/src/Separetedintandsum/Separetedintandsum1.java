package Separetedintandsum;

public class Separetedintandsum1 {

	public static void main(String[] args) {
		String srt="kawale12ashish2022@gmail.com89";
        char[]ch=srt.toCharArray();
        int sum=0;
        for(int i=0;i<srt.length();i++) {
        if(Character.isDigit(ch[i])) {
        	int a=Integer.parseInt(String.valueOf(ch[i]));
        	sum=sum+a;
        }
        }
        System.out.println(sum);
	}
}
