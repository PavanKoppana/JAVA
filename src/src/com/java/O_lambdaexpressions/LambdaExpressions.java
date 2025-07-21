package com.java.O_lambdaexpressions;

import java.util.function.*;

public class LambdaExpressions {

    public static void main(String[] args) {
        funtionalInterface sum = (a, b) -> {

            System.out.println("Sum is: " + (a + b));
            return a + b;
        };

        System.out.println(sum.operation(10, 11));
        sum.hello();
        functionalinrefacestypes();
    }

    static void functionalinrefacestypes() {

        Consumer<Integer> sum = (a) -> System.out.println(a);
        sum.accept(10);

        BiConsumer<Integer, Integer> add = (a, b) -> System.out.println(a + b);
        add.accept(10, 17);


        Function<Integer, Integer> additionandreturn = (a) ->
        {System.out.println(a);
                return a + 1;};

        int x = additionandreturn.apply(2);
        System.out.println(x);


        BiFunction<Integer, Integer, Integer> addandreturn = (a, b) -> a + b;
        int y = addandreturn.apply(10, 44);
        System.out.println(y);

        Predicate<Integer> compare = (i) -> (i == 9);
        System.out.println(compare.test(7));

    }

}
