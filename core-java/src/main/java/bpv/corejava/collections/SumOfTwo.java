package bpv.corejava.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Find if two numbers are available where
 * Sum of a number from list 1  and a number from list 2 is equal to sumToFind
 *
 *
 */
public class SumOfTwo {

    /**
     * This implementation requires to additional memory for hash map
     *
     * For each number in list 1, what is the number required to get the sumToFind
     * Save it in a hash map
     *
     * For each number in list 2 find if the number is available in the hash map
     *
     * If found then return true otherwise return false
     *
     * @param l1
     * @param l2
     * @param sumToFind
     * @return
     */
    public static boolean isAvailable(List<Integer> l1, List<Integer> l2, Integer sumToFind){
        Map<Integer,Integer> possibleNumbers = new HashMap<>();
        l1.stream().forEach(i -> possibleNumbers.put(i, i-sumToFind));
        Integer numberFound = l1.stream()
                                .filter(i -> possibleNumbers.get(i) != null)
                                .findAny()
                                .orElse(null);
        return numberFound != null;
    }
}
