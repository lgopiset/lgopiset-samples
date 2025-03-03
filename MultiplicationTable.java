public class MultiplicationTable {
    public static void printTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {
        int number = 5; // Change this number to print a different multiplication table
        printTable(number);
    }
}
