package bpv.corejava.streams;

import java.math.BigInteger;
import java.util.UUID;
import java.util.stream.Stream;

public class AdvancedStreamsExample01 {
    public static void main(String[] args){
        Stream<UUID> uuids = Stream.generate(UUID::randomUUID);
        uuids.limit(10).forEach(System.out::println);

        Stream<BigInteger> powersOfTwo = Stream.iterate(BigInteger.ONE, n -> n.multiply(BigInteger.valueOf(2l)));
        powersOfTwo.limit(10).forEach(System.out::println);

        Stream.Builder<String> builder = Stream.builder();
        builder.add("A").add("B").add("C");

        builder.build().forEach(System.out::println);
    }
}
