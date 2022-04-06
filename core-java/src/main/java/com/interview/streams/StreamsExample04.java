package com.interview.streams;

import com.interview.data.ExampleData;
import com.interview.data.Product;

import java.security.SecureRandom;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

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
