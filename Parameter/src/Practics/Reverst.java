package Practics;

public class Reverst {

	public static void main(String[] args) {
		String st="ashish ashokrao kawale";
		String[] Word=st.split("");
		String Rw="";
		for(String D:Word) {
			String Rsw="";
		for(int i=0;i<D.length();i++) {
			Rsw=Rsw+D.charAt(i);
		}
		Rw=Rsw+Rw+" ";
		}
        System.out.println(Rw);
	}
}
