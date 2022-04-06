package com.interview.lambdas;

import com.interview.data.Category;
import com.interview.data.Product;

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
