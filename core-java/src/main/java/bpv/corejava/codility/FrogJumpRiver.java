package bpv.corejava.codility;

import java.util.HashSet;
import java.util.Set;

public class FrogJumpRiver {
    public int solution(int X, int[] A) {
        // write your code in Java SE
        Set<Integer> tracker = new HashSet<>();
        for(int i = 0; i < A.length;i++){
            int n = A[i];
            if(n <= X) tracker.add(n);
            if(tracker.size() == X) return i;
        }
        return -1;
    }
}
