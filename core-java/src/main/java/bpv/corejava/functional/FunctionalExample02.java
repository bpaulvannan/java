package bpv.corejava.functional;

import bpv.corejava.data.Category;
import bpv.corejava.data.ExampleData;
import bpv.corejava.data.Product;

import java.util.List;
import java.util.function.Predicate;

public class FunctionalExample02 {

    private static Product findProduct(List<Product> products, Predicate<Product> predicate){
        return products.stream().filter(p->predicate.test(p)).findFirst().orElse(null);
    }

    public static void main(String[] args){
        List<Product> products = ExampleData.products();
        System.out.println(findProduct(products, p -> p.getCategory() == Category.FOOD));

        System.out.println(findProduct(products, p -> "Unknown".equalsIgnoreCase(p.getName())));
    }
}
