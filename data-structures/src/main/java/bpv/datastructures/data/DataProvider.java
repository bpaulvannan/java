package bpv.datastructures.data;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public final class DataProvider {
    private DataProvider(){}

    public static List<Integer> intList(int size){
        int count = 0;
        List<Integer> values = new ArrayList<>();
        while(values.size() < size){
            IntStream intProvider = new SecureRandom().ints(1,100);
            values.add(count,intProvider.findAny().orElse(0));
        }
        return values;
    }
}
