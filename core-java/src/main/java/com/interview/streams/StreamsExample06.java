package com.interview.streams;

import com.interview.data.Category;
import com.interview.data.ExampleData;
import com.interview.data.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamsExample06 {
    public static void main(String[] args){
        List<Product> products = ExampleData.products();

        Consumer<Object> print = p -> System.out.println(p);

        print.accept(products.stream()
                .filter(p -> p.getCategory() == Category.FOOD)
                .map(p -> p.getName())
                .collect(Collectors.toList()));

        print.accept(products.stream().map(Product::getCategory)
                .distinct()
                .map(Category::name)
                .collect(Collectors.joining("; ")));
    }
}
