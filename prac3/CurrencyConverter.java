package prac3;

public class CurrencyConverter {
    private double exchangeRate;

    public CurrencyConverter(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double convertToUSD(double amountInEUR) {
        return amountInEUR * exchangeRate;
    }

    public double convertToEUR(double amountInUSD) {
        return amountInUSD / exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter(1.07);

        double amountInEUR = 100.0;
        double amountInUSD = converter.convertToUSD(amountInEUR);
        System.out.println(amountInEUR + " EUR = " + amountInUSD + " USD");

        double amountInUSD2 = 80.0;
        double amountInEUR2 = converter.convertToEUR(amountInUSD2);
        System.out.println(amountInUSD2 + " USD = " + amountInEUR2 + " EUR");

        // Изменяем обменный курс
        converter.setExchangeRate(1.1);

        double amountInEUR3 = 120.0;
        double amountInUSD3 = converter.convertToUSD(amountInEUR3);
        System.out.println(amountInEUR3 + " EUR = " + amountInUSD3 + " USD");
    }
}
