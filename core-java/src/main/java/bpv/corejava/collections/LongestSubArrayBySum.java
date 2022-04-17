package bpv.corejava.collections;

import java.util.List;

/**
 * Scan numbers from left to right and sum it
 * if sum is greater than the sumToFind,
 * reduce the number at left pointer from the sum and move it by 1
 */
public class LongestSubArrayBySum {
    public static int[] find(List<Integer> list, Integer sumToFind){
        int sum = 0;
        Integer left = 0;
        Integer right = 0;
        int[] result = new int[]{};
       while(right < list.size()){
           sum = sum + list.get(right);
           while (left < right && sum > sumToFind){
               sum = sum - list.get(left);
               left ++;
           }
           if(sum == sumToFind && (result.length == 0 || right - left > result[1] - result[0])){
               result = new int[]{left+1,right+1};
           }
           right ++;
       }
        return result;
    }
}
