import java.util.Scanner;

public class IT22574268Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double kg = scanner.nextDouble();

        double totalAmount = pricePerKg * kg;
        double discountedTotal = totalAmount * 0.90; // 10% discount

        System.out.println("The total amount with 10% discount is: " + discountedTotal);

        scanner.close();
    }
}