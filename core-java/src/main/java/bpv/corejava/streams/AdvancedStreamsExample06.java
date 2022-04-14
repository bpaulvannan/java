package bpv.corejava.streams;

import bpv.corejava.data.ExampleData;
import bpv.corejava.data.Product;

import java.util.List;
import java.util.stream.Collectors;

public class AdvancedStreamsExample06 {
    public static void main(String[] args){
        List<Product> products = ExampleData.products();

        System.out.println(
                products.parallelStream().collect(Collectors.groupingByConcurrent(Product::getCategory))
        );
    }
}
