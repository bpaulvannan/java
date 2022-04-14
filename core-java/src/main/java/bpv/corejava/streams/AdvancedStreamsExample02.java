package bpv.corejava.streams;

import bpv.corejava.data.ExampleData;
import bpv.corejava.data.Product;

import java.math.BigDecimal;
import java.util.List;

public class AdvancedStreamsExample02 {
    public static void main(String[] args){
        List<Product> products = ExampleData.products();
        products.stream()
                .map(Product::getPrice)
                .reduce(BigDecimal::add)
                .ifPresent(System.out::println);


        System.out.println(
                products.stream()
                        .map(Product::getPrice)
                        .reduce(BigDecimal.ZERO,BigDecimal::add)
        );

        System.out.println(products.stream()
                .reduce(BigDecimal.ZERO, (r,p) -> r.add(p.getPrice()), BigDecimal::add));
    }
}
