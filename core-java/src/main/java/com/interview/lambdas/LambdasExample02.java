package com.interview.lambdas;

import com.interview.data.ExampleData;
import com.interview.data.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class LambdasExample02 {
    interface ProductFilter{
        boolean accept(Product product);
    }
    public static void main(String[] args){
        List<Product> products = ExampleData.products();

        final BigDecimal priceLimit = new BigDecimal("5.00");
        ProductFilter productFilter = p -> p.getPrice().compareTo(priceLimit)<0;

        products
                .stream()
                .filter(p -> productFilter.accept(p))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
