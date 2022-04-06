package com.interview.functional;

import com.interview.data.Category;
import com.interview.data.ExampleData;
import com.interview.data.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionalExample04 {


    public static void main(String[] args){
        List<Product> products = ExampleData.products();

        Map<Category,List<Product>> productsByCategory = new HashMap<>();
        products.forEach(p -> productsByCategory.computeIfAbsent(p.getCategory(), c -> new ArrayList<>()).add(p));
        productsByCategory.forEach((p,ps) -> System.out.println(p + "=" + ps));
    }
}
