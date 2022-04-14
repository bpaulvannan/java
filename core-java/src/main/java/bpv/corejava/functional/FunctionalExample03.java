package bpv.corejava.functional;

import bpv.corejava.data.Category;
import bpv.corejava.data.ExampleData;
import bpv.corejava.data.Product;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FunctionalExample03 {

    private static Optional<Product> findProduct(List<Product> products, Predicate<Product> predicate){
        return products.stream().filter(p->predicate.test(p)).findFirst();
    }

    public static void main(String[] args){
        List<Product> products = ExampleData.products();
        findProduct(products, p -> p.getCategory() == Category.FOOD)
                .map(p -> p.getPrice())
                .ifPresent(System.out::println);

    }
}
