package bpv.corejava.lambdas;

import bpv.corejava.data.ExampleData;
import bpv.corejava.data.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class LambdasExample03 {
    interface ProductFilter{
        boolean accept(Product product);
    }
    public static void main(String[] args){
        List<Product> products = ExampleData.products();

        final BigDecimal priceLimit = new BigDecimal("5.00");
        ProductFilter productFilter = p -> p.getPrice().compareTo(priceLimit)<0;

        long cheapProductsCount = products
                .stream()
                .filter(p -> productFilter.accept(p))
                .collect(Collectors.toList())
                .stream()
                .count();

        System.out.println(cheapProductsCount);
    }
}
