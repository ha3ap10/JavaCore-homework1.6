public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.divide.apply(a, b);

//        int d = calc.abs.apply(-10);
//
//        boolean e = calc.isPositive.test(-10);
//        boolean f = calc.isPositive.test(10);

        calc.println.accept(c);
//        calc.println.accept(d);

    }
}
