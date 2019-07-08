public class CalculationTest {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        int number = 4;
        System.out.println(calculation.isEven(number));
        System.out.println(calculation.isOdd(number));
        System.out.println(calculation.circleField(number));
        System.out.println(calculation.power(number));
    }
}
