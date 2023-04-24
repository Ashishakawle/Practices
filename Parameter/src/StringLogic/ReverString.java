package StringLogic;

public class ReverString {

	public static void main(String[] args) {
		String Sd="Ashish kawale";
		String []World=Sd.split(" ");
		String Rworld="";
		for(String R:World) {
		 String Rev=" ";
		for(int i=R.length()-1;i>=0;i--) {
			Rev=Rev+R.charAt(i);
		}
		Rworld=Rev+Rworld+" ";
		}
       System.out.println(Rworld);
	}

}
