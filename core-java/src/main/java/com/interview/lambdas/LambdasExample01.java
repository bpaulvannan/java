package com.interview.lambdas;

import com.interview.data.ExampleData;
import com.interview.data.Product;

import java.util.List;

public class LambdasExample01 {
    public static void main(String[] args){
        List<Product> products = ExampleData.products();
        products.sort((p1,p2) -> p1.getPrice().compareTo(p2.getPrice()));
        products.forEach(System.out::println);
    }
}
