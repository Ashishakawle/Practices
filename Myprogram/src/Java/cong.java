package Java;

public class cong extends Abstractxc {

    String name="siddhevar"; int a=35;
    
	public cong(String name, int a) {
        super(name,a);
//     System.out.println("cong class "+name+" "+a);
	}
	public static void main(String[] args) {
		
		cong A = new cong("ashish ",18);
        
		System.out.print(A.name+"  "+A.a);
	}
}
