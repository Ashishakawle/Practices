package Java;



public class rev {

	public static void main(String[] args) {
		String s= "ashish";
		String d= " kawale";
		System.out.println(d+" "+s);
//          s=s+d;
//        String b=s.substring(0,s.length()-d.length());
//           String a=s.substring(d.length());
//           System.out.println(a+" "+b);
		String a=s;
		  s=d;
		  d=a;
		  System.out.println(s+" "+d);

	}

}
