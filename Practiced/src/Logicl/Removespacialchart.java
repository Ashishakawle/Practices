package Logicl;

public class Removespacialchart {

	public static void main(String[] args) {
		String s="ashsish@#$ kawale@*&^ no";
           s=s.replaceAll("[^a-zA-Z0-9]"," ");
           System.out.println(s);
	}

}
