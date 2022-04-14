package bpv.corejava.streams;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample01 {
    public static void main(String[] args){
        Predicate<Integer> isEven = i -> i%2==0;

        Arrays.asList(1,2,3,4,5,6,7,8)
                .stream()
                .filter(isEven)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
