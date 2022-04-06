package com.interview.streams;

import com.interview.data.ExampleData;
import com.interview.data.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class AdvancedStreamsExample05 {
    public static void main(String[] args){
        List<Product> products = ExampleData.products();

        System.out.println(products.stream()
                .collect(Collectors.groupingBy(Product::getCategory)));

        System.out.println(products.stream()
                .collect(Collectors.groupingBy(Product::getCategory,Collectors.mapping(Product::getName,Collectors.toList())))
        );

        System.out.println(products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.mapping(Product::getPrice,Collectors.reducing(BigDecimal.ZERO,BigDecimal::add))))
        );
    }
}
