public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum: " + calculator.add(5, 3));
        System.out.println("Difference: " + calculator.subtract(5, 3));
    }
}
