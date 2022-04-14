package bpv.corejava.streams;

import bpv.corejava.data.Category;
import bpv.corejava.data.ExampleData;
import bpv.corejava.data.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Consumer;

public class StreamsExample05 {
    public static void main(String[] args){
        List<Product> products = ExampleData.products();

        Consumer<Object> print = p -> System.out.println(p);

        products.stream()
                .filter(p -> p.getCategory() == Category.FOOD)
                .findAny()
                .ifPresent(print);

        products.stream()
                .filter(p -> p.getCategory() == Category.OFFICE)
                .findFirst()
                .ifPresent(print);

        print.accept(products.stream()
                .allMatch(p -> p.getPrice().compareTo(new BigDecimal("0.00")) > 0));

        print.accept(products.stream()
                .noneMatch(p -> p.getPrice().compareTo(new BigDecimal("0.00")) < 0));

        print.accept(products.stream()
                .anyMatch(p -> p.getPrice().compareTo(new BigDecimal("0.00")) < 0));
    }
}
