package bpv.corejava.lambdas;

import bpv.corejava.data.ExampleData;
import bpv.corejava.data.Product;

import java.math.BigDecimal;
import java.util.List;

public class LambdasExample04 {
    private static boolean isExpensive(Product product){
        return product.getPrice().compareTo(new BigDecimal("5.00"))>0;
    }
    public static void main(String[] args){
        List<Product> products = ExampleData.products();
        products.forEach(System.out::println);
        products.stream().map(Product::getName).forEach(System.out::println);
    }
}
