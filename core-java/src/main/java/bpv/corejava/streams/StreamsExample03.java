package bpv.corejava.streams;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class StreamsExample03 {
    public static void main(String[] args){
        IntStream dice = new SecureRandom().ints(1,7);
        System.out.println(dice.findFirst().orElse(0));
    }
}
