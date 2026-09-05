package Jvacore;

import java.util.Scanner;

public class SundayCounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String startDay = sc.next();
            int totalDays = sc.nextInt();
            String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
            int startIdx = -1;
            
            for (int i = 0; i < days.length; i++) {
                if (days[i].equalsIgnoreCase(startDay)) {
                    startIdx = i;
                    break;
                }
            }
            
            if (startIdx == -1 || totalDays <= 0) {
                System.out.println("INVALID INPUT");
                return;
            }
            int daysToFirstSunday = (7 - startIdx) % 7;
            int sundays = 0;
            
            if (totalDays > daysToFirstSunday) {
                
                sundays = 1 + (totalDays - daysToFirstSunday - 1) / 7;
            }
            
            System.out.println(sundays);
        }
        sc.close();
    }
}
