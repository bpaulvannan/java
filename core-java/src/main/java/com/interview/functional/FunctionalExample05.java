package com.interview.functional;

import com.interview.data.Category;
import com.interview.data.ExampleData;
import com.interview.data.Product;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalExample05 {

    private static Optional<Product> findProduct(List<Product> products, Predicate<Product> predicate){
        return products.stream().filter(p->predicate.test(p)).findFirst();
    }

    public static void main(String[] args){
        List<Product> products = ExampleData.products();

        Predicate<Product> isFood = p -> p.getCategory() == Category.FOOD;
        Predicate<Product> isCheap = p -> p.getPrice().compareTo(new BigDecimal("5.0")) > 0;

        Function<Product, BigDecimal> getPrice = Product::getPrice;
        Function<BigDecimal,String> formatPrice = price -> price.setScale(2, RoundingMode.HALF_UP).toString();

        findProduct(products, isFood.and(isCheap))
                .map(getPrice.andThen(formatPrice))
                .ifPresent(System.out::println);

    }
}
