package bpv.corejava.codility;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
    public int solution(int[] A) {
        Set<Integer> tracker = new HashSet<>();
        int max = 0;
        for(int n : A){
            if(n > 0){
                if(tracker.add(n)){
                    if(n > max) max = n;
                }

            }
        }
        if(tracker.size() == max) return max + 1;
        for(int i=1;i<=max;i++){
            if(tracker.add(i)) return i;
        }
        return 1;

    }
}
