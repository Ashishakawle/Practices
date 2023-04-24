package StringLogic;

public class ReplaseWord {

	public static void main(String[] args) {
		String S="ashish not good boy";
		String[]Word=S.split(" ");
        for(int i=0;i<Word.length;i++) {
        if(Word[i].equals("not")) {
        	Word[i]="good";
        }
        System.out.println(Word[i]);
        }	}
}
