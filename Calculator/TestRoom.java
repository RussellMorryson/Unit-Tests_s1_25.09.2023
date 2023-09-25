package Calculator;

public class TestRoom {
    public static void main (String [] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.calculation(2, 2, '+'));
        System.out.println(calc.calculation(2, 2, '-'));
        System.out.println(calc.calculation(2, 2, '*'));
        System.out.println(calc.calculation(2, 2, '/'));
        //System.out.println(calc.calculation(2, 0, '/')); // Exception

        System.out.println(calc.squareRootExtraction(0));
        //System.out.println(calc.squareRootExtraction(-25)); // Exception
        System.out.println(calc.squareRootExtraction(1.44));
        System.out.println(calc.squareRootExtraction(25));

        System.out.println(calc.calculatingDiscount(1000.00, 25));
        //System.out.println(calc.calculatingDiscount(1000.00, -10)); // Exception
    }
}
