package com.interview.streams;

import com.interview.data.ExampleData;
import com.interview.data.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AdvancedStreamsExample06 {
    public static void main(String[] args){
        List<Product> products = ExampleData.products();

        System.out.println(
                products.parallelStream().collect(Collectors.groupingByConcurrent(Product::getCategory))
        );
    }
}
