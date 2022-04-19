package bpv.corejava.collectiions;

import bpv.corejava.collections.RotateImage;
import org.junit.Test;

import java.security.SecureRandom;

public class RotateImageTest {
    @Test
    public void test(){
        for(int i=0;i<10;i++){
            RotateImage.rotate(buildInput(i+1));
        }

    }

    private int[][] buildInput(int size){
        int[][] output = new int[size][size];
        for(int r=0;r<size;r++){
            for(int c=0;c<size;c++){
                output[r][c] = new SecureRandom().nextInt(1000);
            }
        }
        return output;
    }
}
