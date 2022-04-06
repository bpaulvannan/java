package com.interview.data;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class ExampleData {
    public static final List<Product> products() {
        return Arrays.asList(
                new Product(Category.FOOD,"Oranges",new BigDecimal(1.65)),
                new Product(Category.FOOD,"Apples",new BigDecimal(6.65)),
                new Product(Category.UTENSILS,"Plates",new BigDecimal(3.65)),
                new Product(Category.UTENSILS,"Glasses",new BigDecimal(17.65)),
                new Product(Category.CLEANING,"Detergent",new BigDecimal(16.65)),
                new Product(Category.OFFICE,"Chairs",new BigDecimal(132.65)),
                new Product(Category.OFFICE,"Tables",new BigDecimal(107.65)),
                new Product(Category.CLEANING,"Washing Liquid",new BigDecimal(16.65))
        );
    }
}
