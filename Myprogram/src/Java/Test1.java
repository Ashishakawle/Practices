package Java;

public class Test1 {

	public static void main(String[] args) {
		  String s= "ashish kawale";
		  String[] sc=s.split(" ");
		 for(String a:sc) {
		String	d=a.substring(0,a.length()-1)+a.substring(5).toUpperCase();
		System.out.print(d+" ");
		 }
  	}

} 
