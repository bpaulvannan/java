package bpv.corejava.functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalExample01 {
    public static void main(String[] args){

        //Predicate
        Predicate<String> checkPolindrome = s -> s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
        Predicate<String> checkIsInteger = s -> {
            try{
                Integer.parseInt(s);
                return true;
            }catch (Exception e) {
                return false;
            }
        } ;

        System.out.println("Is Polindrome Malayalam " + checkPolindrome.test("Malayalam"));

        System.out.println("Is NOT Polindrome Tamil " + checkPolindrome.negate().test("Tamil"));

        System.out.println("Is Integer Polindrome 10101 " + checkPolindrome.and(checkIsInteger).test("10101"));

        Function<Integer,Integer> square = i -> i*i;

        Function<Integer,Integer> doubleIt = i -> i*2;

        System.out.println("Square of 5 is " + square.apply(5));

        System.out.println("Square and then double 5 " + square.andThen(doubleIt).apply(5));

        System.out.println("Square composing double of 5 " + square.compose(doubleIt).apply(5));

    }
}
