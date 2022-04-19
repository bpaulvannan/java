package bpv.corejava.collections;

import java.util.Arrays;

public class RotateImage {
    public static int[][] rotate(int[][] input){
        int rows = input.length;
        int cols = input[0].length;
        print("before " , input);
        for(int r=0;r<rows;r++){
            for(int c=r+1;c<cols;c++){
                int n = input[r][c];
                input[r][c] = input[c][r];
                input[c][r] = n;
            }
        }

        int midCol = cols/2;
        for(int r=0; r<rows;r++){
            for(int c=0;c<midCol;c++){
                int n = input[r][c];
                int newC = cols - c - 1;
                input[r][c] = input[r][newC];
                input[r][newC] = n;
            }
        }
        print(  " after ", input);
        return input;
    }

    private static void print(String msg, int[][] input){
        System.out.println(msg);
        for(int r=0;r<input.length;r++){
            System.out.println(Arrays.toString(input[r]));
        }
    }
}
