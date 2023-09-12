package prac3;

import java.util.Scanner;

public class OnlineStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] products = {"Товар 1", "Товар 2", "Товар 3"};
        double[] pricesInEUR = {10.0, 20.0, 30.0};

        double exchangeRate = 1.07;

        System.out.println("Добро пожаловать в наш интернет-магазин!");
        System.out.println("Выберите товар для покупки:");

        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " - " + pricesInEUR[i] + " EUR");
        }

        System.out.print("Введите номер товара: ");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= products.length) {
            System.out.print("Введите количество: ");
            int quantity = scanner.nextInt();

            double totalPriceInEUR = pricesInEUR[choice - 1] * quantity;
            double totalPriceInUSD = totalPriceInEUR * exchangeRate;

            System.out.println("Итого к оплате:");
            System.out.println("Ваш заказ: " + products[choice - 1]);
            System.out.println("Количество: " + quantity);
            System.out.println("Общая стоимость в EUR: " + totalPriceInEUR + " EUR");
            System.out.println("Общая стоимость в USD: " + totalPriceInUSD + " USD");
        } else {
            System.out.println("Неверный выбор товара.");
        }

        scanner.close();
    }
}
