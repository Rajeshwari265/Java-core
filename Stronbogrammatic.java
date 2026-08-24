package Jvacore;
import java.util.HashMap;

public class Stronbogrammatic {
    public static boolean isStrobogrammatic(String s){
        HashMap<Character, Character> map = new HashMap<>();
        map.put('0','0');
        map.put('1','1');
        map.put('6','9');
        map.put('8','8');
        map.put('9','6');

        int l = 0;
        int r = s.length() - 1;
        while (l <= r) {
            Character rotated = map.get(s.charAt(l));
            if (!map.containsKey(s.charAt(l))) {
                return false;
            }
            if(s.charAt(l)!=map.get(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[]args){
String s="6810189";
boolean result =isStrobogrammatic(s);
System.out.println("result"+result);

    
}
}
