import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

/*
    на ноль делить нельзя, тернарным оператором, как я понимаю, можно сделать так:
    BinaryOperator<Integer> divide = (x, y) -> y != 0 ? x / y : 0;
    но, так как должен вернуться Integer, это не совсем правильно
    ещё, как вариант, можно пытаться ловить ошибку try catch
*/

    BinaryOperator<Integer> divide = (x, y) -> {
        if (y != 0) {
            return x / y;
        } else {
            throw new ArithmeticException("На ноль делить нельзя!");
        }
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
