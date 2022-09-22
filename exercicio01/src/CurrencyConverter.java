public class CurrencyConverter {
    
    public static double dollarToReal(double amount, double dollarPrice){
        double conversao = amount * dollarPrice;
        double realAmount = conversao + conversao * 0.06;

        return realAmount;
    }

}
