package logicalprogram;

public class Middelstring {

	public static void main(String[] args) {	
		    String str="Ashisha";
		        int position;
		        int length;
		        if (str.length() % 2 == 0)
		        {
		            position = str.length() / 2 - 1;
		            length = 2;
		        }
		        else
		        {
		            position = str.length() / 2;
		            length = 1;
		        }
		       String s= str.substring(position, position + length);
		       System.out.println(s);
		    }
		}