package bpv.corejava.streams;

import bpv.corejava.data.ExampleData;
import bpv.corejava.data.Product;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.DoubleStream;

public class AdvancedStreamsExample07 {
    public static void main(String[] args){
        List<Product> products = ExampleData.products();
        
        DoubleStream prices = products.stream()
                .mapToDouble(p -> p.getPrice().doubleValue())
                ;

        System.out.println(prices.sum());

        DoubleSummaryStatistics stats = products.stream()
                .mapToDouble(p -> p.getPrice().doubleValue()).summaryStatistics();

        System.out.println(stats);
    }
}
