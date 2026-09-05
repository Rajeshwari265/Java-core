package Jvacore;

import java.util.Scanner;

public class Main {
    public static void solveVehicles(int v, int w) {
        
        if ((w % 2 != 0) || (w < 2) || (v >= w) || (v <= 0) || (w <= 0)) {
            System.out.println("INVALID INPUT");
            return;
        }

        
        int fw = (w - (2 * v)) / 2;
        int tw = v - fw;

        
        if (fw < 0 || tw < 0) {
            System.out.println("INVALID INPUT");
        } else {
            System.out.println("TWO-WHEELER = " + tw + ", FOUR-WHEELER = " + fw);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        if (sc.hasNextInt()) {
            int v = sc.nextInt();
            int w = sc.nextInt();
            
            solveVehicles(v, w);
        }
        
        sc.close();
    }
}
