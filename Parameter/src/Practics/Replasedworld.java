package Practics;

public class Replasedworld {

	public static void main(String[] args) {
		String Sd="ashish is good boy";
         String []world=Sd.split(" "); 
         for(int i=0;i<world.length;i++) { 
        	if(world[i].equals("is")) {
        		world[i]="was";
        	}
         } 
         System.out.println(world);
	}
}
