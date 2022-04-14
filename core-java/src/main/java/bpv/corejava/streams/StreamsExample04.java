package bpv.corejava.streams;

import bpv.corejava.data.ExampleData;
import bpv.corejava.data.Product;

import java.util.List;
import java.util.regex.Pattern;

public class StreamsExample04 {
    public static void main(String[] args){
        List<Product> products = ExampleData.products();
        Pattern spaces = Pattern.compile("\\s+");
        products
                .stream()
                .flatMap(p ->  spaces.splitAsStream(p.getName()))
                .forEach(System.out::println);
    }
}
