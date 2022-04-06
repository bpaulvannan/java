package com.interview.streams;

import com.interview.data.ExampleData;
import com.interview.data.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AdvancedStreamsExample03 {
    public static void main(String[] args){
        List<Product> products = ExampleData.products();

        System.out.println(products.stream()
                .reduce(new ArrayList<>(),(l,p)->{
                    ArrayList newList = new ArrayList(l);
                    newList.add(p.getName());
                    return newList;
                },(l1,l2) -> {
                    ArrayList newList = new ArrayList(l1);
                    newList.addAll(l2);
                    return newList;
                }));

        products.stream()
                .collect(ArrayList::new,(l,p)->l.add(p.getName()),ArrayList::addAll)
                .forEach(System.out::println);
    }
}
