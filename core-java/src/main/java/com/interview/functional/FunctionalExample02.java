package com.interview.functional;

import com.interview.data.Category;
import com.interview.data.ExampleData;
import com.interview.data.Product;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalExample02 {

    private static Product findProduct(List<Product> products, Predicate<Product> predicate){
        return products.stream().filter(p->predicate.test(p)).findFirst().orElse(null);
    }

    public static void main(String[] args){
        List<Product> products = ExampleData.products();
        System.out.println(findProduct(products, p -> p.getCategory() == Category.FOOD));

        System.out.println(findProduct(products, p -> "Unknown".equalsIgnoreCase(p.getName())));
    }
}
