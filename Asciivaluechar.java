package Technicalproblem;

import java.util.Scanner;

public class Asciivaluechar {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ascii value: ");
        int ascii = sc.nextInt();
        printChar(ascii);
        sc.close();
    }
    public static void printChar(int ascii) {
        char ch = (char) ascii;
        System.out.println("Character for ASCII value " + ascii + " is: " + ch);
    }
}
	
	

	