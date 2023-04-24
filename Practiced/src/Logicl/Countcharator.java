package Logicl;

public class Countcharator {

	public static void main(String[] args) {
		String st="Hello good night to every one";
		int Totalcha=st.length();
		int Totalnoafterremoving=st.replace("o", "").length();
         int Repitedeno=Totalcha-Totalnoafterremoving;
		System.out.println("Toala repited char E :"+Repitedeno);
	}

}
