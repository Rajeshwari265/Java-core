package Technicalproblem;
import java.util.Scanner;
public class Integertostring {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
   System.out.print("Enter a number: ");
   int num = sc.nextInt();
     String str = "";
     int temp = num;
     while (temp > 0) {
         int digit = temp % 10;          
         char ch = (char) (digit + 48); 
         System.out.println(
             "Digit: " + digit +
             "ASCII value: " + (int) ch +
             "Character: " + ch);
         str = ch + str;                 
         temp = temp / 10;
     }
     System.out.println("Final String Value: " + str);
     sc.close();
 }
}