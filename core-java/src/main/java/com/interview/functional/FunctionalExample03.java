package com.interview.functional;

import com.interview.data.Category;
import com.interview.data.ExampleData;
import com.interview.data.Product;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FunctionalExample03 {

    private static Optional<Product> findProduct(List<Product> products, Predicate<Product> predicate){
        return products.stream().filter(p->predicate.test(p)).findFirst();
    }

    public static void main(String[] args){
        List<Product> products = ExampleData.products();
        findProduct(products, p -> p.getCategory() == Category.FOOD)
                .map(p -> p.getPrice())
                .ifPresent(System.out::println);

    }
}
