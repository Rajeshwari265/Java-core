package Technicalproblem;

public class CapitalAtoZ {

	public static void main(String[] args) {
			 printLetters();
	    }
	    static void printLetters() {
	        for(char ch = 'A'; ch <= 'Z'; ch++) {
	            showAscii(ch);
	        }
	    }
	    static void showAscii(char ch) {
	        int ascii = ch;
	        System.out.println(ch + " = " + ascii);
		}


}
