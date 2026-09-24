import java.util.Scanner;

public class IT22574268Lab3Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double kg = scanner.nextDouble();

        double totalAmount = pricePerKg * kg;

        System.out.println("The total amount is: " + totalAmount);

        scanner.close();
    }
}