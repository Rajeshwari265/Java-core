package Technicalproblem;
import java.util.Scanner;
public class Stringtointegerasciivalue {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the String:");
    	String str = sc.nextLine();
    	int num = 0;
    	int temp = 0;
    	for (int i = 0; i < str.length(); i++) {
    	char ch = str.charAt(i);
    	System.out.println("Character: " + ch + "  ASCII value: " + (int) ch);
    	 temp = ch - '0';    
    	num = num * 10 + temp;
    	        }
    	System.out.println("Final Integer Value is: " + num);
    	        sc.close();
    	    }
    	}