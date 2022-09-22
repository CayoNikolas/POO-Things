import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args)  throws Exception{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o preoço atual do dólar? ");
        double dollarPrice = sc.nextDouble();
        System.out.println("Quantos dólares você quer comprar? ");
        double amount = sc.nextDouble();

        double realAmount = CurrencyConverter.dollarToReal(amount, dollarPrice);
        System.out.printf("O total de reais para comprar essa quantida de dólares é %.2f%n", realAmount);
        sc.close();
    }
}
