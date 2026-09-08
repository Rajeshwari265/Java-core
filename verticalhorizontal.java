package Technicalproblem;
import java.util.Scanner;
public class verticalhorizontal {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Number:");
         int n = sc.nextInt();
         printVertical(n);
         printHorizontal(n);
     }
 

      static void printVertical(int n) {
         for (int i = 1; i <= n; i++) {
             System.out.println("*");
         }
     }
     static void printHorizontal(int n) {
         for (int i = 1; i <= n; i++) {
             System.out.print("* ");
         }
     }
 }