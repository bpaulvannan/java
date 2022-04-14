package bpv.corejava.lambdas;

import bpv.corejava.data.Category;
import bpv.corejava.data.Product;

import java.math.BigDecimal;

public class LambdasExample05 {
    private interface ProductFacatory{
        Product create(Category product, String name, BigDecimal price);
    }
    public static void main(String[] args){
        ProductFacatory facatory = Product::new;
        facatory.create(Category.OFFICE,"Laptop",new BigDecimal("1200.00"));
        System.out.println(facatory);
    }
}
