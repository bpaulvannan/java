package bpv.corejava.streams;

import bpv.corejava.data.Category;
import bpv.corejava.data.ExampleData;
import bpv.corejava.data.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvancedStreamsExample04 {
    public static void main(String[] args){
        List<Product> products = ExampleData.products();

        Map<Category, BigDecimal> totalPerCategory = products.stream()
                .collect(Collectors.toMap(
                        Product::getCategory, //Key Mapper
                        Product::getPrice,    //Value Mapper
                        BigDecimal::add));    //Merger

        System.out.println(totalPerCategory);
    }
}
