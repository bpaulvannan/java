package bpv.corejava.lambdas;

import bpv.corejava.data.ExampleData;
import bpv.corejava.data.Product;

import java.util.List;

public class LambdasExample01 {
    public static void main(String[] args){
        List<Product> products = ExampleData.products();
        products.sort((p1,p2) -> p1.getPrice().compareTo(p2.getPrice()));
        products.forEach(System.out::println);
    }
}
