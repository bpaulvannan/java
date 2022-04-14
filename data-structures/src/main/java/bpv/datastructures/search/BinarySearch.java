package bpv.datastructures.search;

import bpv.datastructures.data.DataProvider;

import java.util.Collections;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args){
        List<Integer> numbers = DataProvider.intList(25);
        Integer numToFind = 50;
        System.out.println("Numbers=" + numbers);
        System.out.println("Number to find=" + numToFind);
        System.out.println("Is Found? " + isPresent(numbers,numToFind));
    }

    private static boolean isPresent(List<Integer> numbers, int numToFind){
        Collections.sort(numbers);
        int left = 0;
        int right = numbers.size()-1;
        while(left <= right){
            int mid = (left + right)/2;
            int num = numbers.get(mid);
            if(num < numToFind){
                left = mid + 1;
            }else if(num > numToFind){
                right = mid - 1;
            }else{
                return true;
            }
        }
        return false;
    }
}
