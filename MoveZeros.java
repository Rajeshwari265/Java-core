package Jvacore;
import java.util.Scanner;

public class MoveZeros {
    public static void moveZeros(int[] arr) {
        int insertPos = 0;

        
        for (int num : arr) {
            if (num != 0) {
                arr[insertPos] = num;
                insertPos++;
            }
        }

        
        while (insertPos < arr.length) {
            arr[insertPos] = 0;
            insertPos++;
        }
    }

    public static void main(String[] args) {
        
        int[] arr = {4, 0, 5, 0, 1, 9};
        moveZeros(arr);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}

