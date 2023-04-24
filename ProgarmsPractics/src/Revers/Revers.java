package Revers;

public class Revers {

	public static void main(String[] args) {
		String s="Ashish Ashokrao kawale";
        String []words= s.split(" ");
        String rev ="";
        for(String a:words) {
        String reword="";
        for(int i=a.length()-1;i>=0;i--) {
        	reword=reword+a.charAt(i);
        }
        rev=rev+reword+(" ");
        }
        System.out.println(rev);
	}

}
