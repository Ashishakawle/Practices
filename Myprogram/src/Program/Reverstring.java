package Program;

public class Reverstring {

 public static void main(String[] args) {
		String s="manoj is clever boy";
        String[] worlds=s.split(" ");
		String Reversed="";
		for(String a:worlds) {
			String Revw=" ";
		for(int i=a.length()-1;i>=0;i--) {
			Revw=Revw+a.charAt(i);
		}
		Reversed=Revw+Reversed+(" ");
		}
		System.out.println(Reversed);
	}
}
