import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount in USD: ");
        double usd = scanner.nextDouble();

        System.out.println("Enter the conversion rate to CAD: ");
        double cadConversionRate = scanner.nextDouble();

        System.out.println("Enter the conversion rate to EUR: ");
        double eurConversionRate = scanner.nextDouble();

        double cad = usd * cadConversionRate;
        double eur = usd * eurConversionRate;

        System.out.println("The amount in CAD is: " + cad);
        System.out.println("The amount in EUR is: " + eur);
    }
}